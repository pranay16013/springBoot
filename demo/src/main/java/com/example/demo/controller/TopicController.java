package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@PostMapping("/addtopics")
	public Topic addTopic(@RequestBody Topic t) {
		System.out.println("Method calld:");
		return topicService.addTopic(t);
	}
}
