package org.example.domain;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationServiceProxy implements ReservationService {

    private static ReservationServiceProxy RESERVATION_SERVICE_PROXY_INSTANCE = new ReservationServiceProxy();

    public static ReservationServiceProxy getInstance() {
        return RESERVATION_SERVICE_PROXY_INSTANCE;
    }

    @Override
    public boolean isAuthorized(User user) {
        if (user.getCountry().equals(Country.GERMANY)) {
            List<Reservation> newUsersReservations = user.getReservations().stream()
                    .filter(r -> !(r.getMarket() instanceof ForeignMarket))
                    .collect(Collectors.toList());
            if (newUsersReservations.size() < user.getReservations().size()) {
                System.out.println("A German has no access to foreign markets");
                user.setReservations(newUsersReservations);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public void transit(Reservation reservation) {
        if (!(reservation.getReservationState() instanceof PaidReservation)) {
            reservation.setReservationState(reservation.getReservationState().nextState().get());
        } else {
            throw new IllegalStateException("PaidReservation cannot transition to another state");
        }
    }
}
