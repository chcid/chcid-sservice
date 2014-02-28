package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ContestRowMapper;
import org.michiganchineseschool.speech.model.Contest;

public class ContestDaoImpl extends BaseDaoImpl implements ContestDao {
	private final static String TableName = "CONTEST";

	@Override
	public void insert(Contest contest) throws Exception {
		String sql = "INSERT INTO " + TableName + " ( NAME ) VALUES ( ? )";
		getJdbcTemplate().update(sql, new Object[] { contest.getName() });
	}

	@Override
	public void update(Contest contest) throws Exception {
		String sql = "UPDATE " + TableName + " SET NAME = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(sql,
				new Object[] { contest.getName(), contest.getIdcontest() });
	}

	@Override
	public List<Contest> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ContestRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, "CONTEST");
	}
}
