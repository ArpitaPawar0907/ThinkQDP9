package com.containtment;

public class SubTopic {
	private int  subTopicId;
	private String subTopicName;
	private Question que;
	SubTopic()
	{
		
	}
    SubTopic(int subTopicId, String subTopicName, Question que)
	{
		this.subTopicId = subTopicId;
		this.subTopicName = subTopicName;
		this.que = que;
	}
	public int getSubTopicId() {
		return subTopicId;
	}
	public void setSubTopicId(int subTopicId) {
		this.subTopicId = subTopicId;
	}
	public String getSubTopicName() {
		return subTopicName;
	}
	public void setSubTopicName(String subTopicName) {
		this.subTopicName = subTopicName;
	}
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	@Override
	public String toString() {
		return "SubTopic -" + subTopicId + " " + subTopicName + " \n" + que ;
	}
    
	

}
