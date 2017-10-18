/**
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author Alejandro mv
 */

public class T4e5 {
  public static void main(String[] args) {   
       
    System.out.println("Vamos a resolver una ecuacion de segundo grado, del tipo: ax+b=0");
    System.out.println("Por favor, introduce A: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduce B: ");
    Double b = Double.parseDouble(System.console().readLine());
    
    if (a < 1) {
      System.out.println("Ecuacion imposible, por favor introduce un número mayor que 1 en a ");
    } else {
      System.out.println("X es igual a: " + (-b/a));
    }
  }
}

