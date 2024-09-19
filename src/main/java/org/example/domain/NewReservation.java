package org.example.domain;

import java.util.Optional;

public class NewReservation implements ReservationState {

    @Override
    public Optional<ReservationState> previousState() {
        System.out.println("No previous state for new reservation");
        return Optional.empty();
    }

    @Override
    public Optional<ReservationState> nextState() {
        return Optional.of(new ToBePaidReservation());
    }


    @Override
    public void getStateInfo() {
        System.out.println("This is a new reservation");
    }
}
