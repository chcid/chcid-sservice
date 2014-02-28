package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.model.Contest;

public interface ContestDao {
	public List<Contest> selectAll() throws Exception;

	public void insert(Contest contest) throws Exception;

	public void update(Contest contest) throws Exception;

	public void delete(String id) throws Exception;

}
