package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

    private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
    private static int idIndex = 4;


    static {
        Employee a = new Employee(0, "Xiaoming", 20, "Male");
        employees.put(0, a);
        Employee b = new Employee(1, "Xiaohong", 19, "Female");
        employees.put(1, b);
        Employee c = new Employee(2, "Xiaozhi", 15, "Male");
        employees.put(2, c);
        Employee d = new Employee(3, "Xiaogang", 16, "Male");
        employees.put(3, d);
        Employee e = new Employee(4, "Xiaoxia", 15, "Female");
        employees.put(4, e);
    }


    public static List<Employee> list() {
        return new ArrayList<Employee>(employees.values());
    }
    public static Employee create(Employee employee) {
        idIndex ++;
        employee.setId(idIndex);
        employees.put(idIndex, employee);
        return employee;
    }
    public static Employee get(int id) {
        return employees.get(id);
    }
    public static Employee update(int id, Employee employee) {
        employees.put(id, employee);
        return employee;
    }
    public static Employee delete(int id) {
        return employees.remove(id);
    }

}
