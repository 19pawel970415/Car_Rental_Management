package org.example.domain;

import java.util.Optional;

public class ToBePaidReservation implements ReservationState {
    @Override
    public Optional<ReservationState> previousState() {
        return Optional.of(new NewReservation());
    }

    @Override
    public Optional<ReservationState> nextState() {
        return Optional.of(new PaidReservation());
    }

    @Override
    public void getStateInfo() {
        System.out.println("This reservation still has to be paid");
    }
}
