package com.example.springbootProject.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.springbootProject.model.Topic;


@Repository
public interface TopicRepo extends CrudRepository<Topic, Long> {

}
