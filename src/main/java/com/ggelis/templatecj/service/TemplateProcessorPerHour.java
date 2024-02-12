package com.ggelis.templatecj.service;

import com.ggelis.templatecj.repository.EmployeePerMonthRepository;
import org.springframework.stereotype.Service;

@Service
public class TemplateProcessorPerHour extends ProviderMemberTemplate {

    public TemplateProcessorPerHour(EmployeePerMonthRepository employeeRepository) {
        super(employeeRepository);
    }

    @Override
    public float totalAmount() {
        return 0F;
    }
}
