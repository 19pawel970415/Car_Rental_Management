package org.example.domain;

import java.util.Optional;

public interface ReservationState {
    Optional<ReservationState> previousState();
    Optional<ReservationState> nextState();
    void getStateInfo();
}
