/*
 * blablablabla
 * 
 * @author Alejandro MV
 */

import java.util.Scanner; /*Scanner*/

public class nombreclase {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); /*Scanner*/
    numero = s.nextInt(); /*Scanner*/
    
    System.out.println("Texto con salto de linea");
  }
}

/*SALIDA FORMATEADA */
  System.out.printf("El número %d no tiene decimales.\n", 21);
  System.out.printf("El número %f sale con decimales.\n",  21.0);
  System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
  System.out.printf("La palabra %s ", "numero");
  
/*INTRODUCCION DE DATOS*/
  String nombre = System.console().readLine();
  int primerNumero = Integer.parseInt( System.console().readLine() );

/*CONDICIONALES*/
  if (respuesta.equals("Tarawa")) {
    
  }

/*OPERADORES LOGICOS
 *  
 * && = lAS DOS CONDICIONES SON VERDADERAS
 * || = AL MENOS UNA CONDICION ES VERDADERA 
 * ! = LA CONDICION ES FALSA
 */

  switch (variable) {
      case 1:
      
      break;
      case 2:
      
      break;
      case 3:
      
      break;

    default:
      
  }

/*BUCLES*/

  for (int i = 1; i < 11; i++) {
    System.out.println(i);
  }

  /*FOR EACH, sirve para soltar un array completo, notafinal seria un array */
  for (int n : notafinal) {
    System.out.println(n);
  }
  
  while (i < 11) {
    System.out.println(i);
  }
  
  do {
    System.out.println(i);
    i++;
  } while (i < 11);
  
  
/*GENERADORES DE NUMEROS ALEATORIOS*/

/*Generador de 0 a 10, los 2 incluidos*/
(int)(Math.random()*11)
  
/*Generador de 100 a 199 incluidos*/
(int)(Math.random()*100+100)

/*COLORES*/

String rojo = "\033[31m";
String verde = "\033[32m";
String naranja = "\033[33m";
String azul = "\033[34m";
String morado = "\033[35m";
String blanco = "\033[37m";

/*ARRAY*/
int[] n = new int[4]; // se reserva espacio para 4 enteros
        
n[0] = 26;
n[1] = -30;
n[2] = 0;
n[3] = 100;

/*ARRAY BIDIMENSIONALES*/
int[][] n = new int[3][2]; // array de 3 filas por 2 columnas

n[0][0]=20;
n[1][0]=67;
n[1][1]=33;
n[2][1]=7;

//MOSTRAR ARRAY BIDIMENSIONAL
//El 3 es el numero de filas del array
for (int i=0;i < 3 ;i++) {
  //El 6 es el numero de columnas
  for (int e=0;e < 6 ;e++) {
    System.out.printf("┃%3d ", num[i][e]);
  }
  System.out.println(" ");

}
