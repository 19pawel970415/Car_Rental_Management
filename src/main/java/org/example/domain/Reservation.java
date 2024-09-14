package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Reservation {
    private User user;
    private Car car;
    private Market market;
}
