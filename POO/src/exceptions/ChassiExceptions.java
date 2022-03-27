/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author silas
 */
public class ChassiExceptions extends Exception {
    
    private static final long serialVersionUID = -3387516993124229948L;
    
    public ChassiExceptions(String chassi){
        super("Numero de chassi inválido: "+chassi);
    }
}
