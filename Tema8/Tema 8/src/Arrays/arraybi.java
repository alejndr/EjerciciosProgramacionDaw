package Arrays;

/**
 *
 * @author alejandro
 */
public class arraybi {

  public static int[][] generaArrayBiInt(int f, int c, int min, int max){
    int[][] resultado = new int [f][c];
    
    for (int fila = 0; fila < f; fila++) {
      for (int columna = 0; columna < f; columna++) {
        resultado[fila][columna] = (int)(Math.random() * (max - min) +1);
      }
    }
      
  return resultado;
  
  }
}
