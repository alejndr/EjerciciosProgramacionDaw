/* Ejercicio 2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Alejandro MV
 * 
 */


public class T3e2 {
	
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduce cuantos Euros quieres pasar a pesetas:  ");
    float euro = Integer.parseInt( System.console().readLine() );
    
    double coversor = 166.386;
    
    float conversion = ((float)euro * (float)coversor);
    
    System.out.println("Vamos a pasar: " + euro + "€ a pesetas" );
    System.out.printf("Conversion: %.2f Ptas", conversion);
    
    
    
	}
}
