package org.example.vehicle;


import java.time.LocalDate;

public abstract class Vehicle {
    private int id;
    private String registrationNumber;
    private int maxPassengerCapacity;
    private String status;
    private String fuelType;
    private LocalDate lastServiceDate;

    public Vehicle(int id, String registrationNumber, int maxPassengerCapacity, String status, String fuelType, LocalDate lastServiceDate) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.maxPassengerCapacity = maxPassengerCapacity;
        this.status = status;
        this.fuelType = fuelType;
        this.lastServiceDate = lastServiceDate;
    }


    public abstract void determineStatus();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public LocalDate getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(LocalDate lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
