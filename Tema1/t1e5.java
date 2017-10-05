/* Ejercicio 5
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
 * de un color diferente.
 * @author Alejandro MV
 */


public class t1e5 { // Clase principal
  public static void main(String[] args) {
	  
	String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String cyan = "\033[1;36m";
	  
    System.out.printf("%s\n",cyan + "      Horario 1º de DAW");
    System.out.printf("%-6s  %-6s  %-6s  %-6s  %-6s\n" ,naranja + "SINF",azul + "PROG",naranja + "SINF",azul + "PROG",azul + "PROG");
    System.out.printf("%-6s  %-6s  %-6s  %-6s  %-6s\n" ,naranja + "SINF",azul + "PROG",naranja + "SINF",azul + "PROG",azul + "PROG");
    System.out.printf("%-6s  %-6s  %-6s  %-6s  %-6s\n" ,naranja + "SINF",azul + "PROG",naranja + "SINF",azul + "PROG",blanco + "ENTO");
    System.out.printf("%s\n" ,cyan + "           Recreo"  );
    System.out.printf("%-7s  %-6s  %-6s  %-6s  %-6s\n" ,verde + "FOL ",morado + "BBDD",blanco + "ENTO",morado + "BBDD",rojo + "MARC");
    System.out.printf("%-7s  %-6s  %-6s  %-6s  %-6s\n" ,verde + "FOL ",morado + "BBDD",blanco + "ENTO",morado + "BBDD",rojo + "MARC");
    System.out.printf("%-7s  %-6s  %-6s  %-6s  %-6s\n" ,verde + "FOL ",morado + "BBDD",rojo + "MARC",morado + "BBDD",rojo + "MARC");
  }
}
