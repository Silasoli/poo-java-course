package application;

import model.Vehicle;

/**
 *
 * @author silas
 */
public class Main{

    public static void main(String[] args) {
    
        Vehicle vehicle1 = new Vehicle();
        
        vehicle1.name = "Lancer 2.0 Evolution X 4x4 16v Turbo";
        vehicle1.brand = "Mitsubishi";
        vehicle1.chassi = "753 AAlYEr 0g 8y9730";
        vehicle1.qtywheels = 4;
        
        System.out.println(vehicle1);
        vehicle1.turnOn();

        
    }
    

}
