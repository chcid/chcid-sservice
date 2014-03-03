package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class Contestor implements Serializable {
	static final long serialVersionUID = 1l;
	private String idcontestor;
	private ContestGroup contestGroup;
	private String speechTitle;
	private int contestOrder;

	public String getIdcontestor() {
		return idcontestor;
	}

	public void setIdcontestor(String idcontestor) {
		this.idcontestor = idcontestor;
	}

	public ContestGroup getContestGroup() {
		return contestGroup;
	}

	public void setContestGroup(ContestGroup contestGroup) {
		this.contestGroup = contestGroup;
	}

	public String getSpeechTitle() {
		return speechTitle;
	}

	public void setSpeechTitle(String speechTitle) {
		this.speechTitle = speechTitle;
	}

	public int getContestOrder() {
		return contestOrder;
	}

	public void setContestOrder(int contestrder) {
		this.contestOrder = contestrder;
	}

}
