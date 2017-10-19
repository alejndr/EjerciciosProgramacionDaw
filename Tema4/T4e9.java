/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0).
 *
 * @author Alejandro mv
 */

public class T4e5 {
  public static void main(String[] args) {   
       
    System.out.println("Vamos a resolver una ecuacion de segundo grado, del tipo: ax+b=0");
    System.out.print("Por favor, introduce A: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce B: ");
    Double b = Double.parseDouble(System.console().readLine());
    
    if (a < 1) {
      System.out.println("Ecuacion imposible, por favor introduce un número mayor que 1 en a ");
    } else {
      System.out.println("X es igual a: " + (-b/a));
    }
  }
}


