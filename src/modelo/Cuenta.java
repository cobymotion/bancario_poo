
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
    private String titular; 
    private boolean status; 
    private String numeroCuenta;

    /**
     * Constructor para crear la clase
     */
    public Cuenta(double cuenta, String titular) {
        this.cuenta = cuenta;
        this.titular = titular; 
        numeroCuenta = "001";
        status = true;
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
    public double retiro(double cantidad){
        cuenta -=cantidad; 
            return cuenta; 
    }
    /**
     * Aumenta una cantidad a la cuenta
     */
    public double deposito(double cantidad) {
        cuenta += cantidad; 
        System.out.println("Saldo cuenta:" + cuenta); 
        return cuenta;                                    
  
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitular() {
        return titular;
    }
    
    
    
}












