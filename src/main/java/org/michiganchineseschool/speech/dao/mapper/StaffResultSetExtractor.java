package org.michiganchineseschool.speech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.michiganchineseschool.speech.model.Staff;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StaffResultSetExtractor implements ResultSetExtractor<Staff> {

	@Override
	public Staff extractData(ResultSet rs) throws SQLException {
		Staff staff = new Staff();
		staff.setIdstaff(rs.getString("IDSTAFF"));
		staff.setChineseFirstName(rs.getString("CHINESE_FIRSTNAME"));
		staff.setChineseLastName(rs.getString("CHINESE_LASTNAME"));
		staff.setEnglishFirstName(rs.getString("ENGLISH_FIRSTNAME"));
		staff.setEnglishLastName(rs.getString("ENGLISH_LASTNAME"));
		return staff;
	}
}