package org.michiganchineseschool.speech.model;

import java.io.Serializable;
import java.util.List;

public class Contestor implements Serializable {
	static final long serialVersionUID = 1l;
	private String idcontestor;
	private ContestGroup contestGroup;
	private String speechTitle;
	private int contestOrder;
	private List<Student> students;
	private List<ScoreRuleItem> scoreRuleItems;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<ScoreRuleItem> getScoreRuleItems() {
		return scoreRuleItems;
	}

	public void setScoreRuleItems(List<ScoreRuleItem> scoreRuleItems) {
		this.scoreRuleItems = scoreRuleItems;
	}

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
