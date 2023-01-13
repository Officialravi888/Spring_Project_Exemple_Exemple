package com.example.SpringBootProgram.SPRING_EXAMPLE.Controllar;

import com.example.SpringBootProgram.SPRING_EXAMPLE.Module.Course;
import com.example.SpringBootProgram.SPRING_EXAMPLE.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to Spring boot";
    }
    @GetMapping("/courses")
    //@RequestMapping(Path=”/Courses”,method=RequestMethod.GET)
    public List<Course> getCourses()
    {
        return this.courseService.getCourses();
    }

@GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }


    @PostMapping(path="/Ravi")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
