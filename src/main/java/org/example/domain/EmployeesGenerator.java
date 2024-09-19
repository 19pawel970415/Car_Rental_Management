package org.example.domain;

import org.example.db.EmployeesRepo;

public class EmployeesGenerator {

    private static final EmployeesRepo INSTANCE = EmployeesRepo.getInstance();

    public static void generateEmployees() {
        Employee employee = new Employee("John", "Doe", "john.doe@example.com", "john.doe", "password123"); // MANAGER
        Employee employee1 = new Employee("Jane", "Smith", "jane.smith@example.com", "jane.smith", "securePass"); // SALES_REPRESENTATIVE
        Employee employee2 = new Employee("Tom", "Brown", "tom.brown@example.com", "tom.brown", "brownie123"); // CUSTOMER_SERVICE
        Employee employee3 = new Employee("Anna", "Johnson", "anna.johnson@example.com", "anna.johnson", "pass123"); // MECHANIC
        Employee employee4 = new Employee("Mark", "Taylor", "mark.taylor@example.com", "mark.taylor", "taylorSecure"); // ACCOUNTANT

        INSTANCE.add(employee);
        INSTANCE.add(employee1);
        INSTANCE.add(employee2);
        INSTANCE.add(employee3);
        INSTANCE.add(employee4);
    }
}

