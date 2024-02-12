package com.ggelis.templatecj.service;

import com.ggelis.templatecj.entity.EmployeePerHour;
import com.ggelis.templatecj.entity.EmployeePerMonth;

import java.util.Arrays;
import java.util.List;

public class Data {

    public final static List<EmployeePerMonth> EMPLOYEES = Arrays.asList(
            new EmployeePerMonth(35, "Goldarina Ziehm", 48.17F, false),
            new EmployeePerMonth(78, "Sim Wimlett", 66.64F, false),
            new EmployeePerMonth(25, "Stefania Fessier", 43.77F, true),
            new EmployeePerMonth(17, "Portie Joska", 54.46F, true),
            new EmployeePerMonth(61, "Philippe Minett", 59.11F, true),
            new EmployeePerMonth(58, "Paulina Lukash", 57.17F, false),
            new EmployeePerMonth(81, "Amanda Brightling", 37.98F, false),
            new EmployeePerMonth(96, "Reube Tullot", 67.81F, false),
            new EmployeePerMonth(93, "Elnore Drogan", 48.48F, false),
            new EmployeePerMonth(82, "Eugenius Sherrott", 17.43F, false),
            new EmployeePerMonth(49, "Tillie Guppey", 73.66F, true),
            new EmployeePerMonth(49, "Stefania Mallinar", 95.04F, true),
            new EmployeePerMonth(15, "Hastings Emblin", 88.18F, true),
            new EmployeePerMonth(31, "Harmonie Tubridy", 14.04F, true),
            new EmployeePerMonth(43, "Berny Rapsey", 15.52F, false),
            new EmployeePerMonth(58, "Madelyn Eckery", 74.52F, false),
            new EmployeePerMonth(80, "Sunny Harrington", 58.06F, false),
            new EmployeePerMonth(91, "Courtney MacPeice", 78.52F, true),
            new EmployeePerMonth(20, "Dur Severs", 20.78F, false),
            new EmployeePerMonth(96, "Ardra Peniman", 95.35F, false));

    public static final List<EmployeePerMonth> EMPLOYEES_WITHOUT_ID = Arrays.asList(
            new EmployeePerMonth(96, "Reube Tullot", 67.81F, false),
            new EmployeePerMonth(0, "Elnore Drogan", 48.48F, false),
            new EmployeePerMonth(82, "Eugenius Sherrott", 17.43F, false),
            new EmployeePerMonth(0, "Tillie Guppey", 73.66F, true),
            new EmployeePerMonth(49, "Stefania Mallinar", 95.04F, true),
            new EmployeePerMonth(15, "Hastings Emblin", 88.18F, true),
            new EmployeePerMonth(0, "Harmonie Tubridy", 14.04F, true));

    public static final List<EmployeePerMonth> EMPLOYEE_WITH_NEGATIVE_AMOUNT = Arrays.asList(
            new EmployeePerMonth(82, "Eugenius Sherrott", -17.43F, false),
            new EmployeePerMonth(49, "Tillie Guppey", 73.66F, true),
            new EmployeePerMonth(49, "Stefania Mallinar", -95.04F, true),
            new EmployeePerMonth(15, "Hastings Emblin", 88.18F, true),
            new EmployeePerMonth(31, "Harmonie Tubridy", 14.04F, true),
            new EmployeePerMonth(43, "Berny Rapsey", 15.52F, false)
    );

    public static final List<EmployeePerMonth> EMPLOYEES_NAME_IS_NULL = Arrays.asList(
            new EmployeePerMonth(35, null, 48.17F, false),
            new EmployeePerMonth(78, "Sim Wimlett", 66.64F, false),
            new EmployeePerMonth(25, "Stefania Fessier", 43.77F, true),
            new EmployeePerMonth(17, null, 54.46F, true),
            new EmployeePerMonth(61, "Philippe Minett", 59.11F, true)
    );

    public static final List<EmployeePerMonth> EMPLOYEES_NAME_IS_EMPTY = Arrays.asList(
            new EmployeePerMonth(35, null, 48.17F, false),
            new EmployeePerMonth(78, "Sim Wimlett", 66.64F, false),
            new EmployeePerMonth(25, "Stefania Fessier", 43.77F, true),
            new EmployeePerMonth(17, "Portie Joska", 54.46F, true),
            new EmployeePerMonth(61, "", 59.11F, true)
    );

    public static final List<EmployeePerHour> EMPLOYEES_PER_HOURS = Arrays.asList(
            new EmployeePerHour(35, "Goldarina Ziehm", 48.17F, false, 20F),
            new EmployeePerHour(78, "Sim Wimlett", 66.64F, false, 15F),
            new EmployeePerHour(25, "Stefania Fessier", 43.77F, true, 40F),
            new EmployeePerHour(17, "Portie Joska", 54.46F, true, 45F),
            new EmployeePerHour(61, "", 59.11F, true, 35F)
    );

}
