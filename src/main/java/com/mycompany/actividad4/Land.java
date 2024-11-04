
package com.mycompany.actividad4;


public class Land extends Vehicle implements IEngine{
    public short type;
    City city;

    public Land(short type, City city, int power, int year, String brand) {
        super(power, year, brand);
        this.type = type;
        this.city = city;
    }

  

    
    
    @Override
    String description() {
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
