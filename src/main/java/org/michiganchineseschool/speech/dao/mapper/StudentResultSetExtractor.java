package org.michiganchineseschool.speech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.michiganchineseschool.speech.model.Student;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentResultSetExtractor implements ResultSetExtractor<Student> {

	@Override
	public Student extractData(ResultSet rs) throws SQLException {
		Student student = new Student();
		student.setIdstudent(rs.getString("IDSTUDENT"));
		student.setChineseFirstName(rs.getString("CHINESE_FIRSTNAME"));
		student.setChineseLastName(rs.getString("CHINESE_LASTNAME"));
		student.setEnglishFirstName(rs.getString("ENGLISH_FIRSTNAME"));
		student.setEnglishLastName(rs.getString("ENGLISH_LASTNAME"));
		student.setGradYear(rs.getString("GRAD_YEAR"));
		return student;
	}
}