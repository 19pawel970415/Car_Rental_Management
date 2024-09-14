package org.example.domain;

public class ExternalPaymentAdapter implements PaymentService {

    private ExternalPaymentSystem externalPaymentSystem;

    private ExternalPaymentAdapter(ExternalPaymentSystem externalPaymentSystem) {
        this.externalPaymentSystem = externalPaymentSystem;
    }

    private static ExternalPaymentAdapter EXTERNAL_PAYMENT_ADAPTER;

    public static ExternalPaymentAdapter getInstance() {
        if (EXTERNAL_PAYMENT_ADAPTER == null) {
            EXTERNAL_PAYMENT_ADAPTER = new ExternalPaymentAdapter(new ExternalPaymentSystem());
        }
        return EXTERNAL_PAYMENT_ADAPTER;
    }

    @Override
    public void processPayment(Payment payment) {
        payment.setStatus(PaymentStatus.PAID);
        externalPaymentSystem.processPayment(payment);
    }
}
