package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.JudgeRowMapper;
import org.michiganchineseschool.speech.dao.mapper.StaffRowMapper;
import org.michiganchineseschool.speech.model.Judge;
import org.michiganchineseschool.speech.model.Staff;

public class StaffDaoImpl extends BaseDaoImpl implements StaffDao {
	private final static String TableName = "staff";

	@Override
	public void insert(Staff record) throws Exception {
		String sql = "INSERT INTO "
				+ TableName
				+ " ( CHINESE_LASTNAME, CHINESE_FIRSTNAME, ENGLISH_LASTNAME, ENGLISH_FIRSTNAME, PASSWORD ) VALUES ( ?,?,?,?,? )";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getChineseLastName(),
						record.getChineseFirstName(),
						record.getEnglishLastName(),
						record.getEnglishFirstName(), record.getPassword() });

	}

	@Override
	public void update(Staff record) throws Exception {
		String sql = "UPDATE "
				+ TableName
				+ " SET CHINESE_LASTNAME = ?, CHINESE_FIRSTNAME = ?, ENGLISH_LASTNAME = ?, ENGLISH_FIRSTNAME = ?, PASSWORD = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getChineseLastName(),
						record.getChineseFirstName(),
						record.getEnglishLastName(),
						record.getEnglishFirstName(), record.getPassword(),
						record.getIdstaff() });
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public List<Staff> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new StaffRowMapper());
	}

	@Override
	public Staff select(String id) throws Exception {
		if (null == id) {
			return new Staff();
		}
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql, new StaffRowMapper());

	}

	@Override
	public List<Staff> selectListForLogin() throws Exception {
		String sql = "SELECT * from "
				+ TableName
				+ " WHERE IDSTAFF in ("
				+ " SELECT distinct idstaff FROM contest c, contest_group cg, judge j"
				+ " where c.idcontest = cg.idcontest"
				+ " and cg.idcontest_group = j.idcontest_group"
				+ " and c.active = 1)";
		return getJdbcTemplate().query(sql, new StaffRowMapper());
	}
}
