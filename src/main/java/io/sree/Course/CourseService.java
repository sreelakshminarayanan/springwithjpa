package io.sree.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository topicRepository;


	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		
		topicRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {

		return topicRepository.findOne(id);
	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		topicRepository.save(course);
	}

	public void updateCourse(String id, Course topic) {

		topicRepository.save(topic);

	}

	public void deleteCourse(String id) {

		topicRepository.delete(id);
	}
}
