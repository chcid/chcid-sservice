package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.model.Student;

public interface StudentDao {
	public List<Student> getAllStudents() throws Exception;
	public void delete(String idstudent) throws Exception;

}
