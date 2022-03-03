package model;

/**
 *
 * @author silas
 */
public class Vehicle {

    private String name;
    private String brand;
    private String chassi;
    private int qtywheels;
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

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getQtywheels() {
        return qtywheels;
    }

    public void setQtywheels(int qtywheels) {
        this.qtywheels = qtywheels;
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
        return "Nome: " + name + "\n" + "Marca: " + brand + "\n" + "Chassi: " + chassi + "\n" + "Quantidade de rodas: " + qtywheels+"\n"+ "Quantidade de gasolina: "+qtyFuel;
    }
}
