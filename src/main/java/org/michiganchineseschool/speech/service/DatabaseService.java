package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.model.Contest;
import org.michiganchineseschool.speech.model.Location;
import org.michiganchineseschool.speech.model.Role;
import org.michiganchineseschool.speech.model.ScoreCountingType;
import org.michiganchineseschool.speech.model.ScoreRule;
import org.michiganchineseschool.speech.model.Staff;
import org.michiganchineseschool.speech.model.Student;
import org.michiganchineseschool.speech.model.TimeLimitRule;

public interface DatabaseService {
	public List<Student> getAllStudents() throws Exception;

	public void deleteStudent(String idstudent) throws Exception;

	public void insertStudent(Student student) throws Exception;

	public void updateStudent(Student student) throws Exception;

	public List<Staff> getAllStaffs() throws Exception;

	public void deleteStaff(String idstaff) throws Exception;

	public void insertStaff(Staff staff) throws Exception;

	public void updateStaff(Staff staff) throws Exception;

	public List<Contest> getAllContests() throws Exception;

	public void deleteContest(String id) throws Exception;

	public void insertContest(Contest contest) throws Exception;

	public void updateContest(Contest contest) throws Exception;

	public List<Location> getAllLocations() throws Exception;

	public void deleteLocation(String id) throws Exception;

	public void insertLocation(Location record) throws Exception;

	public void updateLocation(Location record) throws Exception;

	public List<Role> getAllRoles() throws Exception;

	public void deleteRole(String id) throws Exception;

	public void insertRole(Role record) throws Exception;

	public void updateRole(Role record) throws Exception;

	public List<ScoreCountingType> getAllScoreCountingTypes() throws Exception;

	public void deleteScoreCountingType(String id) throws Exception;

	public void insertScoreCountingType(ScoreCountingType record)
			throws Exception;

	public void updateScoreCountingType(ScoreCountingType record)
			throws Exception;

	public List<ScoreRule> getAllScoreRules() throws Exception;

	public void deleteScoreRule(String id) throws Exception;

	public void insertScoreRule(ScoreRule record) throws Exception;

	public void updateScoreRule(ScoreRule record) throws Exception;

	public List<TimeLimitRule> getAllTimeLimitRules() throws Exception;

	public void deleteTimeLimitRule(String id) throws Exception;

	public void insertTimeLimitRule(TimeLimitRule record) throws Exception;

	public void updateTimeLimitRule(TimeLimitRule record) throws Exception;

}
