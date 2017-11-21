/**
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
* rados por espacios.
*
*  @author Alejandro MV
**/

public class T6e04 {
  public static void main(String[] args) {

    System.out.println("Veinte números aleatorios entre 0 y 10:");

    for (int i = 1; i < 21; i++) {
      System.out.println("Numero " + i + ": " + (int)(Math.random()*11));
    }
  }
}
