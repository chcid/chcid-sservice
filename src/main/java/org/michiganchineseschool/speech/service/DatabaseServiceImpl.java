package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.dao.ContestDao;
import org.michiganchineseschool.speech.dao.StaffDao;
import org.michiganchineseschool.speech.dao.StudentDao;
import org.michiganchineseschool.speech.model.Contest;
import org.michiganchineseschool.speech.model.Staff;
import org.michiganchineseschool.speech.model.Student;

public class DatabaseServiceImpl implements DatabaseService {
	private StudentDao studentDao;
	private StaffDao staffDao;
	private ContestDao contestDao;

	public ContestDao getContestDao() {
		return contestDao;
	}

	public void setContestDao(ContestDao contestDao) {
		this.contestDao = contestDao;
	}

	public StaffDao getStaffDao() {
		return staffDao;
	}

	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> getAllStudents() throws Exception {
		return getStudentDao().selectAll();
	}

	@Override
	public void deleteStudent(String idstudent) throws Exception {
		getStudentDao().delete(idstudent);
	}

	@Override
	public void insertStudent(Student student) throws Exception {
		getStudentDao().insert(student);
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		getStudentDao().update(student);
	}

	@Override
	public List<Staff> getAllStaffs() throws Exception {
		return getStaffDao().selectAll();
	}

	@Override
	public void deleteStaff(String idstaff) throws Exception {
		getStaffDao().delete(idstaff);
	}

	@Override
	public void insertStaff(Staff staff) throws Exception {
		getStaffDao().insert(staff);
	}

	@Override
	public void updateStaff(Staff staff) throws Exception {
		getStaffDao().update(staff);
	}

	@Override
	public List<Contest> getAllContests() throws Exception {
		return getContestDao().selectAll();
	}

	@Override
	public void deleteContest(String id) throws Exception {
		getContestDao().delete(id);
	}

	@Override
	public void insertContest(Contest record) throws Exception {
		getContestDao().insert(record);
	}

	@Override
	public void updateContest(Contest record) throws Exception {
		getContestDao().update(record);
	}

}
