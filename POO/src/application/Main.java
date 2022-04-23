package application;

import exceptions.ChassiExceptions;
import model.Bicycle;
import model.Car;

/**
 *
 * @author silas
 */
public class Main {

    public static void main(String[] args) throws ChassiExceptions {

        try {
            Car vehicle1 = new Car();
            //vehicle1.setName("Lancer 2.0 Evolution X 4x4 16v Turbo");
            //vehicle1.setBrand("Mitsubishi");
            //vehicle1.setChassi("753AAlYEr0g8y9730");
            //vehicle1.setQtywheels(4);

            //vehicle1.supplyFuel(10);
            //System.out.println(vehicle1);
            //vehicle1.turnOn();
            Car vehicle2 = new Car("Lancer EVO", "Mitsubishi");
            System.out.println(vehicle2.getName());

            vehicle2.setQtyDoors(4);
            
            Car vehicle3 = new Car("Lancer 2012", "Mitsubishi", "753AAlYEr0g8y9729");
            System.out.println(vehicle3.getName());

            Bicycle vehicle4 = new Bicycle("Caloi");
            System.out.println(vehicle4.getBrand());

            //vehicle4.setQtyDoors() não funciona pois essa propriedade é do carro e não da bicicleta
            
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
