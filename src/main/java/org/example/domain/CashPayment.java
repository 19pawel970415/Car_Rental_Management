package org.example.domain;

public class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(Reservation reservation, double amount) {
        System.out.println(amount + " paid with cash.");
        RESERVATION_SERVICE_PROXY_INSTANCE.transit(reservation);
    }
}
