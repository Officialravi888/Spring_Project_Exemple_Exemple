package com.example.SpringBootProgram.Exemple03.Controller;

import com.example.SpringBootProgram.Exemple03.Model.Employee;
import com.example.SpringBootProgram.Exemple03.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
   private EmployeeService empService;
    @GetMapping("/emp")
    public List<Employee>getallemp(){
        return empService.getEmployees();
    }
}
