/* Ejercicio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * @author Alejandro MV
 * 
 */


public class T3e5 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Calculador de Area de rectangulos---: ");
    System.out.print("Por favor, introduce la altura de tu rectangulo en centímetros: ");
    float altura = Integer.parseInt( System.console().readLine() );
    System.out.print("Por favor, introduce la anchura de tu rectangulo en centímetros: ");
    float anchura = Integer.parseInt( System.console().readLine() );
    
    System.out.print("El area de tu rectangulo es: " + (altura * anchura) + " Centimetros cuadrados");
    
    
    
    
	}
}

