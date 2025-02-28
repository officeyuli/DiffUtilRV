package com.example.diffutilrv.repository;

import com.example.diffutilrv.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Inject
    public EmployeeRepositoryImpl() {
    }

    @Override
    public List<Employee> getEmployeeListSortedByName() {
        final List<Employee> employeeList = getEmployeeList();

        Collections.sort(employeeList, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        return employeeList;
    }

    @Override
    public List<Employee> getEmployeeListSortedByRole() {
        final List<Employee> employeeList = getEmployeeList();

        Collections.sort(employeeList, (employee1, employee2) -> employee2.getRole().compareTo(employee1.getRole()));
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeeList() {
        final List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Employee 1", "Developer"));
        employees.add(new Employee(2, "Employee 2", "Tester"));
        employees.add(new Employee(3, "Employee 3", "Support"));
        employees.add(new Employee(4, "Employee 4", "Sales Manager"));
        employees.add(new Employee(5, "Employee 5", "Manager"));
        employees.add(new Employee(6, "Employee 6", "Team lead"));
        employees.add(new Employee(7, "Employee 7", "Scrum Master"));
        employees.add(new Employee(8, "Employee 8", "Sr. Tester"));
        employees.add(new Employee(9, "Employee 9", "Sr. Developer"));
        return employees;
    }
}
