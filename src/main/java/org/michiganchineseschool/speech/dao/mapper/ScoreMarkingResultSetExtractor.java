package org.michiganchineseschool.speech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.michiganchineseschool.speech.model.ContestorScore;
import org.michiganchineseschool.speech.model.ScoreMarking;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ScoreMarkingResultSetExtractor implements
		ResultSetExtractor<ScoreMarking> {

	@Override
	public ScoreMarking extractData(ResultSet rs) throws SQLException {
		ScoreMarking record = new ScoreMarking();
		record.setIdscore_marking(rs.getString("IDSCORE_MARKING"));
		ContestorScore contestorScore = new ContestorScore();
		contestorScore.setIdcontestor_score(rs.getString("IDCONTESTOR_SCORE"));
		record.setContestorScore(contestorScore);
		record.setRollCallMarking(rs.getInt("ROLL_CALL_MARKING"));
		record.setFlashLightMarking(rs.getInt("FLASH_LIGHT_MARKING"));
		record.setAudienceHelper(rs.getInt("AUDIENCE_HELPER"));
		record.setAbsence(rs.getInt("ABSENCE"));
		return record;
	}
}