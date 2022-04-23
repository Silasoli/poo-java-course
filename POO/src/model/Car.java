/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import exceptions.ChassiExceptions;

/**
 *
 * @author silas
 */
public class Car extends Vehicle {

    public Car() {
        this.qtywheels = 4;
    }
    //public Car(String name, float value) {}

    //public Car(float km, String name) {}
    public Car(String name, String brand) {
        this.qtywheels = 4;
        this.setName(name);
        this.setBrand(brand);
    }

    public Car(String name, String brand, String chassi) throws ChassiExceptions {
        this.qtywheels = 4;
        this.setName(name);
        this.setBrand(brand);
        this.setChassi(chassi);
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\n" + "Marca: " + getBrand() + "\n" + "Chassi: " + getChassi() + "\n" + "Quantidade de rodas: " + getQtywheels() + "\n" + "Quantidade de gasolina: " + getQtyFuel();
    }

}
