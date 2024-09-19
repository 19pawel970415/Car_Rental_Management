package org.example;

import org.example.db.*;
import org.example.domain.*;

import java.util.Iterator;
import java.util.List;

public class Main {

    private static final PaymentsRepo PAYMENTS_REPO_INSTANCE = PaymentsRepo.getInstance();
    private static final UsersRepo USERS_REPO_INSTANCE = UsersRepo.getInstance();
    private static final ExternalPaymentAdapter EXTERNAL_PAYMENT_ADAPTER_INSTANCE = ExternalPaymentAdapter.getInstance();
    private static final CarAvailabilityService CAR_AVAILABILITY_SERVICE_INSTANCE = CarAvailabilityService.getInstance();
    private static final ReservationConfirmationService RESERVATION_CONFIRMATION_SERVICE_INSTANCE = ReservationConfirmationService.getInstance();
    private static final EmployeesRepo EMPLOYEES_REPO_INSTANCE = EmployeesRepo.getInstance();
    private static final GroupChat GROUP_CHAT_INSTANCE = GroupChat.getInstance();
    private static final ReservationsRepo RESERVATION_REPO_INSTANCE = ReservationsRepo.getInstance();

    public static void main(String[] args) {
        CarsGenerator.generateCars();
        MarketsGenerator.generateMarkets();
        ReservationsGenerator.generateReservations();
        UsersGenerator.generateUsers();
        PaymentsGenerator.generatePayments();
        EmployeesGenerator.generateEmployees();
        ReservationService reservationService = new ReservationServiceProxy();

        for (Payment payment : PAYMENTS_REPO_INSTANCE.getPayments()) {
            EXTERNAL_PAYMENT_ADAPTER_INSTANCE.processPayment(payment);
        }


        List<Car> cars = CarsRepo.getInstance().getCars();

        CarInfoProvider car = cars.get(0);
        CarInfoProvider car1 = cars.get(1);
        CarInfoProvider car2 = cars.get(2);

        System.out.println(car.getCarInfo());
        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());

        CarInfoProvider car3 = cars.get(3);
        CarInfoProvider car4 = cars.get(4);
        CarInfoProvider car5 = cars.get(5);

        CarInfoProvider car3Insurance = new CarInsuranceDecorator(car3);
        CarInfoProvider car4Insurance = new CarInsuranceDecorator(car4);
        CarInfoProvider car5Insurance = new CarInsuranceDecorator(car5);

        System.out.println(car3Insurance.getCarInfo());
        System.out.println(car4Insurance.getCarInfo());
        System.out.println(car5Insurance.getCarInfo());

        CarInfoProvider car6 = cars.get(6);
        CarInfoProvider car7 = cars.get(7);
        CarInfoProvider car8 = cars.get(8);

        CarInfoProvider car6GPS = new CarGPSDecorator(car6);
        CarInfoProvider car7GPS = new CarGPSDecorator(car7);
        CarInfoProvider car8GPS = new CarGPSDecorator(car8);

        System.out.println(car6GPS.getCarInfo());
        System.out.println(car7GPS.getCarInfo());
        System.out.println(car8GPS.getCarInfo());

        CarInfoProvider carFullInfo = new CarInsuranceDecorator(new CarGPSDecorator(car));
        System.out.println(carFullInfo.getCarInfo());

        ReservationProcessFacade reservationProcessFacade = new ReservationProcessFacade(
                CAR_AVAILABILITY_SERVICE_INSTANCE,
                EXTERNAL_PAYMENT_ADAPTER_INSTANCE,
                RESERVATION_CONFIRMATION_SERVICE_INSTANCE
        );

        reservationProcessFacade.reserve(cars.get(0), PAYMENTS_REPO_INSTANCE.getPayments().get(0));

        ReservationServiceProxy service = new ReservationServiceProxy();
        boolean isAuthorized = service.isAuthorized(USERS_REPO_INSTANCE.getUsers().get(2));
        System.out.println("User authorized: " + isAuthorized);

        Iterator<Employee> iterator = EMPLOYEES_REPO_INSTANCE.iterator();

        for (Employee employee : EMPLOYEES_REPO_INSTANCE) {
            if (iterator.hasNext()) {
                if (employee instanceof Manager) {
                    String message = "Hi team!";
                    Manager empl = (Manager) employee;
                    GROUP_CHAT_INSTANCE.sendMessage(empl, message);
                } else {
                    String message = "Hi manager!";
                    RentalRepresentative empl = (RentalRepresentative) employee;
                    GROUP_CHAT_INSTANCE.sendMessage(empl, message);
                }
            }
        }

        for (Reservation reservation : RESERVATION_REPO_INSTANCE.getReservations()) {
            reservationService.transit(reservation);
        }

        RESERVATION_REPO_INSTANCE.getReservations().stream()
                .map(Reservation::getReservationState)
                .forEach(ReservationState::getStateInfo);

        for (Reservation reservation : RESERVATION_REPO_INSTANCE.getReservations()) {
            if (reservation.getMarket() instanceof DomesticMarket) {
                reservationService.transit(reservation);
            }
        }

        RESERVATION_REPO_INSTANCE.getReservations().stream()
                .map(Reservation::getReservationState)
                .forEach(ReservationState::getStateInfo);

        reservationService.transit(RESERVATION_REPO_INSTANCE.getReservations().get(3));
    }
}