package LopTransportVaCar;

import java.util.ArrayList;

public class Car extends Transport {
    private int numberSeat;
    private String engineType;

    public Car() {
    }

    public Car(String manufacturer, String name, int year, int speed, int numberSeat, String engineType) {
        super(manufacturer, name, year, speed);
        this.numberSeat = numberSeat;
        this.engineType = engineType;
    }

    public double getSpeedBasic() {
        return (double) getSpeed() / numberSeat;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Số chỗ ngồi: " + numberSeat);
        System.out.println("Loại động cơ: " + engineType);
        System.out.println("Vận tốc cơ bản: " + getSpeedBasic());
    }

    public static ArrayList<Car> getCarHaveMaxSpeedBasic(ArrayList<Car> cars) {
        double maxSpeedBasic = Double.MIN_VALUE;
        ArrayList<Car> result = new ArrayList<>();

        for (Car car : cars) {
            double speedBasic = car.getSpeedBasic();
            if (speedBasic > maxSpeedBasic) {
                maxSpeedBasic = speedBasic;
                result.clear();
                result.add(car);
            } else if (speedBasic == maxSpeedBasic) {
                result.add(car);
            }
        }

        return result;
    }

    public static ArrayList<Car> getCarHaveMaxSeat(ArrayList<Car> cars) {
        int maxSeat = Integer.MIN_VALUE;
        ArrayList<Car> result = new ArrayList<>();

        for (Car car : cars) {
            int seat = car.getNumberSeat();
            if (seat > maxSeat) {
                maxSeat = seat;
                result.clear();
                result.add(car);
            } else if (seat == maxSeat) {
                result.add(car);
            }
        }

        return result;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
