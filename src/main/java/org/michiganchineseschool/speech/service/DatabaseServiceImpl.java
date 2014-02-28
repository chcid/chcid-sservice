package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.dao.ContestDao;
import org.michiganchineseschool.speech.dao.LocationDao;
import org.michiganchineseschool.speech.dao.StaffDao;
import org.michiganchineseschool.speech.dao.StudentDao;
import org.michiganchineseschool.speech.model.Contest;
import org.michiganchineseschool.speech.model.Location;
import org.michiganchineseschool.speech.model.Staff;
import org.michiganchineseschool.speech.model.Student;

public class DatabaseServiceImpl implements DatabaseService {
	private StudentDao studentDao;
	private StaffDao staffDao;
	private ContestDao contestDao;
	private LocationDao locationDao;

	public LocationDao getLocationDao() {
		return locationDao;
	}

	public void setLocationDao(LocationDao locationDao) {
		this.locationDao = locationDao;
	}

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
	
	@Override
	public List<Location> getAllLocations() throws Exception {
		return getLocationDao().selectAll();
	}

	@Override
	public void deleteLocation(String id) throws Exception {
		getLocationDao().delete(id);
	}

	@Override
	public void insertLocation(Location record) throws Exception {
		getLocationDao().insert(record);
	}

	@Override
	public void updateLocation(Location record) throws Exception {
		getLocationDao().update(record);
	}

}
