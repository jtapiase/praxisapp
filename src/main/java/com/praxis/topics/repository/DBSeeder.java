package com.praxis.topics.repository;

import com.praxis.topics.entity.Topic;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {
    private TopicRepository  topicRepository;

    public DBSeeder(TopicRepository userRepository) {
        this.topicRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Topic topic1 = new Topic("Java", "Java for dummies");
        Topic topic2 = new Topic("Python", "Data Science in Python");
        Topic topic3 = new Topic("C++", "OOP in C++");
        Topic topic4 = new Topic("SpringBoot", "SpringBoot Quickstart");


        // Drop all topics
        this.topicRepository.deleteAll();

        // add topics to the db

        List<Topic> topics = Arrays.asList(topic1,topic2, topic3, topic4);
        //this.topicRepository.save(topics);
        this.topicRepository.save(topic1);

    }



}
