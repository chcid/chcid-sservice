package org.michiganchineseschool.speech.service;

import java.util.List;

import org.michiganchineseschool.speech.dao.ContestDao;
import org.michiganchineseschool.speech.dao.ContestGroupDao;
import org.michiganchineseschool.speech.dao.ContestorDao;
import org.michiganchineseschool.speech.dao.ContestorIndividualDao;
import org.michiganchineseschool.speech.dao.JudgeDao;
import org.michiganchineseschool.speech.dao.LocationDao;
import org.michiganchineseschool.speech.dao.RoleDao;
import org.michiganchineseschool.speech.dao.ScoreCountingTypeDao;
import org.michiganchineseschool.speech.dao.ScoreRuleDao;
import org.michiganchineseschool.speech.dao.ScoreRuleItemDao;
import org.michiganchineseschool.speech.dao.StaffDao;
import org.michiganchineseschool.speech.dao.StudentDao;
import org.michiganchineseschool.speech.dao.TimeLimitRuleDao;
import org.michiganchineseschool.speech.model.Contest;
import org.michiganchineseschool.speech.model.ContestGroup;
import org.michiganchineseschool.speech.model.ContestLocation;
import org.michiganchineseschool.speech.model.Contestor;
import org.michiganchineseschool.speech.model.ContestorIndividual;
import org.michiganchineseschool.speech.model.Judge;
import org.michiganchineseschool.speech.model.Role;
import org.michiganchineseschool.speech.model.ScoreCountingType;
import org.michiganchineseschool.speech.model.ScoreRule;
import org.michiganchineseschool.speech.model.ScoreRuleItem;
import org.michiganchineseschool.speech.model.Staff;
import org.michiganchineseschool.speech.model.Student;
import org.michiganchineseschool.speech.model.TimeLimitRule;

public class DatabaseServiceImpl implements DatabaseService {
	private StudentDao studentDao;
	private StaffDao staffDao;
	private ContestDao contestDao;
	private LocationDao locationDao;
	private RoleDao roleDao;
	private ScoreCountingTypeDao scoreCountingTypeDao;
	private ScoreRuleDao scoreRuleDao;
	private TimeLimitRuleDao timeLimitRuleDao;
	private ScoreRuleItemDao scoreRuleItemDao;
	private ContestGroupDao contestGroupDao;
	private ContestorDao contestorDao;
	private ContestorIndividualDao contestorIndividualDao;
	private JudgeDao judgeDao;

	public JudgeDao getJudgeDao() {
		return judgeDao;
	}

	public void setJudgeDao(JudgeDao judgeDao) {
		this.judgeDao = judgeDao;
	}

	public ContestorIndividualDao getContestorIndividualDao() {
		return contestorIndividualDao;
	}

	public void setContestorIndividualDao(
			ContestorIndividualDao contestorIndividualDao) {
		this.contestorIndividualDao = contestorIndividualDao;
	}

	public ContestorDao getContestorDao() {
		return contestorDao;
	}

	public void setContestorDao(ContestorDao contestorDao) {
		this.contestorDao = contestorDao;
	}

	public ContestGroupDao getContestGroupDao() {
		return contestGroupDao;
	}

	public void setContestGroupDao(ContestGroupDao contestGroupDao) {
		this.contestGroupDao = contestGroupDao;
	}

	public ScoreRuleItemDao getScoreRuleItemDao() {
		return scoreRuleItemDao;
	}

	public void setScoreRuleItemDao(ScoreRuleItemDao scoreRuleItemDao) {
		this.scoreRuleItemDao = scoreRuleItemDao;
	}

	public TimeLimitRuleDao getTimeLimitRuleDao() {
		return timeLimitRuleDao;
	}

	public void setTimeLimitRuleDao(TimeLimitRuleDao timeLimitRuleDao) {
		this.timeLimitRuleDao = timeLimitRuleDao;
	}

	public ScoreRuleDao getScoreRuleDao() {
		return scoreRuleDao;
	}

	public void setScoreRuleDao(ScoreRuleDao scoreRuleDao) {
		this.scoreRuleDao = scoreRuleDao;
	}

	public ScoreCountingTypeDao getScoreCountingTypeDao() {
		return scoreCountingTypeDao;
	}

