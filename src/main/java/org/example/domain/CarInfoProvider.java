package org.example.domain;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public interface CarInfoProvider {

    Random random = new Random();
    Supplier<String> plateNumber = () -> "EL" + random
            .ints(3, 0, 10)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining()) + "NN";

    default String getCarInfo() {
        return "The plate number is: " + plateNumber.get();
    }
}
