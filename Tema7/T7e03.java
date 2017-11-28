/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 * 
 * @author Alejandro MV
 */



public class T7e03 {
  public static void main(String[] args) {
  System.out.println("Introduce 10 números enteros por teclado: ");
  int contadorInverso = 10;
  int mostrarArray = 9;
  int[] array = new int[10];


  for (int i = 0;i < 10;i++) {
    array[i] = Integer.parseInt( System.console().readLine() );

  }
  
  for (int i = 0;i < 10;i++) {
    System.out.println("Número " + contadorInverso + ": " + array[mostrarArray]);
    contadorInverso--;
    mostrarArray--;

  }

  


  }
  
}