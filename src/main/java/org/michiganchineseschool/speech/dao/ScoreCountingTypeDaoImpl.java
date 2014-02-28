package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ScoreCountingTypeRowMapper;
import org.michiganchineseschool.speech.model.ScoreCountingType;

public class ScoreCountingTypeDaoImpl extends BaseDaoImpl implements
		ScoreCountingTypeDao {
	private final static String TableName = "SCORE_COUNTING_TYPE";

	@Override
	public void insert(ScoreCountingType record) throws Exception {
		String sql = "INSERT INTO " + TableName + " ( NAME ) VALUES ( ? )";
		getJdbcTemplate().update(sql, new Object[] { record.getName() });
	}

	@Override
	public void update(ScoreCountingType record) throws Exception {
		String sql = "UPDATE " + TableName + " SET NAME = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getName(),
						record.getIdscore_counting_type() });
	}

	@Override
	public List<ScoreCountingType> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ScoreCountingTypeRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}
}
