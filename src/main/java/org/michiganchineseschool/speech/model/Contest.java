package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class Contest implements Serializable {
	static final long serialVersionUID = 1l;
	private String idcontest;
	private String name;

	public String getIdcontest() {
		return idcontest;
	}

	public void setIdcontest(String idcontest) {
		this.idcontest = idcontest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
