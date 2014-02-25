package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.model.Student;

public interface DatabaseService {
	public List<Student> getAllStudents() throws Exception;

	public void deleteStudent(String idstudent) throws Exception;

	public void insertStudent(Student student) throws Exception;

	public void updateStudent(Student student) throws Exception;

}
