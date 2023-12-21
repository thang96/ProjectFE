package LopTransportVaCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("A", "A1", 2021, 100, 6, "electric"));
        cars.add(new Car("B", "B2", 2022, 200, 5, "electric"));
        cars.add(new Car("C", "C3", 2023, 280, 4, "diesel"));

        System.out.println("Vận tốc cơ bản cao nhất :");
        ArrayList<Car> maxSpeedBasicCars = Car.getCarHaveMaxSpeedBasic(cars);
        for (Car car : maxSpeedBasicCars) {
            car.display();
            System.out.println();
        }

        System.out.println("Xe có số chỗ ngồi nhiều nhất :");
        ArrayList<Car> maxSeatCars = Car.getCarHaveMaxSeat(cars);
        for (Car car : maxSeatCars) {
            car.display();
            System.out.println();
        }
    }
}
