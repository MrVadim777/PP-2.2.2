package web.service.impl;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = List.of(
            new Car("Red", "Toyota", 1),
            new Car("Black", "BMW", 3),
            new Car("White", "Tesla", 2),
            new Car("Blue", "Audi", 4),
            new Car("Grey", "Mercedes", 5)
    );

    @Override
    public List<Car> getCars(int count) {
        return carList.subList(0, Math.min(count, carList.size()));
    }
}
