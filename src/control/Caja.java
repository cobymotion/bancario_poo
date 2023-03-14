
package control;

import javax.swing.JOptionPane;
import vistas.DetalleCuenta;

/**
 * Clase que controla el manejo de las cuentas 
 * @author luiscobian
 */
public class Caja {
    /**
     * Inicial del programa 
     * @param args No no maneja argumentos
     */
    public static void main(String[] args) {
        
        double valorInicialCuenta = 300;
        boolean validado = false; 
        
        while (!validado){
            String valorEnCadena = JOptionPane.showInputDialog("Dame un valor");        
            try{
                valorInicialCuenta = Double.parseDouble(valorEnCadena);
                validado = true;
            }catch(NumberFormatException e){
                validado = false;
            }
        }
        
        DetalleCuenta dc = new DetalleCuenta
                             (null,true, valorInicialCuenta);
        dc.setVisible(true);
        
        
    }
}










