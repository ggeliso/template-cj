package com.ggelis.templatecj.repository;

import com.ggelis.templatecj.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Allow us to access all information keeping on database
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * Searh all employee that's avtive
     * @return {@code List<Employee>} employees are actives
     */
    List<Employee> findAllByActiveTrue();
}

