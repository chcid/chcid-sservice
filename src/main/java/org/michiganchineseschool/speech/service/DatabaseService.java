package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.model.Student;

public interface DatabaseService {
	public List<Student> getAllStudents() throws Exception;

}