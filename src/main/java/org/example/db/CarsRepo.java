package org.example.db;

import lombok.Getter;
import org.example.domain.Car;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CarsRepo {
    private List<Car> cars = new ArrayList<>();
}
