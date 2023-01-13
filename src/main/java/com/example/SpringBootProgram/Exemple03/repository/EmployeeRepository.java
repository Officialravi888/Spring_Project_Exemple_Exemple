package com.example.SpringBootProgram.Exemple03.repository;

import com.example.SpringBootProgram.Exemple03.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAll();

}
