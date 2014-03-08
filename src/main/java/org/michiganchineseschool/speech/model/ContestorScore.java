package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class ContestorScore implements Serializable {
	static final long serialVersionUID = 1l;
	private String idcontestor_score;
	private Contestor contestor;
	private Judge judge;

	public String getIdcontestor_score() {
		return idcontestor_score;
	}

	public void setIdcontestor_score(String idcontestor_score) {
		this.idcontestor_score = idcontestor_score;
	}

	public Contestor getContestor() {
		return contestor;
	}

	public void setContestor(Contestor contestor) {
		this.contestor = contestor;
	}

	public Judge getJudge() {
		return judge;
	}

	public void setJudge(Judge judge) {
		this.judge = judge;
	}

}
