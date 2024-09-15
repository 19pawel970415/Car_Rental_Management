package org.example.domain;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationServiceProxy implements ReservationService {



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
}
