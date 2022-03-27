/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author silas
 */
public class Car extends Vehicle {

    public Car(){
        this.qtywheels = 4;
    }

    @Override
   public String toString() {
        return "Nome: " + getName() + "\n" + "Marca: " + getBrand() + "\n" + "Chassi: " + getChassi() + "\n" + "Quantidade de rodas: " + getQtywheels() +"\n"+ "Quantidade de gasolina: "+getQtyFuel();
    }
    
    
    
}
