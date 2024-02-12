package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.EmployeePerHour;
import com.ggelis.templatecj.repository.EmployeePerMonthRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class TemplateProcessorPerHourTest {

    @Mock
    EmployeePerMonthRepository employeeRepository;

    @InjectMocks
    TemplateProcessor templateProcessor;

    @Test
    void testTotalAmountPerHour() {

        // given: a series of employees
        List<EmployeePerHour> employees = Data.EMPLOYEES_PER_HOURS;

        // when:

        // then:
    }

}