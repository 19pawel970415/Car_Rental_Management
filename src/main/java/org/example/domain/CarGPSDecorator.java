package org.example.domain;

import java.util.Random;
import java.util.function.Supplier;

public class CarGPSDecorator implements CarInfoProvider {

    private CarInfoProvider carInfoProvider;

    private Random random = new Random();
    private Supplier<String> infoAboutGPSProvider = () -> (random.nextInt(3) == 1) ? "The car has a GPS" : "The car has no GPS";

    public CarGPSDecorator(CarInfoProvider carInfoProvider) {
        this.carInfoProvider = carInfoProvider;
    }

    @Override
    public String getCarInfo() {
        return infoAboutGPSProvider.get() + "\n" + carInfoProvider.getCarInfo();
    }
}
