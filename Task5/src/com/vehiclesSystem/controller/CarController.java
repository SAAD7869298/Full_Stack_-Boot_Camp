package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.CarDao;
import com.vehiclesSystem.models.CarVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {

    @Autowired
    private CarDao carDao;

    @Autowired
    private CarVehicle carVehicle;

    public void saveCar(String brand) {
        carVehicle.setBrand(brand);
        carDao.save(carVehicle);
    }
}
