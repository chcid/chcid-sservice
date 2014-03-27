package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ContestRowMapper;
import org.michiganchineseschool.speech.model.Contest;

public class ContestDaoImpl extends BaseDaoImpl implements ContestDao {
	private final static String TableName = "CONTEST";

	@Override
	public void insert(Contest record) throws Exception {
		String sql = "INSERT INTO " + TableName
				+ " ( NAME, ACTIVE ) VALUES ( ?, ? )";
		getJdbcTemplate().update(sql,
				new Object[] { record.getName(), record.getActive() });
	}

	@Override
	public void update(Contest record) throws Exception {
		String sql = "UPDATE " + TableName
				+ " SET NAME = ?, ACTIVE = ? WHERE ID" + TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getName(), record.getActive(),
						record.getIdcontest() });
	}

	@Override
	public List<Contest> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ContestRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public Contest select(String id) throws Exception {
		if (null == id) {
			return new Contest();
		}
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql, new ContestRowMapper());

	}
}
