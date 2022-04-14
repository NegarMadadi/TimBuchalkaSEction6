package org.example.sec6.car;

public class Car {

    private int doors;
    private int wheela;
    private String model;
    private String engine;
    private String colur;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }else{
            this.model= "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
