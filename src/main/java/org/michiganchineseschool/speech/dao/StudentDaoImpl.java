package org.michiganchineseschool.speech.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.michiganchineseschool.speech.dao.mapper.StudentRowMapper;
import org.michiganchineseschool.speech.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
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
	public void insert(Student student) throws Exception {
		String sql = "INSERT INTO STUDENT ( CHINESE_LASTNAME, CHINESE_FIRSTNAME, ENGLISH_LASTNAME, ENGLISH_FIRSTNAME, GRAD_YEAR ) VALUES ( ?,?,?,?,? )";
		getJdbcTemplate().update(
				sql,
				new Object[] { student.getChineseLastName(),
						student.getChineseFirstName(),
						student.getEnglishLastName(),
						student.getEnglishFirstName(), student.getGradYear() });

	}

	@Override
	public void update(Student student) throws Exception {
		String sql = "UPDATE STUDENT SET CHINESE_LASTNAME = ?, CHINESE_FIRSTNAME = ?, ENGLISH_LASTNAME = ?, ENGLISH_FIRSTNAME = ?, GRAD_YEAR = ? WHERE IDSTUDENT = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] { student.getChineseLastName(),
						student.getChineseFirstName(),
						student.getEnglishLastName(),
						student.getEnglishFirstName(), student.getGradYear(),
						student.getIdstudent() });
	}

	@Override
	public void delete(String idstudent) throws Exception {
		String sql = "DELETE FROM STUDENT WHERE IDSTUDENT = " + idstudent;
		getJdbcTemplate().execute(sql);
	}

	@Override
	public List<Student> selectAll() throws Exception {
		String sql = "SELECT * FROM STUDENT";
		return getJdbcTemplate().query(sql, new StudentRowMapper());
	}
}
