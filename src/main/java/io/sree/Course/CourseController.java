package io.sree.Course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.sree.Topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable 	String id)  {
		System.out.println("@@@out");
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/topics/{topicId}/courses/{id}")
	public Course getTopic(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addTopic(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"", ""));
		 courseService.addCourse(course);
	}
	
	
	@RequestMapping(method= RequestMethod.PUT, value="/topics/{id}/courses/{id}")
	public void updateCourse(@PathVariable String id,@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"", "")); 
		courseService.updateCourse(id, course);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/topics/{id}/courses/{id}")
	public void deleteTopic(@PathVariable String id) {
		 courseService.deleteCourse(id);
	}
}
