package model;

import exceptions.ChassiExceptions;

/**
 *
 * @author silas
 */
public class Vehicle {

    private String name;
    private String brand;
    private String chassi;
    protected int qtyWheels;
    private float qtyFuel = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws ChassiExceptions {
        if(chassi.length()==17){
            this.chassi = chassi;
        } else {
            throw new ChassiExceptions(chassi);
        }
        
    }

    public int getQtyWheels() {
        return qtyWheels;
    }

    public void setQtywheels(int qtyWheels) {
        this.qtyWheels = qtyWheels;
    }

    public float getQtyFuel() {
        return qtyFuel;
    }

    public void supplyFuel(float liters){
        qtyFuel += liters;
        
    }
    
    
    
    public void turnOn() {
        System.out.println("Ligou o veículo!");
    }

    public void turnOff() {
        System.out.println("Desligou o veículo!");
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" + "Marca: " + brand + "\n" + "Chassi: " + chassi + "\n" + "Quantidade de rodas: " + qtyWheels+"\n"+ "Quantidade de gasolina: "+qtyFuel;
    }
}
