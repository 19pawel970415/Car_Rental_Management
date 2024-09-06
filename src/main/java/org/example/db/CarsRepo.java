package org.example.db;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.Car;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CarsRepo {
    private List<Car> cars;

    private CarsRepo(List<Car> cars) {
        this.cars = cars;
    }

    private static CarsRepo CARS_REPO_INSTANCE;

    public static CarsRepo getInstance() {
        if(CARS_REPO_INSTANCE == null) {
            CARS_REPO_INSTANCE = new CarsRepo(new ArrayList<>());
        }
        return CARS_REPO_INSTANCE;
    }
}
