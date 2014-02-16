package org.michiganchinesescool.speech.appconfig;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.michiganchineseschool.speech.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:WebContent/WEB-INF/dispatcher-context.xml" })
// @ContextConfiguration(classes = AppConfig.class)
public class AppConfigTest {
	@Autowired
	private ApplicationContext ctx;

	MongoOperations mongoOperation;

	@Before
	public void setUp() throws Exception {
		mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	}

	@Test
	public void testMongo() {
		Student student = new Student();
		student.setEnglishFirstName("Evelyn2");
		student.setChineseFirstName(" ¿‹∑");
		Student mentor = new Student();
		mentor.setEnglishFirstName("Emmy");
		student.setMentor(mentor);
		mongoOperation.save(student);
		List<Student> students = mongoOperation.findAll(Student.class);
		System.out.print(students.size());
	}

	@Test
	public void testMongoTemplate() {
		fail("Not yet implemented");
	}

}
