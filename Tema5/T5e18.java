/*
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 * 
 * @author Alejandro MV
 */


public class T5e18 {
  public static void main(String[] args) {
  System.out.println("Este programa nos va a sacar los números que haya de 7 en 7 entre 2 números enteros introducidos");
  System.out.print("Introduce el primer número entero: ");
  int numero1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el segundo número entero: ");
  int numero2 = Integer.parseInt(System.console().readLine());
  
  
  
  while (numero1 < (numero2 - 7)) {
    
  System.out.println((numero1 + 7));
  
  numero1 = numero1 + 7;
  
  }
  
  }
  
}
