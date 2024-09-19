package org.example.domain;

public class ReservationServiceImpl implements ReservationService {

    @Override
    public boolean isAuthorized(User user) {
        return true;
    }

    @Override
    public void transit(Reservation reservation) {
        reservation.setReservationState(reservation.getReservationState().nextState().get());
    }
}
