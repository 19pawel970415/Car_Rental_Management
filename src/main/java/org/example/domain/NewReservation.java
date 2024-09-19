package org.example.domain;

import java.util.Optional;

public class NewReservation implements ReservationState {

    @Override
    public ReservationState previousState() {
        System.out.println("No previous state for new reservation");
        return null;
    }

    @Override
    public ReservationState nextState() {
        return new ToBePaidReservation();
    }

    @Override
    public void getStateInfo() {
        System.out.println("This is a new reservation");
    }
}
