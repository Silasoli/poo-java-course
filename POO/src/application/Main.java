package application;

import exceptions.ChassiExceptions;
import model.Car;

/**
 *
 * @author silas
 */
public class Main {

    public static void main(String[] args) throws ChassiExceptions {

        try {
            Car vehicle1 = new Car();

            vehicle1.setName("Lancer 2.0 Evolution X 4x4 16v Turbo");
            vehicle1.setBrand("Mitsubishi");
            vehicle1.setChassi("753AAlYEr0g8y9730");
            //vehicle1.setQtywheels(4);

            vehicle1.supplyFuel(10);

            System.out.println(vehicle1);
            vehicle1.turnOn();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
