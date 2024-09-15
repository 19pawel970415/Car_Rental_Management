package org.example;

import org.example.db.CarsRepo;
import org.example.db.PaymentsRepo;
import org.example.domain.*;

import java.util.List;

public class Main {

    public static final PaymentsRepo PAYMENTS_REPO_INSTANCE = PaymentsRepo.getInstance();
    public static final ExternalPaymentAdapter EXTERNAL_PAYMENT_ADAPTER_INSTANCE = ExternalPaymentAdapter.getInstance();

    public static void main(String[] args) {
        CarsGenerator.generateCars();
        MarketsGenerator.generateMarkets();
        ReservationsGenerator.generateReservations();
        UsersGenerator.generateUsers();
        PaymentsGenerator.generatePayments();

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
    }
}