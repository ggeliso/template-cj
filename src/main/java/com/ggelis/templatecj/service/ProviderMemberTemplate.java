package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.Employee;
import com.ggelis.templatecj.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public abstract class ProviderMemberTemplate {

    private final EmployeeRepository employeeRepository;

    public ProviderMemberTemplate(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployeesActive() {

        return this.employeeRepository.findAllByActiveTrue();
    }

    public abstract float totalAmount();

}
