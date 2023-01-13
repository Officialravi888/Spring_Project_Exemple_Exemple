package com.example.SpringBootProgram.SPRING_EXAMPLE.Services;

import com.example.SpringBootProgram.SPRING_EXAMPLE.Module.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    List<Course> list;

    public CourseServiceImpl() {
      List<Course> list = new ArrayList<>();
        list.add(new Course(245, "Java Core Course", "this course contains basic"));
        list.add(new Course(4343, "spring boot course", "creating rest api using"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c= null;
        for(Course course:list){
            if(course.getId() == courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course getCourses(long parseLong) {
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
