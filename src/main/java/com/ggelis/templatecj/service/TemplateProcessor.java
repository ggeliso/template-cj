package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.Employee;
import com.ggelis.templatecj.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TemplateProcessor extends ProviderMemberTemplate {

    public TemplateProcessor(EmployeeRepository employeeRepository) {
        super(employeeRepository);
    }

    @Override
    public float totalAmount() {

        return this.getAllEmployeesActive()
                .stream()
                .map(this::identifyValidEmployees)
                .reduce(0F, Float::sum);

    }

    private Float identifyValidEmployees(Employee employee) throws IllegalArgumentException {

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

