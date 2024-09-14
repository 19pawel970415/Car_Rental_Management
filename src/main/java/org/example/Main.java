package org.example;

import org.example.db.PaymentsRepo;
import org.example.domain.*;

public class Main {

    public static final PaymentsRepo PAYMENTS_REPO_INSTANCE = PaymentsRepo.getInstance();
    public static final ExternalPaymentAdapter EXTERNAL_PAYMENT_ADAPTER_INSTANCE = ExternalPaymentAdapter.getInstance();

    public static void main(String[] args) {
        CarsGenerator.generateCars();
        MarketsGenerator.generateMarkets();
        ReservationsGenerator.generateReservations();
        UsersGenerator.generateUsers();
        PaymentsGenerator.generatePayments();

        for (Payment payment : PAYMENTS_REPO_INSTANCE.getPayments()) {
            EXTERNAL_PAYMENT_ADAPTER_INSTANCE.processPayment(payment);
        }
    }
}