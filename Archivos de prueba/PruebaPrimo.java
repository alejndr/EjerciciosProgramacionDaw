/*
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Alejandro MV
 */


public class PruebaPrimo {
  public static void main(String[] args) {
  System.out.println("Este programa va a decirnos si el número introducido es primo o no.");
  System.out.print("Introduce un número entero: ");
  int numero = Integer.parseInt(System.console().readLine());
 
  boolean primo = true;
  
  for (int i = 2;i < numero;i++) {
  if ((numero%i) == 0) {
    primo = false;
  }
  
  }
  
  if (primo) {
  System.out.print("Tu número es primo");
  } else {
    System.out.print("Tu número no es primo");
    }
  
  }
  
}
