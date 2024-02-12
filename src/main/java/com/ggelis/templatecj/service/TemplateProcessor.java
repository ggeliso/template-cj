package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.EmployeePerMonth;
import com.ggelis.templatecj.repository.EmployeePerMonthRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TemplateProcessor extends ProviderMemberTemplate {

    public TemplateProcessor(EmployeePerMonthRepository employeeRepository) {
        super(employeeRepository);
    }

    @Override
    public float totalAmount() {

        return this.getAllEmployeesActivePerMonth()
                .stream()
                .map(this::identifyValidEmployees)
                .reduce(0F, Float::sum);

    }

    private Float identifyValidEmployees(EmployeePerMonth employee) throws IllegalArgumentException {

        if (employee.getAmount() < 0) {
            throw new IllegalArgumentException("Amount could not be less than zero (0)");
        }

        if (employee.getId() == 0) {
            throw new IllegalArgumentException("Employee without ID");
        }

        if (!StringUtils.hasText(employee.getName())) {
            throw new IllegalArgumentException("Employee name is empty");
        }

        return employee.getAmount();

    }

}

