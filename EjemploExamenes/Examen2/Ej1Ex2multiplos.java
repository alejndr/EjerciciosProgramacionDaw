/*
 * Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
 * y el 210 ambos incluidos.
 * 
 * @author Alejandro MV
 */


/*BASE*/
public class Ej1Ex2multiplos {
  public static void main(String[] args) {
  
    int[] mult = new int[10]; 
    int rango = 0;

    for (int i = 0; i < 10 ;i++) {
      rango = (int)(Math.random()*10+21);
      mult[i] = (int)(Math.random()+rango*7);
    }

    System.out.print("Multiplos de 7 entre 140 y 210:");
    for (int n : mult) {
      System.out.print(" " + n);
    }
  
  }
  
}