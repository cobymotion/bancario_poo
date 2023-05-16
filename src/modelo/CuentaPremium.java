
package modelo;

/**
 *
 * @author luiscobian
 */
public class CuentaPremium extends Cuenta {

    public CuentaPremium(String titular, double cuenta ) {
        super(cuenta, titular);
    }
    
    @Override
    public double retiro(double cantidad) {
        cantidad -= 5; 
        return super.deposito(cantidad);                                    
  
    }

}
