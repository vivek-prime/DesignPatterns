package factory;

import lombok.Data;

@Data
public abstract class Vehicle {
    private String model;
    private String country;

    public Vehicle(String model, String country) {
        this.model = model;
        this.country = country;
    }
}
