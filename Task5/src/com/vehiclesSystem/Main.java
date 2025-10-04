package com.vehiclesSystem;

import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.controller.BikeController;
import com.vehiclesSystem.controller.CarController;
import com.vehiclesSystem.controller.PlaneController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        CarController carController = context.getBean(CarController.class);
        carController.saveCar("Toyota");

        BikeController bikeController = context.getBean(BikeController.class);
        bikeController.saveBike("Yamaha");

        PlaneController planeController = context.getBean(PlaneController.class);
        planeController.savePlane("Airbus");

    }
}