package org.example.db;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ReservationsRepo {
    private List<Reservation> reservations = new ArrayList<>();
}
