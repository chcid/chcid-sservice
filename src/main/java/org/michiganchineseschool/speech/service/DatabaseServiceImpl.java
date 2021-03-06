package org.michiganchineseschool.speech.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.michiganchineseschool.speech.dao.ContestDao;
import org.michiganchineseschool.speech.dao.ContestGroupDao;
import org.michiganchineseschool.speech.dao.ContestorDao;
import org.michiganchineseschool.speech.dao.ContestorIndividualDao;
import org.michiganchineseschool.speech.dao.ContestorScoreDao;
import org.michiganchineseschool.speech.dao.GradYearDao;
import org.michiganchineseschool.speech.dao.JudgeDao;
import org.michiganchineseschool.speech.dao.LocationDao;
import org.michiganchineseschool.speech.dao.RoleDao;
import org.michiganchineseschool.speech.dao.ScoreCountingTypeDao;
import org.michiganchineseschool.speech.dao.ScoreMarkingDao;
import org.michiganchineseschool.speech.dao.ScoreRuleDao;
import org.michiganchineseschool.speech.dao.ScoreRuleItemDao;
import org.michiganchineseschool.speech.dao.SpeechScoreDao;
import org.michiganchineseschool.speech.dao.StaffDao;
import org.michiganchineseschool.speech.dao.StudentDao;
import org.michiganchineseschool.speech.dao.TimeLimitRuleDao;
import org.michiganchineseschool.speech.dao.TimeScoreDao;
import org.michiganchineseschool.speech.model.Contest;
import org.michiganchineseschool.speech.model.ContestGroup;
import org.michiganchineseschool.speech.model.ContestLocation;
import org.michiganchineseschool.speech.model.Contestor;
import org.michiganchineseschool.speech.model.ContestorIndividual;
import org.michiganchineseschool.speech.model.ContestorScore;
import org.michiganchineseschool.speech.model.GradYear;
import org.michiganchineseschool.speech.model.Judge;
import org.michiganchineseschool.speech.model.Role;
import org.michiganchineseschool.speech.model.ScoreCountingType;
import org.michiganchineseschool.speech.model.ScoreMarking;
import org.michiganchineseschool.speech.model.ScoreRule;
import org.michiganchineseschool.speech.model.ScoreRuleItem;
import org.michiganchineseschool.speech.model.SpeechScore;
import org.michiganchineseschool.speech.model.Staff;
import org.michiganchineseschool.speech.model.Student;
import org.michiganchineseschool.speech.model.TimeLimitRule;
import org.michiganchineseschool.speech.model.TimeScore;
import org.springframework.dao.DuplicateKeyException;

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
	private ContestorScoreDao contestorScoreDao;
	private SpeechScoreDao speechScoreDao;
	private TimeScoreDao timeScoreDao;
	private ScoreMarkingDao scoreMarkingDao;
	private GradYearDao gradYearDao;

	public GradYearDao getGradYearDao() {
		return gradYearDao;
	}

	public void setGradYearDao(GradYearDao gradYearDao) {
		this.gradYearDao = gradYearDao;
	}

	public TimeScoreDao getTimeScoreDao() {
		return timeScoreDao;
	}

	public void setTimeScoreDao(TimeScoreDao timeScoreDao) {
		this.timeScoreDao = timeScoreDao;
	}

	public ScoreMarkingDao getScoreMarkingDao() {
		return scoreMarkingDao;
	}

	public void setScoreMarkingDao(ScoreMarkingDao scoreMarkingDao) {
		this.scoreMarkingDao = scoreMarkingDao;
	}

	public SpeechScoreDao getSpeechScoreDao() {
		return speechScoreDao;
	}

	public void setSpeechScoreDao(SpeechScoreDao speechScoreDao) {
		this.speechScoreDao = speechScoreDao;
	}

	public ContestorScoreDao getContestorScoreDao() {
		return contestorScoreDao;
	}

	public void setContestorScoreDao(ContestorScoreDao contestorScoreDao) {
		this.contestorScoreDao = contestorScoreDao;
	}

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
		Student student = getStudentDao().select(id);
		setGradYearForStudent(student);
		return student;
	}

	private void setGradYearForStudent(Student student) throws Exception {
		student.setGradYear(getGradYearDao().select(
				student.getGradYear().getIdgrad_year()));
	}

	@Override
	public List<Student> getAllStudents() throws Exception {
		List<Student> students = getStudentDao().selectAll();
		setGradYearForStudents(students);
		return students;
	}

	private void setGradYearForStudents(List<Student> students)
			throws Exception {
		for (Student student : students) {
			setGradYearForStudent(student);
		}
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
		contestGroup.getScoreRule().setScoreRuleItems(
				getScoreRuleItemDao().selectByContestGroup(
						contestGroup.getIdcontest_group()));
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
		setJudgeForContestGroup(contestGroup);
	}

	private void setJudgeForContestGroup(ContestGroup contestGroup)
			throws Exception {
		if (null == contestGroup.getJudge()
				|| null == contestGroup.getJudge().getIdjudge()) {
			return;
		}
		contestGroup.setJudge(getJudgeDao().select(
				contestGroup.getJudge().getIdjudge()));

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
			String idstaff, boolean isUnSubmitOnly) throws Exception {
		List<ContestGroup> contestGroups = getContestGroupDao()
				.selectListForLoginedStaff(idstaff, isUnSubmitOnly);
		setFidForContestGroups(contestGroups);
		return contestGroups;
	}

	public List<Contestor> selectContestorByContestGroup(String idcontestGroup,
			String idstaff, String idrole) throws Exception {
		// first, we insert to contestor_score for all contestor of this Judge
		List<ContestorScore> contestorScores = getContestorScoreDao()
				.selectByContestGroupRoleJudge(idcontestGroup, idstaff, idrole);
		for (ContestorScore contestorScore : contestorScores) {
			try {
				getContestorScoreDao().insert(contestorScore);
			} catch (DuplicateKeyException e) {
				// Duplicated Key is fine here
			}
		}
		if ("1".equals(idrole) || "4".equals(idrole)) {
			// Judge
			// TODO
			// need to improve the hard coded role id
			// if the role is judge to score ( 40%/40%/40% etc....
			// we insert new empty record to speech_score
			List<ScoreRuleItem> scoreRuleItems = getScoreRuleItemDao()
					.selectByContestGroup(idcontestGroup);
			for (ContestorScore contestorScore : contestorScores) {
				// to get the idcontest_score back
				contestorScore = getContestorScoreDao().select(contestorScore);
				// then we insert to speech_score for all score_rule_item of the
				// score_rule for all contestors of this judge
				for (ScoreRuleItem scoreRuleItem : scoreRuleItems) {
					try {
						SpeechScore speechScore = new SpeechScore();
						speechScore.setScoreRuleItem(scoreRuleItem);
						speechScore.setContestorScore(contestorScore);
						getSpeechScoreDao().insert(speechScore);
					} catch (DuplicateKeyException e) {
						// Duplicated Key is fine here
					}
				}
			}
		}
		if ("2".equals(idrole) || "4".equals(idrole)) {
			// Timer
			// We need to insert empty record to TimeScore and ScoreMarking
			for (ContestorScore contestorScore : contestorScores) {
				// to get the idcontest_score back
				contestorScore = getContestorScoreDao().select(contestorScore);
				// insert to time_score
				if ("2".equals(idrole)) {
					// timer
					try {
						TimeScore timeScore = new TimeScore();
						timeScore.setContestorScore(contestorScore);
						getTimeScoreDao().insert(timeScore);
					} catch (DuplicateKeyException e) {
						// exception is ok here
					}
				} else {
					// for Chief Judge
					try {
						// insert to ScoreMarking
						ScoreMarking scoreMarking = new ScoreMarking();
						scoreMarking.setContestorScore(contestorScore);
						getScoreMarkingDao().insert(scoreMarking);
					} catch (DuplicateKeyException e) {
						// Duplicated Key exception is fine here
					}
				}
			}
		}
		List<Contestor> contestors = getContestorDao().selectByContestGroup(
				idcontestGroup);
		setStudentsForContestors(contestors);
		if ("1".equals(idrole) || "4".equals(idrole)) {
			setScoreRuleItemsForContestor(contestors, idstaff, idrole);
		}
		if ("2".equals(idrole) || "4".equals(idrole)) {
			setScoreMarkingAndTimeScoreForContestor(contestors, idstaff, idrole);
		}
		if ("1".equals(idrole) || "4".equals(idrole)) {
			// sort the judg ranking for Judge's scoring reference
			sortRankingForJudgeScoringReference(contestors);
		}
		return contestors;
	}

	private void sortRankingForJudgeScoringReference(List<Contestor> contestors)
			throws Exception {
		// 1. take off the no score contestors
		List<Contestor> noScoreContestors = new ArrayList<Contestor>();

		for (Contestor contestor : contestors) {
			contestor.setJudgeRanking(true);
			if (0 == contestor.getTotalScore()) {
				noScoreContestors.add(contestor);
			}
		}
		for (Contestor contestor : noScoreContestors) {
			contestors.remove(contestor);
		}
		Collections.sort(contestors);
		int rank = 1;
		if (0 < contestors.size()) {
			contestors.get(0).setFinalRank(rank);
			if (1 < contestors.size()) {
				contestors.get(0).setScoreDiffAfter(
						contestors.get(0).getTotalScore()
								- contestors.get(1).getTotalScore());
			}
		}
		for (int i = 1; i < contestors.size(); i++) {
			if (contestors.get(i).compareTo(contestors.get(i - 1)) != 0) {
				// only plus one for rank for real bigger score
				rank++;
			}
			contestors.get(i).setFinalRank(rank);
			contestors.get(i).setScoreDiffBefore(
					contestors.get(i).getTotalScore()
							- contestors.get(i - 1).getTotalScore());
			if (i < contestors.size() - 1) {
				contestors.get(i).setScoreDiffAfter(
						contestors.get(i).getTotalScore()
								- contestors.get(i + 1).getTotalScore());
			}
		}
		// add the abstained back to list
		for (Contestor contestor : noScoreContestors) {
			contestors.add(contestor);
		}
	}

	private void setScoreMarkingAndTimeScoreForContestor(
			List<Contestor> contestors, String idstaff, String idrole)
			throws Exception {
		for (Contestor contestor : contestors) {
			if ("4".equals(idrole)) {
				contestor.setScoreMarking(getScoreMarkingDao()
						.selectByContestorStaffRole(contestor.getIdcontestor(),
								idrole, idstaff));
			} else {
				contestor.setTimeScore(getTimeScoreDao()
						.selectByContestorStaffRole(contestor.getIdcontestor(),
								idrole, idstaff));
				TimeLimitRule timeLimitRule = getTimeLimitRuleById(getContestGroupById(
						contestor.getContestGroup().getIdcontest_group())
						.getTimeLimitRule().getIdtime_limit_rule());
				int totalSecond = contestor.getTimeScore().getMinute() * 60
						+ contestor.getTimeScore().getSecond();
				if ((totalSecond > timeLimitRule.getMaxLimit() || totalSecond < timeLimitRule
						.getMinLimit()) && totalSecond > 0) {
					contestor.setJudgeTimeScore(-1);
				}

			}
		}
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
			scoreRuleItem.setSpeechScore(getSpeechScoreDao()
					.selectByContestorRoleStaffScoreRuleItem(idcontestor,
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

	@Override
	public void updateSpeechScore(SpeechScore record) throws Exception {
		getSpeechScoreDao().update(record);
	}

	@Override
	public void updateSpeechScoreByContestor(Contestor contestor)
			throws Exception {
		if (null != contestor.getScoreRuleItems()
				&& contestor.getScoreRuleItems().size() > 0) {
			for (ScoreRuleItem scoreRuleItem : contestor.getScoreRuleItems()) {
				updateSpeechScore(scoreRuleItem.getSpeechScore());
			}
		}
		if (null != contestor.getTimeScore()) {
			getTimeScoreDao().update(contestor.getTimeScore());
		}
		if (null != contestor.getScoreMarking()) {
			getScoreMarkingDao().update(contestor.getScoreMarking());
		}
	}

	@Override
	public GradYear getGradYearById(String id) throws Exception {
		return getGradYearDao().select(id);
	}

	@Override
	public List<GradYear> getAllGradYears() throws Exception {
		return getGradYearDao().selectAll();
	}

	@Override
	public void deleteGradYear(String id) throws Exception {
		getGradYearDao().delete(id);
	}

	@Override
	public void insertGradYear(GradYear record) throws Exception {
		getGradYearDao().insert(record);
	}

	@Override
	public void updateGradYear(GradYear record) throws Exception {
		getGradYearDao().update(record);
	}

	@Override
	public List<Contestor> getContestorScoreReportByContestGroup(String id)
			throws Exception {
		List<Contestor> contestors = getContestorDao().selectByContestGroup(id);
		setContestGroupForContestors(contestors);
		setContestorScoreForContestors(contestors);
		setStudentsForContestors(contestors);
		setJudgeRankForContestors(contestors);
		setFinalRankForContestors(contestors);
		return contestors;
	}

	private void setJudgeRankForContestors(List<Contestor> contestors)
			throws Exception {
		Contestor contestor = contestors.get(0);
		if (null == contestor || null == contestor.getContestorScores()) {
			return;
		}
		for (ContestorScore contestorScore : contestor.getContestorScores()) {
			if ("1".equals(contestorScore.getJudge().getRole().getIdrole())
					|| "4".equals(contestorScore.getJudge().getRole()
							.getIdrole())) {
				// sort judg rank for ths contestor
				setJudgeRankForContestor(
						contestorScore.getJudge().getIdjudge(), contestors);
			}
		}

	}

	private void setJudgeRankForContestor(String idjudge,
			List<Contestor> contestors) throws Exception {
		List<ContestorScore> sortingList = new ArrayList<ContestorScore>();
		for (Contestor contestor : contestors) {
			sortingList.add(findContestorScoreByIdJudge(idjudge, contestor));
		}
		Collections.sort(sortingList);
		int judgeRank = 1;
		sortingList.get(0).setJudgeRank(judgeRank);
		for (int i = 1; i < sortingList.size(); i++) {
			if (0 != sortingList.get(i).compareTo(sortingList.get(i - 1))) {
				judgeRank++;
			}
			sortingList.get(i).setJudgeRank(judgeRank);
		}
	}

	private ContestorScore findContestorScoreByIdJudge(String idjudge,
			Contestor contestor) throws Exception {
		for (ContestorScore contestorScore : contestor.getContestorScores()) {
			if (idjudge.equals(contestorScore.getJudge().getIdjudge())) {
				return contestorScore;
			}
		}
		return null;
	}

	private void setContestGroupForContestors(List<Contestor> contestors)
			throws Exception {
		for (Contestor contestor : contestors) {
			setContestGroupForContestor(contestor);
		}
	}

	private void setContestGroupForContestor(Contestor contestor)
			throws Exception {
		contestor.setContestGroup(getContestGroupById(contestor
				.getContestGroup().getIdcontest_group()));
		// setScoreRuleForContestGroup(contestor.getContestGroup());
		// setScoreCountingTypeForContestGroup(contestor.getContestGroup());
	}

	private void setFinalRankForContestors(List<Contestor> contestors)
			throws Exception {
		// first to force to calculate the final score
		for (Contestor contestor : contestors) {
			contestor.getFinalScore();
			// contestor.getTotalMarking();
			// contestor.getTotalScore();
			// contestor.getTotalScoreMarking();
			// contestor.getTotalSpeechScore();
			// contestor.getTotalTimeScore();
		}
		// take the abstained out for now
		List<Contestor> absTaineds = new ArrayList<Contestor>();
		for (Contestor contestor : contestors) {
			if (contestor.isAbstained()) {
				absTaineds.add(contestor);
			}
		}
		for (Contestor contestor : absTaineds) {
			contestors.remove(contestor);
		}
		Collections.sort(contestors);
		int rank = 1;
		for (Contestor contestor : contestors) {
			contestor.setFinalRank(rank++);
		}
		// add the abstained back to list
		for (Contestor contestor : absTaineds) {
			contestors.add(contestor);
		}
	}

	private void setContestorScoreForContestors(List<Contestor> contestors)
			throws Exception {
		for (Contestor contestor : contestors) {
			setContestScoreForContestor(contestor);
		}
	}

	private void setContestScoreForContestor(Contestor contestor)
			throws Exception {
		List<ContestorScore> contestorScores = getContestorScoreDao()
				.selectByContestor(contestor.getIdcontestor());
		setScoresBasedOnJudgeRoleForContestorScores(contestorScores);
		contestor.setContestorScores(contestorScores);
	}

	private void setScoresBasedOnJudgeRoleForContestorScores(
			List<ContestorScore> contestorScores) throws Exception {
		for (ContestorScore contestorScore : contestorScores) {
			setScoresBasedOnJudgeRoleForContestorScore(contestorScore);
		}
	}

	private void setScoresBasedOnJudgeRoleForContestorScore(
			ContestorScore contestorScore) throws Exception {
		contestorScore.setJudge(getJudgeById(contestorScore.getJudge()
				.getIdjudge()));
		if ("1".equals(contestorScore.getJudge().getRole().getIdrole())) {
			// speech judge
			setupSpeechScoresForContestorScore(contestorScore);
		} else if ("2".equals(contestorScore.getJudge().getRole().getIdrole())) {
			// timer judge
			setupTimeScoreForContestorScore(contestorScore);
			// setupScoreMarkingForContestorScore(contestorScore);
		} else if ("4".equals(contestorScore.getJudge().getRole().getIdrole())) {
			// Chief Judge
			setupSpeechScoresForContestorScore(contestorScore);
			setupScoreMarkingForContestorScore(contestorScore);
		}
	}

	private void setupScoreMarkingForContestorScore(
			ContestorScore contestorScore) throws Exception {
		contestorScore.setScoreMarking(getScoreMarkingDao()
				.selectByContestorScore(contestorScore.getIdcontestor_score()));

	}

	private void setupTimeScoreForContestorScore(ContestorScore contestorScore)
			throws Exception {
		contestorScore.setTimeScore(getTimeScoreDao().selectByContestorScore(
				contestorScore.getIdcontestor_score()));
	}

	private void setupSpeechScoresForContestorScore(
			ContestorScore contestorScore) throws Exception {
		List<SpeechScore> speechScores = getSpeechScoreDao()
				.selectByContestorScore(contestorScore.getIdcontestor_score());
		setScoreRuleItemForSpeechScores(speechScores);
		contestorScore.setSpeechScores(speechScores);

	}

	private void setScoreRuleItemForSpeechScores(List<SpeechScore> speechScores)
			throws Exception {
		for (SpeechScore speechScore : speechScores) {
			setScoreRuleItemForSpeechScore(speechScore);
		}
	}

	private void setScoreRuleItemForSpeechScore(SpeechScore speechScore)
			throws Exception {
		speechScore.setScoreRuleItem(getScoreRuleItemDao().select(
				speechScore.getScoreRuleItem().getIdscore_rule_item()));
	}

	@Override
	public List<ContestGroup> getActivateContestContestGroup() throws Exception {
		List<ContestGroup> contestGroups = getContestGroupDao()
				.selectByActivateContest();
		setScoreRuleForContestGroups(contestGroups);
		setTimeLimitRuleForContestGroups(contestGroups);
		setContestForContestGroups(contestGroups);
		return contestGroups;
	}

	private void setContestForContestGroups(List<ContestGroup> contestGroups)
			throws Exception {
		for (ContestGroup contestGroup : contestGroups) {
			setContestForContestGroup(contestGroup);
		}
	}

	private void setTimeLimitRuleForContestGroups(
			List<ContestGroup> contestGroups) throws Exception {
		for (ContestGroup contestGroup : contestGroups) {
			setTimeLimitRuleForContestGroup(contestGroup);
		}
	}

	private void setScoreRuleForContestGroups(List<ContestGroup> contestGroups)
			throws Exception {
		for (ContestGroup contestGroup : contestGroups) {
			setScoreRuleForContestGroup(contestGroup);
			setScoreCountingTypeForContestGroup(contestGroup);
		}
	}
}
