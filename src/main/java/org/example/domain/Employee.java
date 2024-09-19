package org.example.domain;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Employee {
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(login, employee.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login);
    }
}
