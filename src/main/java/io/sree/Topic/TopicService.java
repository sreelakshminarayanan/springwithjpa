package io.sree.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring"," spring framework", "spring framework description"),
			new Topic("java"," core java", "java description"),
			new Topic("javascript"," javascript", "javascript description")
			
			));
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {

		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {

		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {

		topicRepository.delete(id);
	}
}
