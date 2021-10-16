package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public EmployeeController(){
        employeeList.add(new Employee("John","IT")); //call Employee(final String,final String)
        employeeList.add(new Employee("Ben","IT"));
        employeeList.add(new Employee("Ken","IT"));
    }


    @GetMapping("/employee/{id}")
        public Employee retrieveOneEmployee(@PathVariable("id") int id){
            return employeeList.get(id);
        }

    @PostMapping(value = "/employee")
        public void addOneEmployee(@RequestBody Employee employee){
            employeeList.add(employee);
        }
    
    @PutMapping("/employee/{id}")
        public void editOneEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
            employeeList.add(id,employee);
        }
    
    @DeleteMapping("employee/{id}")
        public void removeOneEmployee(@PathVariable("id") int id){
            employeeList.remove(id);
        }
}
