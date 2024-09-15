package org.example.domain;

import java.util.Random;
import java.util.function.Supplier;

public class CarInsuranceDecorator implements CarInfoProvider {

    private CarInfoProvider carInfoProvider;

    private Random random = new Random();
    private Supplier<String> insuranceTypeProvider = () -> String.valueOf(InsurenceType.getValueBasedOnNumber(random.nextInt(4)));

    public CarInsuranceDecorator(CarInfoProvider carInfoProvider) {
        this.carInfoProvider = carInfoProvider;
    }

    @Override
    public String getCarInfo() {
        return "The cas has " + insuranceTypeProvider.get() + " insurance \n" + carInfoProvider.getCarInfo();
    }
}
