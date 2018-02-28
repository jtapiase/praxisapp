package com.praxis.topics.repository;

import com.praxis.topics.entity.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("TopicsRepository")
public interface TopicRepository extends MongoRepository<Topic, String> {

    Topic findById(UUID id);
    List<Topic> find();

}
