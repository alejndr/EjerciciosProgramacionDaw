/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 * 
 * @author Alejandro MV
 */



public class T7e05 {
  public static void main(String[] args) {
    
    System.out.println("Introduce 10 numeros enteros por teclado: ");
    int maximo = 0;
    int minimo = Integer.MAX_VALUE;
    int mostrarArray = 0;
    int[] array = new int[10];


    for (int i = 0;i < 10;i++) {
      array[i] = Integer.parseInt( System.console().readLine() );
      if (array[i] > maximo) {
        maximo = array[i];
      }
      if (array[i] < minimo) {
        minimo = array[i];
      }
    }
    
    System.out.println("Numeros introducidos con minimo y maximo señalados");
    for (int i = 0;i < 10;i++) {
      System.out.print(array[mostrarArray]);
      

      if (array[mostrarArray] == minimo) {
        System.out.print(" (minimo)");
      }

      if (array[mostrarArray] == maximo) {
        System.out.print(" (maximo)");
      }
      mostrarArray++;
      System.out.println("");

    }
  
  }
  
}