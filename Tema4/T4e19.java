/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Alejandro mv
 */

public class T4e19 {
  public static void main(String[] args) {   
  System.out.print("Vamos a decir cuantas digitos tiene un número");
  System.out.print("Introduce un número: ");
  int numero = Integer.parseInt(System.console().readLine());

  if(numero == 0) numero++;
  System.out.println(Math.floor(Math.log10(Math.abs(numero)) + 1));
  }
}


