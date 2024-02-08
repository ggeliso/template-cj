package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class Data {

    public final static List<Employee> EMPLOYEES = Arrays.asList(
            new Employee(35, "Goldarina Ziehm", 48.17F, false),
            new Employee(78, "Sim Wimlett", 66.64F, false),
            new Employee(25, "Stefania Fessier", 43.77F, true),
            new Employee(17, "Portie Joska", 54.46F, true),
            new Employee(61, "Philippe Minett", 59.11F, true),
            new Employee(58, "Paulina Lukash", 57.17F, false),
            new Employee(81, "Amanda Brightling", 37.98F, false),
            new Employee(96, "Reube Tullot", 67.81F, false),
            new Employee(93, "Elnore Drogan", 48.48F, false),
            new Employee(82, "Eugenius Sherrott", 17.43F, false),
            new Employee(49, "Tillie Guppey", 73.66F, true),
            new Employee(49, "Stefania Mallinar", 95.04F, true),
            new Employee(15, "Hastings Emblin", 88.18F, true),
            new Employee(31, "Harmonie Tubridy", 14.04F, true),
            new Employee(43, "Berny Rapsey", 15.52F, false),
            new Employee(58, "Madelyn Eckery", 74.52F, false),
            new Employee(80, "Sunny Harrington", 58.06F, false),
            new Employee(91, "Courtney MacPeice", 78.52F, true),
            new Employee(20, "Dur Severs", 20.78F, false),
            new Employee(96, "Ardra Peniman", 95.35F, false));

    public static final List<Employee> EMPLOYEES_WITHOUT_ID = Arrays.asList(
            new Employee(96, "Reube Tullot", 67.81F, false),
            new Employee(0, "Elnore Drogan", 48.48F, false),
            new Employee(82, "Eugenius Sherrott", 17.43F, false),
            new Employee(0, "Tillie Guppey", 73.66F, true),
            new Employee(49, "Stefania Mallinar", 95.04F, true),
            new Employee(15, "Hastings Emblin", 88.18F, true),
            new Employee(0, "Harmonie Tubridy", 14.04F, true));

    public static final List<Employee> EMPLOYEE_WITH_NEGATIVE_AMOUNT = Arrays.asList(
            new Employee(82, "Eugenius Sherrott", -17.43F, false),
            new Employee(49, "Tillie Guppey", 73.66F, true),
            new Employee(49, "Stefania Mallinar", -95.04F, true),
            new Employee(15, "Hastings Emblin", 88.18F, true),
            new Employee(31, "Harmonie Tubridy", 14.04F, true),
            new Employee(43, "Berny Rapsey", 15.52F, false)
    );

    public static final List<Employee> EMPLOYEES_NAME_IS_NULL = Arrays.asList(
            new Employee(35, null, 48.17F, false),
            new Employee(78, "Sim Wimlett", 66.64F, false),
            new Employee(25, "Stefania Fessier", 43.77F, true),
            new Employee(17, null, 54.46F, true),
            new Employee(61, "Philippe Minett", 59.11F, true)
    );

    public static final List<Employee> EMPLOYEES_NAME_IS_EMPTY = Arrays.asList(
            new Employee(35, null, 48.17F, false),
            new Employee(78, "Sim Wimlett", 66.64F, false),
            new Employee(25, "Stefania Fessier", 43.77F, true),
            new Employee(17, "Portie Joska", 54.46F, true),
            new Employee(61, "", 59.11F, true)
    );

}
