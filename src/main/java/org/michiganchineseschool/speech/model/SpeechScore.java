package org.michiganchineseschool.speech.model;

import java.io.Serializable;

public class SpeechScore implements Serializable {
	static final long serialVersionUID = 1l;
	private String idspeech_score;
	private ContestorScore contestorScore;
	private ScoreRuleItem scoreRuleItem;
	private int score;

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
