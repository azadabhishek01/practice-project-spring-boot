package com.training.practice.service;

import com.training.practice.entity.Employee;
import com.training.practice.repository.EmployeeRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void addEmp(Employee e){

        repo.save(e);

    }

    public List<Employee> getAllEmp(){
        return repo.findAll();
    }

    public Employee getEmpById(long id){
        Optional<Employee> e = repo.findById( id);
        return e.orElse(null);
    }

    public void delEmp(long id){
        repo.deleteById(id);
    }
}
