package com.vehiclesSystem.dao;

import com.vehiclesSystem.config.DatabaseOperations;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeDao {

    @Autowired
    private DatabaseOperations databaseOperations;

    public void save(Vehicle vehicle) {
        databaseOperations.save(vehicle);
    }
}
