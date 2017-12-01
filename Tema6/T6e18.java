/*
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 * 
 * @author Alejandro MV
 */



public class T6e18 {
  public static void main(String[] args) {
  System.out.println("Generador de 3 colores aleatorios:");

  int color1 = 0;
  int color2 = 0;
  int color3 = 0;

  String[] arrayColor = new String[6]; 
          
  arrayColor[0] = "rojo";
  arrayColor[1] = "azul";
  arrayColor[2] = "verde";
  arrayColor[3] = "amarillo";
  arrayColor[4] = "violeta";
  arrayColor[5] = "naranja";

  do {
    color1 = (int)(Math.random() * 6);
    color2 = (int)(Math.random() * 6);
    color3 = (int)(Math.random() * 6);
  } while ( (color1 == color2) || (color2 == color3) || (color3 == color1));


  System.out.print(arrayColor[color1] + ", " + arrayColor[color2] + ", " + arrayColor[color3]);

  
  }
  
}