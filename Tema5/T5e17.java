/*
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Alejandro MV
 */


public class T5e17 {
  public static void main(String[] args) {
  System.out.println("Este programa nos va a sumar los siguientes 100 números siguientes al número introducido.");
  System.out.print("Introduce un número entero: ");
  int numero = Integer.parseInt(System.console().readLine());
  
  if (numero < 0) {
  System.out.print("El número tiene que ser positivo.");
  }
  
  for (int i = 0;i < 101;i++) {
    
  
  System.out.println(numero + "+" + i + "=" + (numero + i));
  }
  
  }
  
}
