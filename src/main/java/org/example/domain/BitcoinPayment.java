package org.example.domain;

public class BitcoinPayment implements PaymentMethod {
    @Override
    public void processPayment(Reservation reservation, double amount) {
        System.out.println(amount + " paid with Bitcoin.");
        RESERVATION_SERVICE_PROXY_INSTANCE.transit(reservation);
    }
}
