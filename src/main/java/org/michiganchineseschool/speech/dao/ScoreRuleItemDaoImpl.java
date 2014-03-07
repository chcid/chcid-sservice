package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ScoreRuleItemRowMapper;
import org.michiganchineseschool.speech.model.ScoreRuleItem;
import org.springframework.dao.EmptyResultDataAccessException;

public class ScoreRuleItemDaoImpl extends BaseDaoImpl implements
		ScoreRuleItemDao {
	private final static String TableName = "SCORE_RULE_ITEM";

	@Override
	public void insert(ScoreRuleItem record) throws Exception {
		String sql = "INSERT INTO " + TableName
				+ " ( IDSCORE_RULE, NAME, WEIGHT ) VALUES ( ?, ?, ? )";
		getJdbcTemplate().update(
				sql,
				new Object[] { scoreRuleIdNullFilter(record), record.getName(),
						record.getWeight() });
	}

	private String scoreRuleIdNullFilter(ScoreRuleItem record) {
		try {
			return record.getScoreRule().getIdscore_rule();
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public void update(ScoreRuleItem record) throws Exception {
		String sql = "UPDATE " + TableName
				+ " SET IDSCORE_RULE = ?, NAME = ?, WEIGHT = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { scoreRuleIdNullFilter(record), record.getName(),
						record.getWeight(), record.getIdscore_rule_item() });
	}

	@Override
	public List<ScoreRuleItem> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ScoreRuleItemRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public ScoreRuleItem select(String id) throws Exception {
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql,
				new ScoreRuleItemRowMapper());
	}

	@Override
	public List<ScoreRuleItem> selectByContestGroup(String idcontestGroup)
			throws Exception {
		String sql = "select sri.* from speech.score_rule sr, speech.score_rule_item sri, speech.contest_group cg"
				+ " where sr.idscore_rule = sri.idscore_rule"
				+ " and cg.idscore_rule = sr.idscore_rule"
				+ " and cg.idcontest_group = " + idcontestGroup;
		return getJdbcTemplate().query(sql, new ScoreRuleItemRowMapper());
	}

	@Override
	public int getScoreByContestorRoleStaffScoreRuleItem(String idcontestor,
			String idrole, String idstaff, String idscoreRuleItem)
			throws Exception {
		String sql = "select ss.score from speech_score ss, contestor_score cs, judge j, role r, staff s,score_rule_item sri"
				+ " where ss.idcontestor_score = cs.idcontestor_score"
				+ " and ss.idscore_rule_item = sri.idscore_rule_item"
				+ " and cs.idjudge = j.idjudge"
				+ " and j.idstaff = s.idstaff"
				+ " and j.idrole = r.idrole"
				+ " and j.idrole = "
				+ idrole
				+ " and j.idstaff = "
				+ idstaff
				+ " and cs.idcontestor = "
				+ idcontestor
				+ " and sri.idscore_rule_item = "
				+ idscoreRuleItem;
		try {
			return getJdbcTemplate().queryForInt(sql);
		} catch (EmptyResultDataAccessException e) {
			// empty result is ok here
			return 0;
		}
	}
}
