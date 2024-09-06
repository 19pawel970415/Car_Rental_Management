package org.example.domain;

import org.example.db.ReservationsRepo;
import org.example.db.UsersRepo;

import java.util.Arrays;
import java.util.List;

public class UserGenerator {

    private static final List<Reservation> RESERVATIONS = ReservationsRepo.getInstance().getReservations();

    public static void generateUsers() {
        User user = User.builder()
                .name("James")
                .surname("Bond")
                .email("jamesBond@gmail.com")
                .login("JamesBond")
                .password("jamesbond007")
                .reservations(Arrays.asList(RESERVATIONS.get(0), RESERVATIONS.get(1)))
                .build();

        ReservationsRepo.getInstance().getReservations().get(0).setUser(user);
        ReservationsRepo.getInstance().getReservations().get(1).setUser(user);

        User user1 = User.builder()
                .name("Ethan")
                .surname("Hunt")
                .email("ethanHunt@gmail.com")
                .login("EthanHunt")
                .password("missionimpossible")
                .reservations(Arrays.asList(RESERVATIONS.get(2), RESERVATIONS.get(3)))
                .build();

        ReservationsRepo.getInstance().getReservations().get(2).setUser(user1);
        ReservationsRepo.getInstance().getReservations().get(3).setUser(user1);

        User user2 = User.builder()
                .name("Jason")
                .surname("Bourne")
                .email("jasonBourne@gmail.com")
                .login("JasonBourne")
                .password("bourneidentity")
                .reservations(Arrays.asList(RESERVATIONS.get(4), RESERVATIONS.get(5)))
                .build();

        ReservationsRepo.getInstance().getReservations().get(4).setUser(user2);
        ReservationsRepo.getInstance().getReservations().get(5).setUser(user2);

        UsersRepo.getInstance().setUsers(
                Arrays.asList(
                        user,
                        user1,
                        user2
                )
        );
    }
}