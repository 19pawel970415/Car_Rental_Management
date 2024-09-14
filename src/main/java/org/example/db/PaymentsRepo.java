package org.example.db;

import lombok.Setter;
import org.example.domain.Payment;

import java.util.ArrayList;
import java.util.List;

@Setter
public class PaymentsRepo {
    private List<Payment> payments;

    private PaymentsRepo(List<Payment> payments) {
        this.payments = payments;
    }

    private static PaymentsRepo PAYMENTS_REPO_INSTANCE = new PaymentsRepo(new ArrayList<>());

    public static PaymentsRepo getInstance() {
        return PAYMENTS_REPO_INSTANCE;
    }
}
