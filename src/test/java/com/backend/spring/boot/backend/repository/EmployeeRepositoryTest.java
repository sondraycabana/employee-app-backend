package com.backend.spring.boot.backend.repository;

import com.backend.spring.boot.backend.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeRepositoryTest {

    @BeforeEach
    void setUp() {
    }

    @Autowired
    EmployeeRepository employeeRepository;
    @Test
    public void saveEmployee(){
        Employee employees = new Employee();
        employees.setFirstName("ade");
        employees.setLastName("tunde");
        employees.setEmailId("a@gmail.com");

       employeeRepository.save(employees);
        assertThat(employees.getId()).isNotNull();
      //  log.info("to ensure it saves -> {}", hospital);

    }
}