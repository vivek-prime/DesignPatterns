package factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR, "Tata", "India");
        Vehicle bike = VehicleFactory.createVehicle(VehicleType.CAR, "Apache", "India");

        System.out.println(car);
        System.out.println(bike);
    }
}
