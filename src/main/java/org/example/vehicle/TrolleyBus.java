package org.example.vehicle;

import java.time.LocalDate;

public class TrolleyBus extends Vehicle{

    public TrolleyBus(int id, String registrationNumber, int maxPassengerCapacity, String status, String fuelType, LocalDate lastServiceDate) {
        super(id, registrationNumber, maxPassengerCapacity, status, fuelType, lastServiceDate);
    }

    @Override
    public void determineStatus() {

    }


}
