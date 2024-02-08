package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.Employee;
import com.ggelis.templatecj.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TemplateProcessorTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    TemplateProcessor templateProcessor;

    @Test
    void testTotalAmountByActiveEmployees() {

        // Given: total amount expected about all active employees
        Float amountExpected = this.loadActiveEmployees(Data.EMPLOYEES)
                .stream()
                .map(Employee::getAmount)
                .reduce(0F, Float::sum);

        List<Employee> employeesActive = this.loadActiveEmployees(Data.EMPLOYEES);

        when(employeeRepository.findAllByActiveTrue()).thenReturn(employeesActive);

        // when: The process template
        Float result = templateProcessor.totalAmount();

        // then: Verify the amount expected is equal to result
        assertEquals(amountExpected, result);

    }

    @Test
    void testThrowingExceptionWhenEmployeeIDIsEqualZero() {

        // given: a list of employees with ID zero
        List<Employee> employeesWithoutId = this.loadActiveEmployees(Data.EMPLOYEES_WITHOUT_ID);

        when(employeeRepository.findAllByActiveTrue()).thenReturn(employeesWithoutId);

        // when: the template processor is running
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            templateProcessor.totalAmount();
        });

        // then: Verify the exception generated
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals("Employee without ID", exception.getMessage());
        verify(employeeRepository).findAllByActiveTrue();

    }

    @Test
    void testThrowingExceptionWhenAmountIsNegative() {

        // given:
        List<Employee> activeEmployeesWithNegativeAmount = this.loadActiveEmployees(Data.EMPLOYEE_WITH_NEGATIVE_AMOUNT);

        when(employeeRepository.findAllByActiveTrue()).thenReturn(activeEmployeesWithNegativeAmount);

        // when: the template processor is processed
        Exception exception = assertThrows(IllegalArgumentException.class, () -> templateProcessor.totalAmount());

        // then: checking the exception generated
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals("Amount could not be less than zero (0)", exception.getMessage());
        verify(employeeRepository).findAllByActiveTrue();

    }

    @Test
    void testThrowingExceptionWhenNamesEmployeeIsNull() {

        // given: series of employee whose names probably will be null
        List<Employee> namesEmployeeIsNull = this.loadActiveEmployees(Data.EMPLOYEES_NAME_IS_NULL);
        when(employeeRepository.findAllByActiveTrue()).thenReturn(namesEmployeeIsNull);

        // when: Processing the template processor
        Exception exception = assertThrows(IllegalArgumentException.class, () -> templateProcessor.totalAmount());

        // then: the exception was thrown
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals("Employee name is empty", exception.getMessage());
        verify(employeeRepository).findAllByActiveTrue();

    }

    @Test
    void testThrowingExceptionWhenNamesEmployeeIsEmpty() {

        // given: list of active employees whose names probably are empty
        List<Employee> namesEmployeeIsNull = this.loadActiveEmployees(Data.EMPLOYEES_NAME_IS_EMPTY);
        when(employeeRepository.findAllByActiveTrue()).thenReturn(namesEmployeeIsNull);

        // when: Processing the template processor
        Exception exception = assertThrows(IllegalArgumentException.class, () -> templateProcessor.totalAmount());

        // then: the exception was thrown
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals("Employee name is empty", exception.getMessage());
        verify(employeeRepository).findAllByActiveTrue();

    }

    private List<Employee> loadActiveEmployees(List<Employee> employees) {

        return employees
                .stream()
                .filter(Employee::isActive)
                .collect(Collectors.toList());
    }

}