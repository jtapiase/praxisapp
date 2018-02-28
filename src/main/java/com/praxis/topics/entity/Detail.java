package com.praxis.topics.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Details")
public class Detail {
    @Id
    private Topic topics;
    private int expertise;

    public Detail(Topic topics, int expertise) {
        this.topics = topics;
        this.expertise = expertise;
    }

    public Detail() {

    }

    public Topic getTopics() {
        return topics;
    }

    public void setTopics(Topic topics) {
        this.topics = topics;
    }

    public int getExpertise() {
        return expertise;
    }

    public void setExpertise(int expertise) {
        this.expertise = expertise;
    }
}
