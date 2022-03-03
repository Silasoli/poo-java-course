package model;

/**
 *
 * @author silas
 */
public class Vehicle {
    
    public String name;
    public String brand;
    public String chassi;
    public int qtywheels;
    
    public void turnOn(){
        System.out.println("Ligou o veículo!");
    }
    
     public void turnOff(){
        System.out.println("Desligou o veículo!");
    }
     
    @Override
    public String toString(){
        return "Nome: "+name+"\n"+"Marca: "+brand+"\n"+"Chassi: "+chassi+"\n"+"Quantidade de rodas: "+qtywheels;
    }
}
