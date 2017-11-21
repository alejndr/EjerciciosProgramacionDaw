/**
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la media
* de esos números.
*
*  @author Alejandro MV
**/

public class T6e05 {
  public static void main(String[] args) {

    System.out.println("Cincuenta números aleatorios entre 100 y 199:");

    for (int i = 1; i < 51; i++) {
      System.out.println("Numero " + i + ": " + (int)(Math.random()*100+100));
    }
  }
}
