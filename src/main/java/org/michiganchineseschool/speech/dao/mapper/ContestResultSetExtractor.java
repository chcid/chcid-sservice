package org.michiganchineseschool.speech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.michiganchineseschool.speech.model.Contest;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ContestResultSetExtractor implements ResultSetExtractor<Contest> {

	@Override
	public Contest extractData(ResultSet rs) throws SQLException {
		Contest contest = new Contest();
		contest.setIdcontest(rs.getString("IDCONTEST"));
		contest.setName(rs.getString("NAME"));
		return contest;
	}
}