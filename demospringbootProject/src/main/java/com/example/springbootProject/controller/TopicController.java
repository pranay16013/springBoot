package com.example.springbootProject.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootProject.Service.TopicService;
import com.example.springbootProject.model.Topic;

@RestController
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	public TopicController(TopicService topicService) {
		this.topicService=topicService;
	}
	
	@PostMapping("/addTopic")
	public ResponseEntity<Topic> saveTopic(@RequestBody Topic topic){
		Topic t = topicService.save(topic);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("topic",t.getTopicId().toString());
		return new ResponseEntity<Topic>(HttpStatus.OK);
		
	}
	
	

}
