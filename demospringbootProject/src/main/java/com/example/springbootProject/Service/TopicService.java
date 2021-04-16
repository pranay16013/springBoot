package com.example.springbootProject.Service;

import java.util.List;

import com.example.springbootProject.model.Topic;

public interface TopicService {

	List<Topic> getTopics();
	Topic getTopicById(Long topicId);
	Topic save(Topic topic );
	void update(Long topicId, Topic topic);
	void delete(Long topicId);
	
}
