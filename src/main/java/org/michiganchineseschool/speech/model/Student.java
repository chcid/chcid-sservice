package org.michiganchineseschool.speech.model;

public class Student {
	private String id;
	private String chineseLastName;
	private String chineseFirstName;
	private String englishLastName;
	private String englishFirstName;
	private Student mentor;

	public Student getMentor() {
		return mentor;
	}

	public void setMentor(Student mentor) {
		this.mentor = mentor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChineseLastName() {
		return chineseLastName;
	}

	public void setChineseLastName(String chineseLastName) {
		this.chineseLastName = chineseLastName;
	}

	public String getChineseFirstName() {
		return chineseFirstName;
	}

	public void setChineseFirstName(String chineseFirstName) {
		this.chineseFirstName = chineseFirstName;
	}

	public String getEnglishLastName() {
		return englishLastName;
	}

	public void setEnglishLastName(String englishLastName) {
		this.englishLastName = englishLastName;
	}

	public String getEnglishFirstName() {
		return englishFirstName;
	}

	public void setEnglishFirstName(String englishFirstName) {
		this.englishFirstName = englishFirstName;
	}

}
