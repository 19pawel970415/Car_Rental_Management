package org.example.domain;

public class PaidReservation implements ReservationState {
    @Override
    public ReservationState previousState() throws NullPointerException {
        return new ToBePaidReservation();
    }

    @Override
    public ReservationState nextState() throws NullPointerException {
        System.out.println("There is no next state for paid reservation");
        return null;
    }

    @Override
    public void getStateInfo() {
        System.out.println("This is a paid reservation");
    }
}
