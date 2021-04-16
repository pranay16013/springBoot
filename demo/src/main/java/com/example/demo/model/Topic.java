package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long topicId;
	
	@Column(name="topic_name")
	private String topicName;
	
//	@OneToMany(cascade = CascadeType.ALL)
//    private List<Post> posts;

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

//	public List<Post> getPosts() {
//		return posts;
//	}
//
//	public void setPosts(List<Post> posts) {
//		this.posts = posts;
//	}
}
