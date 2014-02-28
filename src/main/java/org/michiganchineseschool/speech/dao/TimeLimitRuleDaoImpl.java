package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.TimeLimitRuleRowMapper;
import org.michiganchineseschool.speech.model.TimeLimitRule;

public class TimeLimitRuleDaoImpl extends BaseDaoImpl implements
		TimeLimitRuleDao {
	private final static String TableName = "TIME_LIMIT_RULE";

	@Override
	public void insert(TimeLimitRule record) throws Exception {
		String sql = "INSERT INTO " + TableName
				+ " ( MAX_LIMIT, MIN_LIMIT ) VALUES ( ?, ? )";
		getJdbcTemplate().update(sql,
				new Object[] { record.getMaxLimit(), record.getMinLimit() });
	}

	@Override
	public void update(TimeLimitRule record) throws Exception {
		String sql = "UPDATE " + TableName
				+ " SET MAX_LIMIT = ? , MIN_LIMIT = ? WHERE ID" + TableName
				+ " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getMaxLimit(), record.getMinLimit(),
						record.getIdtime_limit_rule() });
	}

	@Override
	public List<TimeLimitRule> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new TimeLimitRuleRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}
}
