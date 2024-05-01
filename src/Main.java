import Service.ServiceStation;
import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Truck truck = new Truck("Isuzu", 6);
        serviceStation.check(truck);

        Car car = new Car("Toyota Corolla Runx", 4);
        serviceStation.check(car);

        Bicycle bicycle = new Bicycle("Stels", 2);
        serviceStation.check(bicycle);
    }
}