package org.example.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExternalPaymentAdapter implements PaymentService{
    private ExternalPaymentSystem externalPaymentSystem;

    @Override
    public void processPayment(Payment payment) {
        payment.setStatus(PaymentStatus.PAID);
        externalPaymentSystem.processPayment(payment);
    }
}
