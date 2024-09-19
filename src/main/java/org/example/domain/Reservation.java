package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Reservation {
    private User user;
    private Car car;
    private Market market;
    private ReservationState reservationState;

    public Reservation(ReservationState reservationState) {
        this.reservationState = new NewReservation();
    }
}
