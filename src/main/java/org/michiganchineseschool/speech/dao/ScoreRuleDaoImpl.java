package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ScoreRuleRowMapper;
import org.michiganchineseschool.speech.model.ScoreRule;

public class ScoreRuleDaoImpl extends BaseDaoImpl implements ScoreRuleDao {
	private final static String TableName = "SCORE_RULE";

	@Override
	public void insert(ScoreRule record) throws Exception {
		String sql = "INSERT INTO " + TableName + " ( NAME ) VALUES ( ? )";
		getJdbcTemplate().update(sql, new Object[] { record.getName() });
	}

	@Override
	public void update(ScoreRule record) throws Exception {
		String sql = "UPDATE " + TableName + " SET NAME = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(sql,
				new Object[] { record.getName(), record.getIdscore_rule() });
	}

	@Override
	public List<ScoreRule> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ScoreRuleRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}
}
