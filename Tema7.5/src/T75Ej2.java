
import java.util.Scanner;

/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * @author alejandro
 */
  public class T75Ej2 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in); /*Scanner*/
      int[][] num = new int[5][6]; 
      int sumafila = 0;
      
      //Pide el array
      for (int i=0;i < 4 ;i++) {
        for (int e=0;e < 5 ;e++) {
          System.out.println("Introduce el valor de la fila "+ i + " columna "+ e);
          num[i][e] = s.nextInt(); /*Scanner*/
        }
        System.out.println(" ");
      }
      
      //MOSTRAR ARRAY BIDIMENSIONAL
      //El 3 es el numero de filas del array
      for (int i=0;i < 5 ;i++) {
        //El 6 es el numero de columnas
        
        for (int e=0;e < 6 ;e++) {
          
            System.out.printf("┃%3d ", num[i][e]);
            // Los numeros de la fila que esta recorriendo se suman a la ultima posición del array.
            num[i][5] += num[i][e];
            num[4][e] += num[i][e];
            
        }
        
        System.out.println(" ");
      }
      
    }
  
}

