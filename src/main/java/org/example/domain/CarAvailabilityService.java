package org.example.domain;

import org.example.db.CarsRepo;

public class CarAvailabilityService implements CarAvailability {

    private static CarAvailabilityService CAR_AVAILABILITY_SERVICE_INSTANCE = new CarAvailabilityService();

    public static CarAvailabilityService getInstance() {
        return  CAR_AVAILABILITY_SERVICE_INSTANCE;
    }

    private static final CarsRepo CARS_REPO_INSTANCE = CarsRepo.getInstance();

    @Override
    public boolean isAvailable(Car car) {
        return CARS_REPO_INSTANCE.getCars().contains(car);
    }
}
