package org.michiganchineseschool.speech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.michiganchineseschool.speech.model.Location;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class LocationRowMapper implements RowMapper<Location> {

	@Override
	public Location mapRow(ResultSet rs, int line) throws SQLException {
		ResultSetExtractor<Location> extractor = new LocationResultSetExtractor();
		return extractor.extractData(rs);
	}

}
