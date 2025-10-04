package com.vehiclesSystem.models;

import com.vehiclesSystem.config.DatabaseOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeVehicle implements Vehicle {
    public DatabaseOperations databaseOperations;

    private String brand;

    @Autowired
    public void setDatabaseOperations(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
    }

    public void saveToDatabase(Vehicle vehicle) {
        databaseOperations.save(vehicle);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
