/* Ejercicio 5
 * @author Alejandro MV
 * 
 */


public class T2e5 {
	
	public static void main (String[] args) {
		
    float peseta = 200;
    double coversor = 166.386;
    
    float conversion = (float)(peseta / coversor);
    
    System.out.println("Vamos a pasar: " + peseta + " pesetas a €" );
    System.out.printf("Conversion: %.2f €", conversion);
    
    
    
	}
}
