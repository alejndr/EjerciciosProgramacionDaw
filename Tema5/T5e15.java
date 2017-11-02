/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * 
 * @author Alejandro MV
 */


public class T5e15 {
  public static void main(String[] args) {
  System.out.print("Introduce la base: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el exponente: ");
  int exponente = Integer.parseInt(System.console().readLine());
  
  int veces = 0;
  
  while(veces < exponente){
  
  System.out.println(base + "^" + (veces+1));
  
  veces ++;
  }
  
  }
  
}
