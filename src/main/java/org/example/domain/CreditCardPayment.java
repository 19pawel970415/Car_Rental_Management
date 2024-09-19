package org.example.domain;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(Reservation reservation, double amount) {
        System.out.println(amount + " paid by credit card.");
        RESERVATION_SERVICE_PROXY_INSTANCE.transit(reservation);
    }
}
