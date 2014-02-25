package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.dao.StudentDao;
import org.michiganchineseschool.speech.model.Student;

public class DatabaseServiceImpl implements DatabaseService {
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> getAllStudents() throws Exception {
		return getStudentDao().getAllStudents();
	}

	@Override
	public void deleteStudent(String idstudent) throws Exception {
		getStudentDao().delete(idstudent);
	}

}