	public void setScoreCountingTypeDao(
			ScoreCountingTypeDao scoreCountingTypeDao) {
		this.scoreCountingTypeDao = scoreCountingTypeDao;
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

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

	public Student getStudentById(String id) throws Exception {
		return getStudentDao().select(id);
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

	public Staff getStaffById(String id) throws Exception {
		return getStaffDao().select(id);
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

	public Contest getContestById(String id) throws Exception {
		return getContestDao().select(id);
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
	public ContestLocation getLocationById(String id) throws Exception {
		return getLocationDao().select(id);
	}

	@Override
	public List<ContestLocation> getAllLocations() throws Exception {
		return getLocationDao().selectAll();
	}

	@Override
	public void deleteLocation(String id) throws Exception {
		getLocationDao().delete(id);
	}

	@Override
	public void insertLocation(ContestLocation record) throws Exception {
		getLocationDao().insert(record);
	}

	@Override
	public void updateLocation(ContestLocation record) throws Exception {
		getLocationDao().update(record);
	}

	@Override
	public Role getRoleById(String id) throws Exception {
		return getRoleDao().select(id);
	}

	@Override
	public List<Role> getAllRoles() throws Exception {
		return getRoleDao().selectAll();
	}

	@Override
	public void deleteRole(String id) throws Exception {
		getRoleDao().delete(id);
	}

	@Override
	public void insertRole(Role record) throws Exception {
		getRoleDao().insert(record);
	}

	@Override
	public void updateRole(Role record) throws Exception {
		getRoleDao().update(record);
	}

	@Override
	public ScoreCountingType getScoreCountingTypeById(String id)
			throws Exception {
		return getScoreCountingTypeDao().select(id);
	}

	@Override
	public List<ScoreCountingType> getAllScoreCountingTypes() throws Exception {
		return getScoreCountingTypeDao().selectAll();
	}

	@Override
	public void deleteScoreCountingType(String id) throws Exception {
		getScoreCountingTypeDao().delete(id);
	}

	@Override
	public void insertScoreCountingType(ScoreCountingType record)
			throws Exception {
		getScoreCountingTypeDao().insert(record);
	}

	@Override
	public void updateScoreCountingType(ScoreCountingType record)
			throws Exception {
		getScoreCountingTypeDao().update(record);
	}

	@Override
	public ScoreRule getScoreRuleById(String id) throws Exception {
		return getScoreRuleDao().select(id);
	}

	@Override
	public List<ScoreRule> getAllScoreRules() throws Exception {
		return getScoreRuleDao().selectAll();
	}

	@Override
	public void deleteScoreRule(String id) throws Exception {
		getScoreRuleDao().delete(id);
	}

	@Override
	public void insertScoreRule(ScoreRule record) throws Exception {
		getScoreRuleDao().insert(record);
	}

	@Override
	public void updateScoreRule(ScoreRule record) throws Exception {
		getScoreRuleDao().update(record);
	}

	@Override
	public TimeLimitRule getTimeLimitRuleById(String id) throws Exception {
		return getTimeLimitRuleDao().select(id);
	}

	@Override
	public List<TimeLimitRule> getAllTimeLimitRules() throws Exception {
		return getTimeLimitRuleDao().selectAll();
	}

	@Override
	public void deleteTimeLimitRule(String id) throws Exception {
		getTimeLimitRuleDao().delete(id);
	}

	@Override
	public void insertTimeLimitRule(TimeLimitRule record) throws Exception {
		getTimeLimitRuleDao().insert(record);
	}

	@Override
	public void updateTimeLimitRule(TimeLimitRule record) throws Exception {
		getTimeLimitRuleDao().update(record);
	}

	protected void setScoreRuleForScoreRuleItem(ScoreRuleItem scoreRuleItem)
			throws Exception {
		scoreRuleItem.setScoreRule(getScoreRuleDao().select(
				scoreRuleItem.getScoreRule().getIdscore_rule()));
	}

	@Override
	public ScoreRuleItem getScoreRuleItemById(String id) throws Exception {
		ScoreRuleItem scoreRuleItem = getScoreRuleItemDao().select(id);
		setScoreRuleForScoreRuleItem(scoreRuleItem);
		return scoreRuleItem;
	}

	@Override
	public List<ScoreRuleItem> getAllScoreRuleItems() throws Exception {
		List<ScoreRuleItem> scoreRuleItems = getScoreRuleItemDao().selectAll();
		for (ScoreRuleItem scoreRuleItem : scoreRuleItems) {
			setScoreRuleForScoreRuleItem(scoreRuleItem);
		}
		return scoreRuleItems;
	}

	@Override
	public void deleteScoreRuleItem(String id) throws Exception {
		getScoreRuleItemDao().delete(id);
	}

	@Override
	public void insertScoreRuleItem(ScoreRuleItem record) throws Exception {
		getScoreRuleItemDao().insert(record);
	}

	@Override
	public void updateScoreRuleItem(ScoreRuleItem record) throws Exception {
		getScoreRuleItemDao().update(record);
	}

	protected void setContestForContestGroup(ContestGroup contestGroup)
			throws Exception {
		contestGroup.setContest(getContestDao().select(
				contestGroup.getContest().getIdcontest()));
	}

	protected void setLocationForContestGroup(ContestGroup contestGroup)
			throws Exception {
		contestGroup.setContestLocation(getLocationDao().select(
				contestGroup.getContestLocation().getIdcontest_location()));
	}

	protected void setTimeLimitRuleForContestGroup(ContestGroup contestGroup)
			throws Exception {
		contestGroup.setTimeLimitRule(getTimeLimitRuleDao().select(
				contestGroup.getTimeLimitRule().getIdtime_limit_rule()));
	}

	protected void setScoreRuleForContestGroup(ContestGroup contestGroup)
			throws Exception {
		contestGroup.setScoreRule(getScoreRuleDao().select(
				contestGroup.getScoreRule().getIdscore_rule()));
	}

	protected void setScoreCountingTypeForContestGroup(ContestGroup contestGroup)
			throws Exception {
		contestGroup
				.setScoreCountingType(getScoreCountingTypeDao().select(
						contestGroup.getScoreCountingType()
								.getIdscore_counting_type()));
	}

	protected void setRoleForContestGroup(ContestGroup contestGroup)
			throws Exception {
		if (null == contestGroup.getRole()
				|| null == contestGroup.getRole().getIdrole()) {
			return;
		}
		contestGroup.setRole(getRoleDao().select(
				contestGroup.getRole().getIdrole()));
	}

	protected void setFidForContestGroup(ContestGroup contestGroup)
			throws Exception {
		setContestForContestGroup(contestGroup);
		setLocationForContestGroup(contestGroup);
		setTimeLimitRuleForContestGroup(contestGroup);
		setScoreRuleForContestGroup(contestGroup);
		setScoreCountingTypeForContestGroup(contestGroup);
		setRoleForContestGroup(contestGroup);
	}

	@Override
	public ContestGroup getContestGroupById(String id) throws Exception {
		ContestGroup contestGroup = getContestGroupDao().select(id);
		setFidForContestGroup(contestGroup);
		return contestGroup;
	}

	@Override
	public List<ContestGroup> getAllContestGroups() throws Exception {
		List<ContestGroup> contestGroups = getContestGroupDao().selectAll();
		setFidForContestGroups(contestGroups);
		return contestGroups;
	}

	@Override
	public void deleteContestGroup(String id) throws Exception {
		getContestGroupDao().delete(id);
	}

	@Override
	public void insertContestGroup(ContestGroup record) throws Exception {
		getContestGroupDao().insert(record);
	}

	@Override
	public void updateContestGroup(ContestGroup record) throws Exception {
		getContestGroupDao().update(record);
	}

	protected void setContestGrooupForContestor(Contestor contestor)
			throws Exception {
		// contestor.setContestGroup(getContestGroupDao().select(
		// contestor.getContestGroup().getIdcontest_group()));
		contestor.setContestGroup(getContestGroupById(contestor
				.getContestGroup().getIdcontest_group()));
	}

	@Override
	public Contestor getContestorById(String id) throws Exception {
		Contestor contestor = getContestorDao().select(id);
		setContestGrooupForContestor(contestor);
		return contestor;
	}

	@Override
	public List<Contestor> getAllContestors() throws Exception {
		List<Contestor> contestors = getContestorDao().selectAll();
		for (Contestor contestor : contestors) {
			setContestGrooupForContestor(contestor);
		}
		return contestors;
	}

	@Override
	public void deleteContestor(String id) throws Exception {
		getContestorDao().delete(id);
	}

	@Override
	public void insertContestor(Contestor record) throws Exception {
		getContestorDao().insert(record);
	}

	@Override
	public void updateContestor(Contestor record) throws Exception {
		getContestorDao().update(record);
	}

	protected void setContestorForContestorIndividual(
			ContestorIndividual contestorIndividual) throws Exception {
		contestorIndividual.setContestor(getContestorById(contestorIndividual
				.getContestor().getIdcontestor()));
	}

	protected void setStudentForContestorIndividual(
			ContestorIndividual contestorIndividual) throws Exception {
		contestorIndividual.setStudent(getStudentById(contestorIndividual
				.getStudent().getIdstudent()));
	}

	@Override
	public ContestorIndividual getContestorIndividualById(String id)
			throws Exception {
		ContestorIndividual contestorIndividual = getContestorIndividualDao()
				.select(id);
		setContestorForContestorIndividual(contestorIndividual);
		setStudentForContestorIndividual(contestorIndividual);
		return contestorIndividual;
	}

	@Override
	public List<ContestorIndividual> getAllContestorIndividuals()
			throws Exception {
		List<ContestorIndividual> contestorIndividuals = getContestorIndividualDao()
				.selectAll();
		for (ContestorIndividual contestorIndividual : contestorIndividuals) {
			setContestorForContestorIndividual(contestorIndividual);
			setStudentForContestorIndividual(contestorIndividual);
		}
		return contestorIndividuals;
	}

	@Override
	public void deleteContestorIndividual(String id) throws Exception {
		getContestorIndividualDao().delete(id);
	}

	@Override
	public void insertContestorIndividual(ContestorIndividual record)
			throws Exception {
		getContestorIndividualDao().insert(record);
	}

	@Override
	public void updateContestorIndividual(ContestorIndividual record)
			throws Exception {
		getContestorIndividualDao().update(record);
	}

	@Override
	public Judge getJudgeById(String id) throws Exception {
		Judge judge = getJudgeDao().select(id);
		setIdfForJudge(judge);
		return judge;
	}

	private void setIdfForJudge(Judge judge) throws Exception {
		setContestGrooupForJudge(judge);
		setStaffForJudge(judge);
		setRoleForJudge(judge);
	}

	private void setRoleForJudge(Judge judge) throws Exception {
		judge.setRole(getRoleById(judge.getRole().getIdrole()));
	}

	private void setStaffForJudge(Judge judge) throws Exception {
		judge.setStaff(getStaffById(judge.getStaff().getIdstaff()));
	}

	private void setContestGrooupForJudge(Judge judge) throws Exception {
		judge.setContestGroup(getContestGroupById(judge.getContestGroup()
				.getIdcontest_group()));
	}

	@Override
	public List<Judge> getAllJudges() throws Exception {
		List<Judge> judges = getJudgeDao().selectAll();
		for (Judge judge : judges) {
			setIdfForJudge(judge);
		}
		return judges;
	}

	@Override
	public void deleteJudge(String id) throws Exception {
		getJudgeDao().delete(id);
	}

	@Override
	public void insertJudge(Judge record) throws Exception {
		getJudgeDao().insert(record);
	}

	@Override
	public void updateJudge(Judge record) throws Exception {
		getJudgeDao().update(record);
	}

	@Override
	public List<Staff> selectListForLogin() throws Exception {
		return getStaffDao().selectListForLogin();
	}

	protected void setFidForContestGroups(List<ContestGroup> contestGroups)
			throws Exception {
		for (ContestGroup contestGroup : contestGroups) {
			setFidForContestGroup(contestGroup);
		}
	}

	@Override
	public List<ContestGroup> selectContestGroupListForLoginedStaff(
			String idstaff) throws Exception {
		List<ContestGroup> contestGroups = getContestGroupDao()
				.selectListForLoginedStaff(idstaff);
		setFidForContestGroups(contestGroups);
		return contestGroups;
	}

	public List<Contestor> selectContestorByContestGroup(String idcontestGroup,
			String idstaff, String idrole) throws Exception {
		List<Contestor> contestors = getContestorDao().selectByContestGroup(
				idcontestGroup);
		setStudentsForContestors(contestors);
		setScoreRuleItemsForContestor(contestors, idstaff, idrole);
		return contestors;
	}

	private void setScoreRuleItemsForContestor(List<Contestor> contestors,
			String idstaff, String idrole) throws Exception {
		for (Contestor contestor : contestors) {
			contestor.setScoreRuleItems(getScoreRuleItemDao()
					.selectByContestGroup(
							contestor.getContestGroup().getIdcontest_group()));
			setScoreForScoreRuleItems(contestor.getScoreRuleItems(),
					contestor.getIdcontestor(), idstaff, idrole);
		}
	}

	private void setScoreForScoreRuleItems(List<ScoreRuleItem> scoreRuleItems,
			String idcontestor, String idstaff, String idrole) throws Exception {
		for (ScoreRuleItem scoreRuleItem : scoreRuleItems) {
			scoreRuleItem.setScore(getScoreRuleItemDao()
					.getScoreByContestorRoleStaffScoreRuleItem(idcontestor,
							idrole, idstaff,
							scoreRuleItem.getIdscore_rule_item()));
		}

	}

	private void setStudentsForContestors(List<Contestor> contestors)
			throws Exception {
		for (Contestor contestor : contestors) {
			contestor.setStudents(getStudentDao().selectByContestor(
					contestor.getIdcontestor()));
		}
	}
}
