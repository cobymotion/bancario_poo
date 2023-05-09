
package control;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import vistas.AgregarCuenta;
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

        try {
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        } catch (Exception ex) {
            System.out.println("Ocurrio un errorsito");
        } 
        
        var ventanaAgregar = new AgregarCuenta(null,
                true); 
        ventanaAgregar.setVisible(true);
        
        
        
    }
}










