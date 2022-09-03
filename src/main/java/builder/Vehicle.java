package builder;


public class Vehicle {
    private String engine;
    private int wheel;
    private int airBags; // non-reqd args

    private Vehicle(VehicleBuilder vehicleBuilder){
        this.engine = vehicleBuilder.engine;
        this.wheel = vehicleBuilder.wheel;
        this.airBags = vehicleBuilder.airBags;
    }
    public static class VehicleBuilder{
        private String engine;
        private int wheel;
        private int airBags;

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirBags(int airBags){
            this.airBags = airBags;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheel=" + wheel +
                ", airBags=" + airBags +
                '}';
    }
}
