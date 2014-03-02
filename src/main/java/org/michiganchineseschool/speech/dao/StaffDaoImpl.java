package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.StaffRowMapper;
import org.michiganchineseschool.speech.model.Staff;

public class StaffDaoImpl extends BaseDaoImpl implements StaffDao {
	private final static String TableName = "STAFF";

	@Override
	public void insert(Staff record) throws Exception {
		String sql = "INSERT INTO "
				+ TableName
				+ " ( CHINESE_LASTNAME, CHINESE_FIRSTNAME, ENGLISH_LASTNAME, ENGLISH_FIRSTNAME ) VALUES ( ?,?,?,? )";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getChineseLastName(),
						record.getChineseFirstName(),
						record.getEnglishLastName(),
						record.getEnglishFirstName() });

	}

	@Override
	public void update(Staff record) throws Exception {
		String sql = "UPDATE "
				+ TableName
				+ " SET CHINESE_LASTNAME = ?, CHINESE_FIRSTNAME = ?, ENGLISH_LASTNAME = ?, ENGLISH_FIRSTNAME = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { record.getChineseLastName(),
						record.getChineseFirstName(),
						record.getEnglishLastName(),
						record.getEnglishFirstName(), record.getIdstaff() });
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
}
