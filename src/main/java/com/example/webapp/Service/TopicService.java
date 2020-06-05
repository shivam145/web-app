package com.example.webapp.Service;

import com.example.webapp.controller.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
      new Topic("Java" , "Core Java", "Core Java Learning Tutorials"),
      new Topic("Spring" , "Spring Boot","Spring Boot Tutorials"),
      new Topic("C++" , "Standard Template Libraries","STL Tutorials")
    ));


    public TopicService() {
        System.out.println("Topic Service object instantiated");
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public List<Topic> getTopic(String id) {
        List<Topic> fetchList = new ArrayList<>();
        for(Topic lst: topics) {
            if(lst.getTopic().equals(id)) {
                fetchList.add(lst);
            }
        }
        return fetchList;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id , Topic topic) {
        for(Topic t : topics) {
            if(t.getTopic().equals(id)) {
               t.setTopic(topic.getTopic());
               t.setTopicName(topic.getTopicName());
               t.setTopicDescription(topic.getTopicDescription());
               return;
            }
        }
    }

    public void deleteTopic(String id) {
        for(Topic t : topics) {
            if(t.getTopic().equals(id)) {
                topics.remove(t);
                return;
            }
        }
    }
}
