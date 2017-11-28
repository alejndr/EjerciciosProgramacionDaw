/*
 * blablablabla
 * 
 * @author Alejandro MV
 */


/*BASE*/
public class nombreclase {
  public static void main(String[] args) {
  System.out.println("Texto con salto de linea");
  System.out.print("Texto sin salto de linea");

  
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

  switch (mes) {
    case 1:
      nombreDelMes = "enero";
      break;
    case 2:
      nombreDelMes = "febrero";
      break;
    case 3:
      nombreDelMes = "marzo";
      break;

    default:
      nombreDelMes = "no existe ese mes";
  }

/*BUCLES*/

  for (int i = 1; i < 11; i++) {
  System.out.println(i);
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
int[] n; // se define n como un array de enteros
n = new int[4]; // se reserva espacio para 4 enteros
        
n[0] = 26;
n[1] = -30;
n[2] = 0;
n[3] = 100;
