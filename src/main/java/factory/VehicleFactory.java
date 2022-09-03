package factory;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType, String model, String country) {
        Vehicle vehicle;
        switch (vehicleType) {
            case CAR -> {
                vehicle = new Car(model, country);
                return vehicle;
            }
            case BIKE -> {
                vehicle = new Bike(model, country);
                return vehicle;
            }
            default -> {
                System.out.println("Wrong Vehicle Type");
                return null;
            }
        }
    }
}
