/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Alejandro MV
 */
public class T5e7 {
  public static void main(String[] args) {
    
    int intento = 0;
    
    while (intento < 4) {
    
    System.out.print("Caja fuerte cerrada, introduce la clave de 4 dígitos: ");
    int intpass = Integer.parseInt(System.console().readLine());
    
    if (intpass == 1337){
    System.out.print("La caja fuerte se ha abierto satisfactoriamente");
    intento = 4;
    } else {
    System.out.println("Lo siento, esa no es la combinación");  
    
    }
    
    intento = intento + 1;
    ;
    }
  }
}
