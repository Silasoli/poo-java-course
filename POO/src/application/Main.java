package application;

import model.Vehicle;

/**
 *
 * @author silas
 */
public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();

        vehicle1.setName("Lancer 2.0 Evolution X 4x4 16v Turbo");
        vehicle1.setBrand("Mitsubishi");
        vehicle1.setChassi("753 AAlYEr 0g 8y9730");
        vehicle1.setQtywheels(4);
        
        vehicle1.supplyFuel(10);

        System.out.println(vehicle1);
        vehicle1.turnOn();

    }

}
