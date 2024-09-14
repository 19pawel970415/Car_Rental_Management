package org.example.domain;


public class PaymentServiceImpl implements PaymentService {
    @Override
    public void processPayment(Payment payment) {
        payment.setStatus(PaymentStatus.PAID);
    }
}
