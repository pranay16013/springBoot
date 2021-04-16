package com.example.springbootProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topic_master")
public class Topic {

	@Id
    @GeneratedValue
    @Column(name="topicId",updatable = false, nullable = false)
    Long topicId;
	
	@Column(name="topicName")
	String topicName;

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
}
