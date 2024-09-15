package org.example.domain;

public class ReservationConfirmationService implements ReservationConfirmation {

    private static ReservationConfirmationService RESERVATION_CONFIRMATION_SERVICE_INSTANCE = new ReservationConfirmationService();

    public static ReservationConfirmationService getInstance() {
        return RESERVATION_CONFIRMATION_SERVICE_INSTANCE;
    }

    @Override
    public void confirm(Payment payment) {
        if (payment.getStatus().equals(PaymentStatus.PAID)) {
            System.out.println("Reservation confirmed");
        } else {
            System.out.println("Payment failed");
        }
    }
}
