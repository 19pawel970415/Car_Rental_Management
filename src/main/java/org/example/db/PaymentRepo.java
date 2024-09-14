package org.example.db;

import lombok.Setter;
import org.example.domain.Payment;

import java.util.ArrayList;
import java.util.List;

@Setter
public class PaymentRepo {
    private List<Payment> payments;

    private PaymentRepo(List<Payment> payments) {
        this.payments = payments;
    }

    private static PaymentRepo PAYMENT_REPO_INSTANCE = new PaymentRepo(new ArrayList<>());

    public static PaymentRepo getInstance() {
        return PAYMENT_REPO_INSTANCE;
    }
}
