package org.example;

import org.example.domain.CarsGenerator;
import org.example.domain.MarketsGenerator;
import org.example.domain.ReservationsGenerator;
import org.example.domain.UsersGenerator;

public class Main {
    public static void main(String[] args) {
        CarsGenerator.generateCars();
        MarketsGenerator.generateMarkets();
        ReservationsGenerator.generateReservations();
        UsersGenerator.generateUsers();
    }
}