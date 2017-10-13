/* Ejercicio 9
 * 
 * Escribe un programa que calcule el volumen de un cono
 * 
 */


public class T3e9 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Calculador de volumen de conos---: ");
    System.out.print("Por favor, introduce el radio del cono en centímetros: ");
    float radio = Integer.parseInt( System.console().readLine() );
    System.out.print("Por favor, introduce la altura del cono en centímetros: ");
    float altura = Integer.parseInt( System.console().readLine() );
    
    float areaCirc = (radio*radio)*(float)3.141592;

    System.out.print("Volumen del cono: " + ((areaCirc*altura)/3) + " centímetros cúbicos");
    
    
    
    
	}
}



