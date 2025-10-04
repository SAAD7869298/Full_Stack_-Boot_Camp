package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.PlaneDao;
import com.vehiclesSystem.models.PlaneVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PlaneController {

    @Autowired
    private PlaneDao planeDao;

    @Autowired
    private PlaneVehicle planeVehicle;

    public void savePlane(String brand) {
        planeVehicle.setBrand(brand);
        planeDao.save(planeVehicle);
    }
}
