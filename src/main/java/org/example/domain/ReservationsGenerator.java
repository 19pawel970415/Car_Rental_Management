package org.example.domain;

import org.example.db.CarsRepo;
import org.example.db.MarketsRepo;
import org.example.db.ReservationsRepo;

import java.util.Arrays;
import java.util.List;

public class ReservationsGenerator {

    private static final List<Market> MARKETS = MarketsRepo.getInstance().getMarkets();
    private static final List<Car> CARS = CarsRepo.getInstance().getCars();

    public static void generateReservations() {
        Reservation reservation = new Reservation(new NewReservation());
        reservation.setMarket(MARKETS.get(0));
        reservation.setCar(CARS.get(0));
        Reservation reservation1 = new Reservation(new NewReservation());
        reservation1.setMarket(MARKETS.get(1));
        reservation1.setCar(CARS.get(1));
        Reservation reservation2 = new Reservation(new NewReservation());
        reservation2.setMarket(MARKETS.get(2));
        reservation2.setCar(CARS.get(2));
        Reservation reservation3 = new Reservation(new NewReservation());
        reservation3.setMarket(MARKETS.get(3));
        reservation3.setCar(CARS.get(3));
        Reservation reservation4 = new Reservation(new NewReservation());
        reservation4.setMarket(MARKETS.get(0));
        reservation4.setCar(CARS.get(4));
        Reservation reservation5 = new Reservation(new NewReservation());
        reservation5.setMarket(MARKETS.get(1));
        reservation5.setCar(CARS.get(5));

        ReservationsRepo.getInstance().setReservations(
                Arrays.asList(
                        reservation,
                        reservation1,
                        reservation2,
                        reservation3,
                        reservation4,
                        reservation5
                )
        );
    }
}
