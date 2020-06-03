package com.example.webapp.controller;

public class Topic {



    private String topic , topicName , topicDesription;

    public Topic() {

    }

    public Topic(String topic, String topicName, String topicDesription) {
        super();
        this.topic = topic;
        this.topicName = topicName;
        this.topicDesription = topicDesription;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDesription() {
        return topicDesription;
    }

    public void setTopicDesription(String topicDesription) {
        this.topicDesription = topicDesription;
    }
}
