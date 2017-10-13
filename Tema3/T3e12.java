/* Ejercicio 12
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 */


public class T3e12 {
	
	public static void main (String[] args) {
		
    System.out.println("    ---Calculador de medias---: ");
    System.out.print("Introduce la nota del primer examen: ");
    int nota = Integer.parseInt( System.console().readLine() );
    System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
    int notaTri = Integer.parseInt( System.console().readLine() );
    
    int nota2 = ((notaTri * 100) - (nota * 40)) / 60;

    System.out.print("Para tener un: " + notaTri + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    
	}
}


