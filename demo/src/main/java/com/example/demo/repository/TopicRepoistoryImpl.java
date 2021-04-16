package com.example.demo.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Topic;

@Repository
public class TopicRepoistoryImpl implements TopicRepository{

	private static final Logger logger = LoggerFactory.getLogger(TopicRepoistoryImpl.class);
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public Topic addTopic(Topic t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		return t;
	}

	@Override
	public void updateTopic(Topic t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(t);
		logger.info("Topic updated successfully, Topic Details="+t);		
	}

	@Override
	public List<Topic> listTopics() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Topic> topicList = session.createQuery("from Topic").list();
		for(Topic t:topicList) {
			logger.info("List of Topic::"+t);
		}
		return topicList;
	}

	@Override
	public Topic getTopicById(int topicId) {
		Session session = this.sessionFactory.getCurrentSession();		
		Topic t = (Topic) session.load(Topic.class, new Integer(topicId));
		logger.info("Topic loaded successfully, Topic details="+t);
		return t;
	}

	@Override
	public void removeTopic(int topicId) {
		Session session = this.sessionFactory.getCurrentSession();
		Topic t = (Topic) session.load(Topic.class, new Integer(topicId));
		if(null != t){
			session.delete(t);
		}
		logger.info("Topic deleted successfully, person details="+t);
	}
		
	}
