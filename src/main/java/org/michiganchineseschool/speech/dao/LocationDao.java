package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.model.Location;

public interface LocationDao {
	public List<Location> selectAll() throws Exception;

	public void insert(Location record) throws Exception;

	public void update(Location record) throws Exception;

	public void delete(String id) throws Exception;

}
