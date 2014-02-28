package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class Location implements Serializable {
	static final long serialVersionUID = 1l;
	private String idlocation;
	private String name;

	public String getIdlocation() {
		return idlocation;
	}

	public void setIdlocation(String idlocation) {
		this.idlocation = idlocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
