
package com.mycompany.actividad4;


abstract class Vehicle {
    protected int power;
    protected int year;
    protected String brand;

    public Vehicle(int power, int year, String brand) {
        this.power = power;
        this.year = year;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    
    abstract String description();
}
