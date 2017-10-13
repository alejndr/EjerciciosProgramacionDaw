/* Ejercicio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * @author Alejandro MV
 * 
 */


public class T3e6 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Calculador de Area de triangulos---: ");
    System.out.print("Por favor, introduce la altura de tu triangulo en centimetros: ");
    float altura = Integer.parseInt( System.console().readLine() );
    System.out.print("Por favor, introduce la anchura de tu triangulo en centimetros: ");
    float anchura = Integer.parseInt( System.console().readLine() );
    
    System.out.print("El area de tu triangulo es: " + ((altura * anchura)/2) + " Centimetros cuadrados");
    
    
    
    
	}
}


