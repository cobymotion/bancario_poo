
package modelo;
// import pendientes

import javax.swing.JOptionPane;

/**
 * Clase que permite controlar las operaciones con 
 * la cuenta
 * @author luiscobian
 * 14 febrero 
 */
public class Cuenta {
       // Atributos 
    private double cuenta; 

    /**
     * Constructor para crear la clase
     */
    public Cuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo para regresar el valor de la cuenta 
     * @return un double con el valor 
     */
    public double getCuenta() {
        return cuenta;
    }
    
    
    /**
     * Disminuye una cantidad a la cuenta
     */
    public void retiro(){
        if(cuenta>=100){
            cuenta -=100; 
        } else {
            System.out.println("Error no saldo suf");            
        }
        System.out.println("Saldo cuenta: " + 
                                         cuenta);
    }
    /**
     * Aumenta una cantidad a la cuenta
     */
    public void deposito() {
        cuenta += 100; 
        System.out.println("Saldo cuenta: " 
                                    + cuenta);        
    }
}












