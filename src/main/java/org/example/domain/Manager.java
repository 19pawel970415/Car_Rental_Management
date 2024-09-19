package org.example.domain;

import java.util.Objects;

public class Manager extends Employee {
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;

    public Manager(GroupChat groupChat, String name, String surname, String email, String login, String password) {
        super(groupChat);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(login, manager.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " sent by " + name + " " + surname + " (manager)");
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message + " seen by " + name + " " + surname + " (manager)");
    }
}
