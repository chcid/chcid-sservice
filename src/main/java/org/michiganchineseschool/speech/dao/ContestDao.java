package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.model.Contest;

public interface ContestDao {
	public List<Contest> selectAll() throws Exception;

	public void insert(Contest record) throws Exception;

	public void update(Contest record) throws Exception;

	public void delete(String id) throws Exception;

}
