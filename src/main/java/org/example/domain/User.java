package org.example.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
public class User implements Serializable {
    private String name;
    private String surname;
    private String email;
    private Country country;
    private String login;
    private String password;
    private List<Reservation> reservations;
}