package com.containtment;

public class Topic {
     private int topicId;
     private String topicName;
     private SubTopic subtopic;
     Topic()
     {
    	 
     }
	public Topic(int topicId, String topicName, SubTopic subtopic)
	{
		this.topicId = topicId;
		this.topicName = topicName;
		this.subtopic = subtopic;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public SubTopic getSubtopic() {
		return subtopic;
	}
	public void setSubtopic(SubTopic subtopic) {
		this.subtopic = subtopic;
	}
	
	public String toString() {
		return "Topic-" + topicId + " " + topicName + " \n" + subtopic ;
	}
     
}
