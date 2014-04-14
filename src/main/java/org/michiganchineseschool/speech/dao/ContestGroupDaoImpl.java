package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ContestGroupRowMapper;
import org.michiganchineseschool.speech.model.ContestGroup;

public class ContestGroupDaoImpl extends BaseDaoImpl implements ContestGroupDao {
	private final static String TableName = "contest_group";

	@Override
	public void insert(ContestGroup record) throws Exception {
		String sql = "INSERT INTO "
				+ TableName
				+ " ( IDCONTEST, IDLOCATION, IDTIME_LIMIT_RULE, NAME, IDSCORE_RULE, IDSCORE_COUNTING_TYPE ) VALUES ( ?, ?, ? ,?, ?, ? )";
		getJdbcTemplate()
				.update(sql,
						new Object[] {
								nullIdFilter(record.getContest(), "contest",
										"Contest"),
								nullIdFilter(record.getContestLocation(),
										"contest_location", "ContestLocation"),
								nullIdFilter(record.getTimeLimitRule(),
										"time_limit_rule", "TimeLimitRule"),
								record.getName(),
								nullIdFilter(record.getScoreRule(),
										"score_rule", "ScoreRule"),
								nullIdFilter(record.getScoreCountingType(),
										"score_counting_type",
										"ScoreCountingType") });
	}

	@Override
	public void update(ContestGroup record) throws Exception {
		String sql = "UPDATE "
				+ TableName
				+ " SET IDCONTEST = ?, IDLOCATION = ?, IDTIME_LIMIT_RULE = ?, NAME = ?, IDSCORE_RULE = ?, IDSCORE_COUNTING_TYPE = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate()
				.update(sql,
						new Object[] {
								nullIdFilter(record.getContest(), "contest",
										"Contest"),
								nullIdFilter(record.getContestLocation(),
										"contest_location", "ContestLocation"),
								nullIdFilter(record.getTimeLimitRule(),
										"time_limit_rule", "TimeLimitRule"),
								record.getName(),
								nullIdFilter(record.getScoreRule(),
										"score_rule", "ScoreRule"),
								nullIdFilter(record.getScoreCountingType(),
										"score_counting_type",
										"ScoreCountingType"),
								record.getIdcontest_group() });
	}

	@Override
	public List<ContestGroup> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ContestGroupRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public ContestGroup select(String id) throws Exception {
		if (null == id) {
			return new ContestGroup();
		}
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql,
				new ContestGroupRowMapper());

	}

	@Override
	public List<ContestGroup> selectListForLoginedStaff(String idstaff,
			boolean isUnSubmitOnly) throws Exception {
		String sql = "SELECT cg.*, r.idrole, j.idjudge FROM contest c, contest_group cg, judge j, staff s, role r"
				+ " where"
				+ " c.idcontest = cg.idcontest"
				+ " and cg.idcontest_group = j.idcontest_group"
				+ " and j.idstaff = s.idstaff"
				+ " and j.idrole = r.idrole"
				+ " and c.active = 1"
				+ " and c.idcontest = 1"
				+ " and s.idstaff = " + idstaff;
		if (isUnSubmitOnly) {
			sql += " and j.is_submit = 0";
		}
		return getJdbcTemplate().query(sql, new ContestGroupRowMapper());
	}

	@Override
	public List<ContestGroup> selectByActivateContest() throws Exception {
		String sql = "SELECT * FROM "
				+ TableName
				+ " cg, contest c WHERE c.idcontest = cg.idcontest and c.active = 1";
		return getJdbcTemplate().query(sql, new ContestGroupRowMapper());
	}
}
