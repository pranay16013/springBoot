package com.example.springbootProject.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootProject.Repo.TopicRepo;
import com.example.springbootProject.Service.TopicService;
import com.example.springbootProject.model.Topic;

@Service
public class TopicServiceImpl implements TopicService{

	@Autowired
	TopicRepo topicRepo;
	
	public TopicServiceImpl(TopicRepo topicRepo) {
		this.topicRepo = topicRepo;
	}
	
	@Override
	public List<Topic> getTopics() {
		List<Topic> topic = new ArrayList<Topic>();
		topicRepo.findAll().forEach(topic::add);
		return topic;
	}

	@Override
	public Topic getTopicById(Long topicId) {
		return topicRepo.findById(topicId).get();
	}

	@Override
	public Topic save(Topic topic) {
		return topicRepo.save(topic);
	}

	@Override
	public void update(Long topicId, Topic topic) {
		Topic topics = topicRepo.findById(topicId).get();
		topics.setTopicId(topic.getTopicId());
		topics.setTopicName(topic.getTopicName());
		topicRepo.save(topics);
	}

	@Override
	public void delete(Long topicId) {
		topicRepo.deleteById(topicId);
	}

}
