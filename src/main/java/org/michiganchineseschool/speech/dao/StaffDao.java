package org.michiganchineseschool.speech.dao;

import java.util.List;

import org.michiganchineseschool.speech.model.Staff;

public interface StaffDao {
	public List<Staff> selectAll() throws Exception;

	public void delete(String id) throws Exception;

	public void insert(Staff record) throws Exception;

	public void update(Staff record) throws Exception;

}
