package org.example.domain;

import java.util.Objects;

public class RentalRepresentative extends Employee {

    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;

    public RentalRepresentative(GroupChat groupChat, String name, String surname, String email, String login, String password) {
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
        RentalRepresentative rentalRepresentative = (RentalRepresentative) o;
        return Objects.equals(login, rentalRepresentative.login);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(login);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " sent by " + name + " " + surname + " (rental representative)");
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message + " seen by " + name + " " + surname + " (rental representative)");
    }

}
