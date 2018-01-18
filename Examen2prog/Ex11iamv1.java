/*
 * Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa deberá llevar el mínimo
 * a la primera posición del array y el máximo a la última, dejando el resto de valores en las posiciones
 * intermedias, en el mismo orden en que aperecieron, llenando los huecos que dejan el máximo y el
 * mínimo. Se puede trabajar sobre un solo array o sobre varios, como el alumno estime oportuno. Si el
 * máximo y/o el mínimo se repite en el array, da igual cuál de ellos se escoja para colocar el primero o el
 * último, siempre que el resultado sea correcto.
 * 
 * Jueves 14 de diciembre 2017
 * Segundo turno
 * @author Alejandro MV
 */



public class Ex11iamv1 {
  public static void main(String[] args) {
    
    int[] primerArray = new int[20]; 
    int mayor  = 0;
    int menor = Integer.MAX_VALUE;

    for (int i = 0;i < 20;i++) {
      primerArray[i] = (int)(Math.random()*100+1);
    }

    System.out.print("Primer array: ");
    for (int n : primerArray) {
      System.out.print(" " + n);
    }

    for (int i = 0;i < 20;i++) {
      if (primerArray[i] > mayor) {
        mayor = primerArray[i];
      }
    }

    for (int i = 0;i < 20;i++) {
      if (primerArray[i] < menor) {
        menor = primerArray[i];
      }
    }

    for (int i = 0;i < 20;i++) {
      if (primerArray[i] == menor) {
        primerArray[i] = primerArray[0];
        primerArray[0] = menor;
      }
    }

    for (int i = 0;i < 20;i++) {
      if (primerArray[i] == mayor) {
        primerArray[i] = primerArray[19];
        primerArray[19] = mayor;
      }
    }
    
    System.out.println("");
    System.out.print("Array ordenado: ");
    for (int n : primerArray) {
      System.out.print(" " + n);
    }


  }
  
}