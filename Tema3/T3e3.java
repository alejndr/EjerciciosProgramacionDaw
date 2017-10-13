/* Ejercicio 3
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Alejandro MV
 * 
 */


public class T3e3{
	
	public static void main (String[] args) {
		
    System.out.print("Por favor, introduce cuantas Pesetas quieres pasar a Euros:  ");
    float peseta = Integer.parseInt( System.console().readLine() );
    
    double coversor = 166.386;
    
    float conversion = ((float)peseta / (float)coversor);
    
    System.out.println("Vamos a pasar: " + peseta + "ptas a €" );
    System.out.printf("Conversion: %.2f €", conversion);
    
    
    
	}
}
