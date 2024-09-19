package org.example.domain;

public interface ReservationService {
    boolean isAuthorized(User user);
    void transit(Reservation reservation);
}
