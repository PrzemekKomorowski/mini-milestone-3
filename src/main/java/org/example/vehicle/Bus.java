package org.example.vehicle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Bus extends Vehicle{

    private int pollutionIndicator;

    public Bus(int id, String registrationNumber, int maxPassengerCapacity, String status, String fuelType,int pollucionIndicator, LocalDate lastServiceDate) {
        super(id, registrationNumber, maxPassengerCapacity, status, fuelType, lastServiceDate);
        this.pollutionIndicator = pollutionIndicator;
    }


    public int getPollutionIndicator(){
        return pollutionIndicator;
    }

    public void setPollutionIndicator(int pollutionIndicator) {
        this.pollutionIndicator = pollutionIndicator;
    }

    private int monthsBetween(LocalDate date1, LocalDate date2) {
        return (int) ChronoUnit.MONTHS.between(date1, date2);
    }




    @Override
    public void determineStatus() {
        LocalDate now = LocalDate.now();
        LocalDate lastServiceDate = getLastServiceDate();
        int monthsBetween = monthsBetween(lastServiceDate, now);
        if (monthsBetween >= 0 && monthsBetween <= 6 && pollutionIndicator > 5) {
            setStatus("w eksploatacji");
        } else if (monthsBetween >= 0 && monthsBetween <= 12 && pollutionIndicator >= 3 && pollutionIndicator <= 5) {
            setStatus("do naprawy");
        } else {
            setStatus("na złom");
        }
    }




}
