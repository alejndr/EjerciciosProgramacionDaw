/* Ejercicio 7
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 */


public class T3e7 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Calculador de IVA general---: ");
    System.out.print("Por favor, introduce la base imponible: ");
    float baseImp = Integer.parseInt( System.console().readLine() );

    System.out.print("Total con IVA del 21%: " + (baseImp+(baseImp*0.21)) + " €");
    
    
    
    
	}
}


