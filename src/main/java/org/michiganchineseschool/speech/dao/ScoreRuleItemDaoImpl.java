package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ScoreRuleItemRowMapper;
import org.michiganchineseschool.speech.model.ScoreRuleItem;

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
}
