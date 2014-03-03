package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.ContestorRowMapper;
import org.michiganchineseschool.speech.model.Contestor;

public class ContestorDaoImpl extends BaseDaoImpl implements ContestorDao {
	private final static String TableName = "CONTESTOR";

	@Override
	public void insert(Contestor record) throws Exception {
		String sql = "INSERT INTO "
				+ TableName
				+ " ( IDCONTEST_GROUP, SPEECH_TITLE, CONTEST_ORDER ) VALUES ( ?, ?, ? )";
		getJdbcTemplate().update(
				sql,
				new Object[] {
						nullIdFilter(record.getContestGroup(), "contest_group",
								"ContestGroup"), record.getSpeechTitle(),
						record.getContestOrder() });
	}

	@Override
	public void update(Contestor record) throws Exception {
		String sql = "UPDATE "
				+ TableName
				+ " SET IDCONTEST_GROUP = ?, SPEECH_TITLE = ?, CONTEST_ORDER = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(
				sql,
				new Object[] {
						nullIdFilter(record.getContestGroup(), "contest_group",
								"ContestGroup"), record.getSpeechTitle(),
						record.getContestOrder(), record.getIdcontestor() });
	}

	@Override
	public List<Contestor> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new ContestorRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}

	@Override
	public Contestor select(String id) throws Exception {
		if (null == id) {
			return new Contestor();
		}
		String sql = "Select * FROM " + TableName + " WHERE ID" + TableName
				+ " = " + id;
		return getJdbcTemplate().queryForObject(sql, new ContestorRowMapper());
	}
}
