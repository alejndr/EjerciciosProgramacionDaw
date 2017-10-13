/* Ejercicio 10
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 */


public class T3e10 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Conversor de Megabytes a Kilobytes---: ");
    System.out.print("Por favor, introduce los Mb: ");
    int mega = Integer.parseInt( System.console().readLine() );

    System.out.print("Resultado: " + (mega*1024) + " Kb");
    
    
    
    
	}
}
