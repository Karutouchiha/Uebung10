package main;

public class Vehicle {
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;

    Vehicle(String color,String owner, String manufacturer, String model, String licensePlate){
        this.color=color;
        this.owner=owner;
        this.manufacturer=manufacturer;
        this.model=model;
        this.licensePlate=licensePlate;
        System.out.print("Fahrzeug mit Nummer:"+licensePlate+"\n");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: "+getManufacturer()+"\n");
        sb.append("Model: "+getModel()+"\n");
        sb.append("Color: "+getColor()+"\n");
        sb.append("Licence Plate: "+getLicensePlate()+"\n");
        sb.append("Owner: "+getOwner()+"\n");
        sb.append("\n");
        return sb.toString();
    }
}
