package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.model.Student;

public interface StudentDao {
	public List<Student> selectAll() throws Exception;

	public void delete(String idstudent) throws Exception;

	public void insert(Student student) throws Exception;

	public void update(Student student) throws Exception;

}
