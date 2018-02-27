package com.praxis.topics.entity;

public class Detail {
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
