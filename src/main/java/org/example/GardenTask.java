package org.example;

import java.time.LocalDate;

public class GardenTask extends Task {

    private String gardenLocation;

    public GardenTask(String task, String description, LocalDate duedate, String gardenLocation) {

        super(task, description, duedate);
        this.gardenLocation = gardenLocation;
    }

    public String getGardenLocation() {
        return gardenLocation;
    }

    public void setGardenLocation(String gardenLocation) {
        this.gardenLocation = gardenLocation;
    }

    @Override
    public String toString() {
        return super.toString()+" | Lokation:{" +
                "gardenLocation='" + gardenLocation + '\'' +
                '}';
    }
}
