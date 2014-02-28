package org.michiganchineseschool.speech.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.michiganchineseschool.speech.model.Location;
import org.springframework.jdbc.core.ResultSetExtractor;

public class LocationResultSetExtractor implements ResultSetExtractor<Location> {

	@Override
	public Location extractData(ResultSet rs) throws SQLException {
		Location record = new Location();
		record.setIdlocation(rs.getString("IDLOCATION"));
		record.setName(rs.getString("NAME"));
		return record;
	}
}