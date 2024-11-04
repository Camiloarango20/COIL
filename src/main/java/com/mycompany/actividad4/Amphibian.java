
package com.mycompany.actividad4;


public class Amphibian extends Vehicle implements IWatherVehicle,IEngine{
    public String type;

    @Override
    String description() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Amphibian(String type, int power, int year, String brand) {
        super(power, year, brand);
        this.type = type;
    }

    @Override
    public void pathPrograming() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveWheels() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveJetPropulsion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
  
    
    
}
