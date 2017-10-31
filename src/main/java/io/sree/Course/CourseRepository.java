package io.sree.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.sree.Topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId);
}
