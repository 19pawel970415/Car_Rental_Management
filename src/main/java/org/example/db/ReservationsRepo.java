package org.example.db;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.Reservation;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ReservationsRepo {
    private List<Reservation> reservations;

    private ReservationsRepo(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    private static ReservationsRepo RESERVATIONS_REPO_INSTANCE;

    public static ReservationsRepo getInstance() {
        if (RESERVATIONS_REPO_INSTANCE == null) {
            RESERVATIONS_REPO_INSTANCE = new ReservationsRepo(new ArrayList<>());
        }
    }
}
