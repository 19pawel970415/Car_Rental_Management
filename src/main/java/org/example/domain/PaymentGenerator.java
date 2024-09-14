package org.example.domain;

import org.example.db.PaymentsRepo;
import org.example.db.ReservationsRepo;

import java.util.Arrays;
import java.util.List;

public class PaymentGenerator {

    private static final List<Reservation> RESERVATIONS = ReservationsRepo.getInstance().getReservations();

    void generatePayments() {

        Payment payment = new Payment(RESERVATIONS.get(0));
        Payment payment1 = new Payment(RESERVATIONS.get(1));
        Payment payment2 = new Payment(RESERVATIONS.get(2));
        Payment payment3 = new Payment(RESERVATIONS.get(3));
        Payment payment4 = new Payment(RESERVATIONS.get(4));
        Payment payment5 = new Payment(RESERVATIONS.get(5));

        PaymentsRepo.getInstance().setPayments(
                Arrays.asList(
                        payment,
                        payment1,
                        payment2,
                        payment3,
                        payment4,
                        payment5
                )
        );
    }
}
