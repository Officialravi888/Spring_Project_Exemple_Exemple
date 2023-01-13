package com.example.SpringBootProgram.Exemple03.Service;

import com.example.SpringBootProgram.Exemple03.Model.Employee;
import com.example.SpringBootProgram.Exemple03.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
   private EmployeeRepository empRepository;
    public List<Employee> getEmployees() {

        List<Employee>employees=new ArrayList<>();

        empRepository.findAll().forEach(employees::add);
        return employees;
    }
}
