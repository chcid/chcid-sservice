package org.michiganchineseschool.speech.model;

import java.io.Serializable;
import java.util.List;

public class ContestorScore implements Serializable {
	static final long serialVersionUID = 1l;
	private String idcontestor_score;
	private Contestor contestor;
	private Judge judge;
	private List<SpeechScore> speechScores;
	private ScoreMarking scoreMarking;
	private TimeScore timeScore;
	private int speechScoreTotal;
	private int scoreMarkingTotal;
	private int timeScoreTotal;
	private int totalScore;

	public int getTotalScore() {
		totalScore = getScoreMarkingTotal() + getSpeechScoreTotal()
				+ getTimeScoreTotal();
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		//this.totalScore = totalScore;
	}

	public int getSpeechScoreTotal() {
		speechScoreTotal = 0;
		try {
			for (SpeechScore speechScore : speechScores) {
				speechScoreTotal += speechScore.getScore()
						* speechScore.getScoreRuleItem().getWeight() / 100;
			}
		} catch (NullPointerException e) {
			// null pointer is ok here
		}
		return speechScoreTotal;
	}

	public void setSpeechScoreTotal(int speechScoreTotal) {
		// this.speechScoreTotal = speechScoreTotal;
	}

	public int getScoreMarkingTotal() {
		try {
			scoreMarkingTotal = Integer.parseInt(scoreMarking
					.getAudienceHelper())
					+ Integer.parseInt(scoreMarking.getFlashLightMarking())
					+ Integer.parseInt(scoreMarking.getRollCallMarking());
		} catch (NullPointerException e) {
			// null pointer is ok here
		}
		return scoreMarkingTotal;
	}

	public void setScoreMarkingTotal(int scoreMarkingTotal) {
		// this.scoreMarkingTotal = scoreMarkingTotal;
	}

	public int getTimeScoreTotal() {
		timeScoreTotal = 0;
		try {
			int totalSecond = timeScore.getMinute() * 60
					+ timeScore.getSecond();
			if (totalSecond > getJudge().getContestGroup().getTimeLimitRule()
					.getMaxLimit()
					|| totalSecond < getJudge().getContestGroup()
							.getTimeLimitRule().getMinLimit()) {
				timeScoreTotal = -1;
			}
		} catch (NullPointerException e) {
			// null pointer is OK here
		}
		return timeScoreTotal;
	}

	public void setTimeScoreTotal(int timeScoreTotal) {
		// this.timeScoreTotal = timeScoreTotal;
	}

	public List<SpeechScore> getSpeechScores() {
		return speechScores;
	}

	public void setSpeechScores(List<SpeechScore> speechScores) {
		this.speechScores = speechScores;
	}

	public ScoreMarking getScoreMarking() {
		return scoreMarking;
	}

	public void setScoreMarking(ScoreMarking scoreMarking) {
		this.scoreMarking = scoreMarking;
	}

	public TimeScore getTimeScore() {
		return timeScore;
	}

	public void setTimeScore(TimeScore timeScore) {
		this.timeScore = timeScore;
	}

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
