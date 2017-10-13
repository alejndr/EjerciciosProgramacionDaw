/* Ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 */


public class T3e11 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Conversor de Kilobytes a Megabytes ---: ");
    System.out.print("Por favor, introduce los Kb: ");
    int kilo = Integer.parseInt( System.console().readLine() );

    System.out.print("Resultado: " + (kilo/1024) + " Mb");
    
    
    
    
	}
}

