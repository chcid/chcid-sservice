package org.michiganchineseschool.speech.rest;

import java.util.List;

import org.michiganchineseschool.speech.model.Student;
import org.michiganchineseschool.speech.service.DatabaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	private DatabaseService databaseService;

	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public @ResponseBody
	List<Student> getAllStudents() throws Exception {
		// Student student = new Student();
		// student.setEnglishFirstName("Evelyn");
		// student.setEnglishLastName("Chen");
		// student.setChineseFirstName(" ¿‹∑");
		// student.setChineseLastName("Íê");
		// System.out.println("Called");
		return getDatabaseService().getAllStudents();
	}

}
