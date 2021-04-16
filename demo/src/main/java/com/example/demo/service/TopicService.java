package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Topic;

public interface TopicService {
	public Topic addTopic(Topic t);
	public void updateTopic(Topic t);
	public List<Topic> listTopics();
	public Topic getTopicById(int topicId);
	public void removeTopic(int topicId);
}
