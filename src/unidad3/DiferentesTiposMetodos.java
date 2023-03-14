
package unidad3;

/**
 * Probando diferentes tipos de metodos 
 * @author luiscobian
 */
public class DiferentesTiposMetodos {
    
    public static void main(String[] args) {
        DiferentesTiposMetodos obj = new 
            DiferentesTiposMetodos();
        obj.mensaje(); // invocación 
        String cadMayus = 
                 obj.aMayusculas(); //invocacion 2
        System.out.println("Valor " + cadMayus);
        obj.operacion(10); // invocacion 3 
        System.out.println("valor " +  
                 obj.calculo(76, 65));
        System.out.println(obj.aMayusculas());
        
    }

    //declaracion 4
    public double calculo(double v1, double v2){
        double total = v1 + v2; 
        double iva  = total * 0.16; 
        total += iva; 
        return total;
    }
    
    void operacion(int a){  // declaracion 3
        int cuadrado = a * a ; 
        System.out.println("Valor en cuadrado "
                + cuadrado);
    }
    
    protected String aMayusculas(){ //declaracion 2
        String cad = "Hola"; 
        cad=cad.toUpperCase();
        return cad;
    }
    
    private void mensaje(){   // declaracion
        System.out.println("Hola");
    }
    
}















