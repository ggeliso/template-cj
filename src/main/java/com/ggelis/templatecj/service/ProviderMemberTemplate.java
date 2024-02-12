package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.EmployeePerMonth;
import com.ggelis.templatecj.repository.EmployeePerMonthRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public abstract class ProviderMemberTemplate {

    private final EmployeePerMonthRepository employeePerMonthRepository;

    public ProviderMemberTemplate(EmployeePerMonthRepository employeePerMonthRepository) {
        this.employeePerMonthRepository = employeePerMonthRepository;
    }

    public List<EmployeePerMonth> getAllEmployeesActivePerMonth() {

        return this.employeePerMonthRepository.findAllByActiveTrue();
    }

    public abstract float totalAmount();

}
