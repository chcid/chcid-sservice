package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.StudentRowMapper;
import org.michiganchineseschool.speech.model.Student;

public class StudentDaoImpl extends BaseDaoImpl implements StudentDao {
	private final static String TableName = "student";

	@Override
	public void insert(Student record) throws Exception {
		String sql = "INSERT INTO "
				+ TableName
				+ " ( CHINESE_LASTNAME, CHINESE_FIRSTNAME, ENGLISH_LASTNAME, ENGLISH_FIRSTNAME, IDGRAD_YEAR ) VALUES ( ?,?,?,?,? )";
		getJdbcTemplate().update(
				sql,
				new Object[] {
						record.getChineseLastName(),
						record.getChineseFirstName(),
						record.getEnglishLastName(),
						record.getEnglishFirstName(),
						nullIdFilter(record.getGradYear(), "grad_year",
								"GradYear") });

	}

	@Override
	public void update(Student record) throws Exception {
		String sql = "UPDATE "
				+ TableName
				+ " SET CHINESE_LASTNAME = ?, CHINESE_FIRSTNAME = ?, ENGLISH_LASTNAME = ?, ENGLISH_FIRSTNAME = ?, IDGRAD_YEAR = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] {
						record.getChineseLastName(),
						record.getChineseFirstName(),
						record.getEnglishLastName(),
						record.getEnglishFirstName(),
						nullIdFilter(record.getGradYear(), "grad_year",
								"GradYear"), record.getIdstudent() });
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public List<Student> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new StudentRowMapper());
	}

	@Override
	public Student select(String id) throws Exception {
		if (null == id) {
			return new Student();
		}
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql, new StudentRowMapper());

	}

	@Override
	public List<Student> selectByContestor(String idcontestor) throws Exception {
		String sql = "select s.* from contestor_individual ci, student s"
				+ " where ci.idstudent = s.idstudent"
				+ " and ci.idcontestor = " + idcontestor;
		return getJdbcTemplate().query(sql, new StudentRowMapper());
	}
}
