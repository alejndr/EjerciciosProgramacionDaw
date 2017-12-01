/*
 * Escribe un programa que muestre 50 números enteros aleatorios comprendi-
 * dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author Alejandro MV
 */



public class T6e19 {
  public static void main(String[] args) {
  
    int numero = 0;
    int division = 0;
    int media = 0;
    int mayorPar = 0;
    int menorImpar = Integer.MAX_VALUE;

    System.out.print("Cincuenta números aleatorios entre -100 y 200: ");

    for (int i = 0 ;i < 50; i++) {

      numero = (int)(Math.random()*301-101);
      System.out.print(numero + " ");
      
      if (numero%2 == 0) {
        if (numero > mayorPar) {
          mayorPar = numero;
        }
      }

      if (numero%2 != 0) {
        if (numero < menorImpar) {
          menorImpar = numero;
        }
      }

      media += numero;
      division++;
    }
    
    System.out.println("");
    System.out.println("Media: " +  media/division );
    System.out.println("Mayor de los pares: " + mayorPar);
    System.out.println("Menor de los impares: " + menorImpar);

  }
  
}