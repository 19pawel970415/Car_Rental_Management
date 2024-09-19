package org.example.domain;

import java.util.Optional;

public class PaidReservation implements ReservationState {
    @Override
    public Optional<ReservationState> previousState() {
        return Optional.of(new ToBePaidReservation());
    }

    @Override
    public Optional<ReservationState> nextState() {
        System.out.println("There is no next state for paid reservation");
        return Optional.empty();
    }

    @Override
    public void getStateInfo() {
        System.out.println("This is a paid reservation");
    }
}
