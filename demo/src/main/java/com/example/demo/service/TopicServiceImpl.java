package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Topic;
import com.example.demo.repository.TopicRepository;

@Service
public class TopicServiceImpl implements TopicService{

	@Autowired
	private TopicRepository topicRepository;
	
	public void setTopicDao(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}
	
	@Override
	@Transactional
	public Topic addTopic(Topic t) {
		return this.topicRepository.addTopic(t);		
	}

	@Override
	@Transactional
	public void updateTopic(Topic t) {
			this.topicRepository.updateTopic(t);	
	}

	@Override
	@Transactional
	public List<Topic> listTopics() {
		return this.topicRepository.listTopics();
	}

	@Override
	@Transactional
	public Topic getTopicById(int topicId) {
		return this.topicRepository.getTopicById(topicId);
	}

	@Override
	@Transactional
	public void removeTopic(int topicId) {
		this.topicRepository.removeTopic(topicId);
		
	}

}
