/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Alejandro mv
 */

public class T4e14 {
  public static void main(String[] args) {   
       
    System.out.print("Introduce un número: ");
    
    Double numero = Double.parseDouble(System.console().readLine());
    
    
    
    if (numero%2 == 0) {
      System.out.println("Tu numero es par");
    } else {
      System.out.println("Tu numero no es par");
      
    if (numero%5 == 0) {
      System.out.println("Tu número divisible entre 5.");
    } else {
      System.out.println("Tu número no es divisible entre 5.");
    }
    
    }
  }
}


