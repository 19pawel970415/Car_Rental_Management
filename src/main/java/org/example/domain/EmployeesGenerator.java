package org.example.domain;

import org.example.db.EmployeesRepo;

public class EmployeesGenerator {

    private static final EmployeesRepo INSTANCE = EmployeesRepo.getInstance();
    private static final GroupChat GROUP_CHAT_INSTANCE = GroupChat.getInstance();
    public static void generateEmployees() {
        Employee employee = new Manager(GROUP_CHAT_INSTANCE,"John", "Doe", "john.doe@example.com", "john.doe", "password123");
        Employee employee1 = new RentalRepresentative(GROUP_CHAT_INSTANCE, "Jane", "Smith", "jane.smith@example.com", "jane.smith", "securePass");
        Employee employee2 = new RentalRepresentative(GROUP_CHAT_INSTANCE, "Tom", "Brown", "tom.brown@example.com", "tom.brown", "brownie123");
        Employee employee3 = new RentalRepresentative(GROUP_CHAT_INSTANCE, "Anna", "Johnson", "anna.johnson@example.com", "anna.johnson", "pass123");
        Employee employee4 = new RentalRepresentative(GROUP_CHAT_INSTANCE, "Mark", "Taylor", "mark.taylor@example.com", "mark.taylor", "taylorSecure");

        INSTANCE.add(employee);
        INSTANCE.add(employee1);
        INSTANCE.add(employee2);
        INSTANCE.add(employee3);
        INSTANCE.add(employee4);
    }
}

