package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "BMW", 777));
        cars.add(new Car(2L, "Lexus", 888));
        cars.add(new Car(3L, "Audi", 666));
        cars.add(new Car(4L, "Запорожец", 111));
               return cars;
    }
}
