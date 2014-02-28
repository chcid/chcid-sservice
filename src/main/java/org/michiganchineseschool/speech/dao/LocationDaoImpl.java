package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.dao.mapper.LocationRowMapper;
import org.michiganchineseschool.speech.model.Location;

public class LocationDaoImpl extends BaseDaoImpl implements LocationDao {
	private final static String TableName = "LOCATION";

	@Override
	public void insert(Location record) throws Exception {
		String sql = "INSERT INTO " + TableName + " ( NAME ) VALUES ( ? )";
		getJdbcTemplate().update(sql, new Object[] { record.getName() });
	}

	@Override
	public void update(Location record) throws Exception {
		String sql = "UPDATE " + TableName + " SET NAME = ? WHERE ID"
				+ TableName + " = ?";
		getJdbcTemplate().update(sql,
				new Object[] { record.getName(), record.getIdlocation() });
	}

	@Override
	public List<Location> selectAll() throws Exception {
		String sql = "SELECT * FROM " + TableName;
		return getJdbcTemplate().query(sql, new LocationRowMapper());
	}

	@Override
	public void delete(String id) throws Exception {
		delete(id, TableName);
	}
}
