package builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Vehicle tataNexon = new Vehicle.VehicleBuilder("CNG", 4).setAirBags(2).build();
        Vehicle hyundaiVerna = new Vehicle.VehicleBuilder("CNG", 4).setAirBags(4).build();
        System.out.println(tataNexon);
        System.out.println(hyundaiVerna);
    }
}
