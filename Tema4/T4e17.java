/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Alejandro mv
 */

public class T4e17 {
  public static void main(String[] args) {   
  System.out.print("Vamos a decir la ultima cifra de un número");
  System.out.print("Introduce un número(entero): ");
  int numero = Integer.parseInt(System.console().readLine());
  
  System.out.print("La ultima cifra de tu número es: " + numero%10);
  }
}


