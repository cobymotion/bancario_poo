
package modelo;

/**
 *
 * @author luiscobian
 */
public class CuentaJunior extends Cuenta {
    private int edad; 

    public CuentaJunior(String titular, double cuenta, int edad) {
        super(cuenta, titular);
        this.edad = edad;
    }

    @Override
    public double retiro(double cantidad){
        cantidad += 20; 
        if(cantidad <= super.getCuenta())
            super.retiro(cantidad);
        return super.getCuenta(); 
    }
    
    
    @Override
    public double deposito(double cantidad) {
        cantidad -= 10; // pago por comision
        super.deposito(cantidad); 
        return getCuenta();                                    
  
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
}
