package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.JudgeRowMapper;
import org.michiganchineseschool.speech.model.Judge;

public class JudgeDaoImpl extends BaseDaoImpl implements JudgeDao {
	private final static String TableName = "JUDGE";

	@Override
	public void insert(Judge record) throws Exception {
		String sql = "INSERT INTO " + TableName
				+ " ( IDCONTEST_GROUP, IDSTAFF, IDROLE ) VALUES ( ?, ?, ? )";
		getJdbcTemplate().update(
				sql,
				new Object[] {
						nullIdFilter(record.getContestGroup(), "contest_group",
								"ContestGroup"),
						nullIdFilter(record.getStaff(), "staff", "Staff"),
						nullIdFilter(record.getRole(), "role", "Role") });
	}

	@Override
	public void update(Judge record) throws Exception {
		String sql = "UPDATE " + TableName
				+ " SET IDCONTEST_GROUP = ?, IDSTAFF = ?, IDROLE = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] {
						nullIdFilter(record.getContestGroup(), "contest_group",
								"ContestGroup"),
						nullIdFilter(record.getStaff(), "staff", "Staff"),
						nullIdFilter(record.getRole(), "role", "Role"),
						record.getIdjudge() });
	}

	@Override
	public List<Judge> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new JudgeRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public Judge select(String id) throws Exception {
		if (null == id) {
			return new Judge();
		}
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql, new JudgeRowMapper());
	}
}