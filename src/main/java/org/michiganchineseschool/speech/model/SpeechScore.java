package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class SpeechScore implements Serializable {
	static final long serialVersionUID = 1l;
	private String idspeech_score;
	private ContestorScore contestorScore;
	private ScoreRuleItem scoreRuleItem;
	private float score;
	private int max;
	private int min;
	private int nonZeroCount;

	public int getNonZeroCount() {
		return nonZeroCount;
	}

	public void setNonZeroCount(int nonZeroCount) {
		this.nonZeroCount = nonZeroCount;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getIdspeech_score() {
		return idspeech_score;
	}

	public void setIdspeech_score(String idspeech_score) {
		this.idspeech_score = idspeech_score;
	}

	public ContestorScore getContestorScore() {
		return contestorScore;
	}

	public void setContestorScore(ContestorScore contestorScore) {
		this.contestorScore = contestorScore;
	}

	public ScoreRuleItem getScoreRuleItem() {
		return scoreRuleItem;
	}

	public void setScoreRuleItem(ScoreRuleItem scoreRuleItem) {
		this.scoreRuleItem = scoreRuleItem;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
