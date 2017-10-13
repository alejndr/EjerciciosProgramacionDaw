/* Ejercicio 8
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 * 
 */


public class T3e8 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Calculador de IVA general---: ");
    System.out.print("Por favor, introduce las horas que has trabajado esta semana: ");
    float horas = Integer.parseInt( System.console().readLine() );

    System.out.print("Salario semanal: " + (horas*12) + " €");
    
    
    
    
	}
}



