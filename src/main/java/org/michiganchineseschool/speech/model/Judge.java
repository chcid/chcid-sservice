package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class Judge implements Serializable {
	static final long serialVersionUID = 1l;
	private String idjudge;
	private ContestGroup contestGroup;
	private Staff staff;
	private Role role;

	public String getIdjudge() {
		return idjudge;
	}

	public void setIdjudge(String idjudge) {
		this.idjudge = idjudge;
	}

	public ContestGroup getContestGroup() {
		return contestGroup;
	}

	public void setContestGroup(ContestGroup contestGroup) {
		this.contestGroup = contestGroup;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
