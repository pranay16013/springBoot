package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Topic;

public interface TopicRepository{
	public Topic addTopic(Topic t);
	public void updateTopic(Topic t);
	public List<Topic> listTopics();
	public Topic getTopicById(int topicId);
	public void removeTopic(int topicId);
}
