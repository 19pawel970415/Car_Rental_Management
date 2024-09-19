package org.example.domain;

public interface ReservationState {
    ReservationState previousState() throws NullPointerException;
    ReservationState nextState() throws NullPointerException;
    void getStateInfo();
}
