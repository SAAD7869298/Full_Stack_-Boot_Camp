package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.BikeDao;
import com.vehiclesSystem.models.BikeVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BikeController {

    @Autowired
    private BikeDao bikeDao;

    @Autowired
    private BikeVehicle bikeVehicle;

    public void saveBike(String brand) {
        bikeVehicle.setBrand(brand);
        bikeDao.save(bikeVehicle);
    }
}
