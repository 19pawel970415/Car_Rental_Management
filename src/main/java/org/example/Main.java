package org.example;

import org.example.domain.CarsGenerator;
import org.example.domain.MarketsGenerator;
import org.example.domain.ReservationsGenerator;
import org.example.domain.UsersGenerator;

public class Main {
    public static void main(String[] args) {
        CarsGenerator.generateCars();
        MarketsGenerator.generateMarkets();
        ReservationsGenerator.generateReservations();
        UsersGenerator.generateUsers();
        //TODO
        /*
        Expand the existing car reservation management system by implementing the Adapter pattern
        to integrate with a new external library for the payment system.
        Create a PaymentProcessor interface, which will have a method processPayment(Order order).
        Then, create a class ExternalPaymentSystem, which has its own payment methods,
        but their signatures differ from your interface.
        Create an adapter, ExternalPaymentAdapter, which will adapt the external payment system to your interface.
         */
    }
}