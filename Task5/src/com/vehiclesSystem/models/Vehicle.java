package com.vehiclesSystem.models;

public interface Vehicle
{
    void saveToDatabase(Vehicle vehicle);

    String getBrand();
}
