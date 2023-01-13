package com.example.SpringBootProgram.SPRING_EXAMPLE.Services;

import com.example.SpringBootProgram.SPRING_EXAMPLE.Module.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
public Course getCourse(long courseId);
    Course getCourses(long parseLong);

    public Course addCourse(Course course);
}
