package com.example.webapp.controller;

public class Topic {



    private String topic , topicName , topicDescription;

    public Topic() {

    }

    public Topic(String topic, String topicName, String topicDescription) {
        super();
        this.topic = topic;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
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

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}
