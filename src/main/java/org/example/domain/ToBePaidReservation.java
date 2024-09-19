package org.example.domain;

public class ToBePaidReservation implements ReservationState {
    @Override
    public ReservationState previousState() throws NullPointerException {
        return new NewReservation();
    }

    @Override
    public ReservationState nextState() throws NullPointerException {
        return new PaidReservation();
    }

    @Override
    public void getStateInfo() {
        System.out.println("This reservation still has to be paid");
    }
}
