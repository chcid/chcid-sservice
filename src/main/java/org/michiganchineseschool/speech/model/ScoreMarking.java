package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class ScoreMarking implements Serializable {
	static final long serialVersionUID = 1l;
	private String idscore_marking;
	private ContestorScore contestorScore;
	private int rollCallMarking;
	private int flashLightMarking;
	private int audienceHelper;
	private int absence;

	public String getIdscore_marking() {
		return idscore_marking;
	}

	public void setIdscore_marking(String idscore_marking) {
		this.idscore_marking = idscore_marking;
	}

	public ContestorScore getContestorScore() {
		return contestorScore;
	}

	public void setContestorScore(ContestorScore contestorScore) {
		this.contestorScore = contestorScore;
	}

	public int getRollCallMarking() {
		return rollCallMarking;
	}

	public void setRollCallMarking(int rollCallMarking) {
		this.rollCallMarking = rollCallMarking;
	}

	public int getFlashLightMarking() {
		return flashLightMarking;
	}

	public void setFlashLightMarking(int flash_light_marking) {
		this.flashLightMarking = flash_light_marking;
	}

	public int getAudienceHelper() {
		return audienceHelper;
	}

	public void setAudienceHelper(int audience_helper) {
		this.audienceHelper = audience_helper;
	}

	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}

}
