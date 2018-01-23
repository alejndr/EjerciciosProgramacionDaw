/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * @author alejandro
 */
  public class T75Ej1 {
    public static void main(String[] args) {
      int[][] num = new int[3][6]; // array de 3 filas por 2 columnas
      num[0][0]=0;
      num[0][1]=30;
      num[0][2]=2;
      num[0][5]=5;
      num[1][0]=75;
      num[2][2]=-2;
      num[2][3]=9;
      num[2][5]=11;
      
      //MOSTRAR ARRAY BIDIMENSIONAL
      //El 3 es el numero de filas del array
      for (int i=0;i < 3 ;i++) {
        //El 6 es el numero de columnas
        for (int e=0;e < 6 ;e++) {
          System.out.printf("┃%3d ", num[i][e]);
        }
        System.out.println(" ");
        
      }


    }
  
}

