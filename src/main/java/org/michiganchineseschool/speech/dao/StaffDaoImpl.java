package org.michiganchineseschool.speech.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.michiganchineseschool.speech.dao.mapper.StaffRowMapper;
import org.michiganchineseschool.speech.dao.mapper.StudentRowMapper;
import org.michiganchineseschool.speech.model.Staff;
import org.michiganchineseschool.speech.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StaffDaoImpl implements StaffDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		if (null == jdbcTemplate) {
			jdbcTemplate = new JdbcTemplate(dataSource);
		}
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insert(Staff staff) throws Exception {
		String sql = "INSERT INTO STAFF ( CHINESE_LASTNAME, CHINESE_FIRSTNAME, ENGLISH_LASTNAME, ENGLISH_FIRSTNAME ) VALUES ( ?,?,?,? )";
		getJdbcTemplate()
				.update(sql,
						new Object[] { staff.getChineseLastName(),
								staff.getChineseFirstName(),
								staff.getEnglishLastName(),
								staff.getEnglishFirstName() });

	}

	@Override
	public void update(Staff staff) throws Exception {
		String sql = "UPDATE STAFF SET CHINESE_LASTNAME = ?, CHINESE_FIRSTNAME = ?, ENGLISH_LASTNAME = ?, ENGLISH_FIRSTNAME = ? WHERE IDSTAFF = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { staff.getChineseLastName(),
						staff.getChineseFirstName(),
						staff.getEnglishLastName(),
						staff.getEnglishFirstName(), staff.getIdstaff() });
	}

	@Override
	public void delete(String idstaff) throws Exception {
		String sql = "DELETE FROM STAFF WHERE IDSTAFF = " + idstaff;
		getJdbcTemplate().execute(sql);
	}

	@Override
	public List<Staff> selectAll() throws Exception {
		String sql = "SELECT * FROM STAFF";
		return getJdbcTemplate().query(sql, new StaffRowMapper());
	}
}
