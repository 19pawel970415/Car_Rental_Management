package org.example.domain;

public class BlikPayment implements PaymentMethod {
    @Override
    public void processPayment(Reservation reservation, double amount) {
        System.out.println(amount + " paid with Blik.");
        RESERVATION_SERVICE_PROXY_INSTANCE.transit(reservation);
    }
}
