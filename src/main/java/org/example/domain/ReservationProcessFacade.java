package org.example.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReservationProcessFacade {

    private CarAvailabilityService carAvailabilityService;
    private ExternalPaymentAdapter externalPaymentAdapter;
    private ReservationConfirmationService reservationConfirmationService;

    public void reserve(Car car, Payment payment) {
        boolean isAvailable = carAvailabilityService.isAvailable(car);
        if (isAvailable) {
            externalPaymentAdapter.processPayment(payment);
            reservationConfirmationService.confirm(payment);
        } else {
            System.out.println("No such car available");
        }
    }

}
