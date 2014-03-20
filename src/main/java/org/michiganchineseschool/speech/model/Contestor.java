package org.michiganchineseschool.speech.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contestor implements Serializable, Comparable<Contestor> {
	static final long serialVersionUID = 1l;
	private String idcontestor;
	private ContestGroup contestGroup;
	private String speechTitle;
	private int contestOrder;
	private List<Student> students;
	private List<ScoreRuleItem> scoreRuleItems;
	private int totalScore;
	private TimeScore timeScore;
	private ScoreMarking scoreMarking;
	// //////////////////////
	// the following are for report
	private List<ContestorScore> contestorScores;
	private int totalSpeechScore;
	private int totalScoreMarking;
	private int totalTimeScore;
	private int finalScore;
	private int finalRank;
	private boolean isAbstained;

	public boolean isAbstained() {
		return isAbstained;
	}

	public void setAbstained(boolean isAbstained) {
		this.isAbstained = isAbstained;
	}

	public int getFinalRank() {
		return finalRank;
	}

	public void setFinalRank(int finalRank) {
		this.finalRank = finalRank;
	}

	private ScoreRuleItem findTheScoreRuleItem(ScoreRuleItem scoreRuleItem,
			List<ScoreRuleItem> scoreRuleItemSums) {
		if (null == scoreRuleItemSums) {
			return null;
		}
		for (ScoreRuleItem sri : scoreRuleItemSums) {
			if (sri.getIdscore_rule_item().equals(
					scoreRuleItem.getIdscore_rule_item())) {
				return sri;
			}
		}
		return null;
	}

	public List<ScoreRuleItem> getScoreRuleItemSums() {
		if (null == contestorScores) {
			return null;
		}
		List<ScoreRuleItem> scoreRuleItemSums = new ArrayList<ScoreRuleItem>();
		for (ContestorScore contestorScore : contestorScores) {
			List<SpeechScore> speechScores = contestorScore.getSpeechScores();
			if (null == speechScores) {
				continue;
			}
			for (SpeechScore speechScore : speechScores) {
				ScoreRuleItem sri = findTheScoreRuleItem(
						speechScore.getScoreRuleItem(), scoreRuleItemSums);
				if (null == sri) {
					sri = speechScore.getScoreRuleItem();
					SpeechScore sc = new SpeechScore();
					sc.setScore(speechScore.getScore());
					sri.setSpeechScore(sc);
					scoreRuleItemSums.add(sri);
				} else {
					sri.getSpeechScore().setScore(
							sri.getSpeechScore().getScore()
									+ speechScore.getScore());

				}
			}
		}
		return scoreRuleItemSums;
	}

	public void setScoreRuleItemSums(List<ScoreRuleItem> scoreRuleItemSums) {
		// this.scoreRuleItemSums = scoreRuleItemSums;
	}

	public int getFinalScore() {
		finalScore = getTotalScoreMarking() + getTotalSpeechScore()
				+ getTotalTimeScore();
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		// this.finalScore = finalScore;
	}

	public int getTotalScoreMarking() {
		totalScoreMarking = 0;
		if (null == contestorScores) {
			return 0;
		}
		for (ContestorScore contestorScore : contestorScores) {
			try {
				if ("2".equals(contestorScore.getJudge().getRole().getIdrole())) {
					totalScoreMarking += contestorScore.getScoreMarkingTotal();
					setAbstained(contestorScore.isAbstained());
				}
			} catch (NullPointerException e) {
				// null pointer is ok here
			}
		}
		return totalScoreMarking;
	}

	public void setTotalScoreMarking(int totalScoreMarking) {
		// this.totalScoreMarking = totalScoreMarking;
	}

	public int getTotalTimeScore() {
		totalTimeScore = 0;
		if (null == contestorScores) {
			return 0;
		}
		for (ContestorScore contestorScore : contestorScores) {
			try {
				if ("2".equals(contestorScore.getJudge().getRole().getIdrole())) {
					totalTimeScore += contestorScore.getTimeScoreTotal();
				}
			} catch (NullPointerException e) {
				// null pointer is ok here
			}
		}
		return totalTimeScore;
	}

	public void setTotalTimeScore(int totalTimeScore) {
		// this.totalTimeScore = totalTimeScore;
	}

	public int getTotalSpeechScore() {
		totalSpeechScore = 0;
		if (null == contestorScores) {
			return 0;
		}
		for (ContestorScore contestorScore : contestorScores) {
			try {
				if ("1".equals(contestorScore.getJudge().getRole().getIdrole())) {
					totalSpeechScore += contestorScore.getSpeechScoreTotal();
				}
			} catch (NullPointerException e) {
				// null pointer is ok here
			}
		}

		return totalSpeechScore;
	}

	public void setTotalSpeechScore(int totalSpeechScore) {
		// this.totalSpeechScore = totalSpeechScore;
	}

	public int getTotalMarking() {
		return totalMarking;
	}

	public void setTotalMarking(int totalMarking) {
		this.totalMarking = totalMarking;
	}

	private int totalMarking;

	public List<ContestorScore> getContestorScores() {
		return contestorScores;
	}

	public void setContestorScores(List<ContestorScore> contestorScores) {
		this.contestorScores = contestorScores;
	}

	public TimeScore getTimeScore() {
		return timeScore;
	}

	public void setTimeScore(TimeScore timeScore) {
		this.timeScore = timeScore;
	}

	public ScoreMarking getScoreMarking() {
		return scoreMarking;
	}

	public void setScoreMarking(ScoreMarking scoreMarking) {
		this.scoreMarking = scoreMarking;
	}

	private float getAverageRuleItemScoreByPriority(int priority) {
		if (null == contestorScores) {
			return 0;
		}
		float count = 0;
		float total = 0;
		for (ContestorScore contestorScore : contestorScores) {
			try {
				if ("1".equals(contestorScore.getJudge().getRole().getIdrole())) {
					for (SpeechScore speechScore : contestorScore
							.getSpeechScores()) {
						if (priority == speechScore.getScoreRuleItem()
								.getPriority()) {
							if (0 != speechScore.getScore()) {
								total += speechScore.getScore();
								count++;
							}
						}
					}
				}
			} catch (NullPointerException e) {
				// null pointer is ok here
			}
		}
		if (0 != count) {
			return (total / count);
		}
		return 0;
	}

	public int getTotalScore() {
		totalScore = 0;
		try {
			for (ScoreRuleItem scoreRuleItem : getScoreRuleItems()) {
				totalScore += scoreRuleItem.getSpeechScore().getScore()
						* scoreRuleItem.getWeight() / 100;
			}
		} catch (NullPointerException e) {
			// null pointer is fine here
		}
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

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

	public int compareTo(Contestor compareContestor) {
		int finalScore = compareContestor.getFinalScore();
		if (finalScore != this.getFinalScore()) {
			return finalScore - this.getFinalScore();
		}
		// Compare the Average of #A then #B then #C in the
		for (int priority = 1; priority <= getScoreRuleItemSums().size(); priority++) {

			float pScore = 1000 * compareContestor
					.getAverageRuleItemScoreByPriority(priority);
			float thisPScore = 1000 * this
					.getAverageRuleItemScoreByPriority(priority);
			if (pScore != thisPScore) {
				return (int) (pScore - thisPScore);
			}
		}
		return 0;
	}
}
