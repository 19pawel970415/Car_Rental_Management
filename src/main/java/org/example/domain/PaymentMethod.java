package org.example.domain;

public interface PaymentMethod {
    ReservationServiceProxy RESERVATION_SERVICE_PROXY_INSTANCE = ReservationServiceProxy.getInstance();

    void processPayment(Reservation reservation, double amount);
}
