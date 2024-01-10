package com.containtment;

public class Subject {
	private int subjectId;
	private String subjectName;
	private Topic topic;
	Subject()
	{
		
	}
	public Subject(int subjectId, String subjectName, Topic topic)
	{
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.topic = topic;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "Subject-" + subjectId + " " + subjectName + " \n" + topic ;
	}
	

}
