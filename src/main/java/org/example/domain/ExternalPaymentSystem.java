package org.example.domain;

import java.util.function.Consumer;

public class ExternalPaymentSystem {
    private Payment payment;

    private static Consumer<Payment> paymentConsumer = payment ->
            System.out.println(
                    payment.getReservation().getUser().getLogin() + "'s reservation paid!"
            );

    public void processPayment(Payment payment) {
        this.payment = payment;
        paymentConsumer.accept(payment);
    }
}
