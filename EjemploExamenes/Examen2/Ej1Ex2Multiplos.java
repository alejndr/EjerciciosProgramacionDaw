/*
 * Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá mostrar por
 * separado los múltiplos de 2, de 3 y de 5.
 * 
 * @author Alejandro MV
 */



public class Ej1Ex2Multiplos {
  public static void main(String[] args) {
    int[] primer = new int[20]; 

    for (int i = 0;i < 20;i++) {
      primer[i] = (int)(Math.random()*100+1);
    }

    System.out.print("Array original:");
    for (int n : primer) {
      System.out.print(" " + n);
    }
    System.out.println("");

    System.out.print("Multiplos de 2: ");
    for (int i = 0;i < 20;i++) {
      if (primer[i]%2 == 0) {
        System.out.print(" " + primer[i]);
      }
    }
    System.out.println("");

    System.out.print("Multiplos de 3: ");
    for (int i = 0;i < 20;i++) {
      if (primer[i]%3 == 0) {
        System.out.print(" " + primer[i]);
      }
    }
    System.out.println("");

    System.out.print("Multiplos de 5: ");
    for (int i = 0;i < 20;i++) {
      if (primer[i]%5 == 0) {
        System.out.print(" " + primer[i]);
      }
    }
    System.out.println("");
  }
  
}