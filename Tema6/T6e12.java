/*
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 * 
 * @author Alejandro MV
 */


public class T6e12 {
  public static void main(String[] args) {
  
  
  boolean enterTheMatrix = true;
  int matrix = 32;
  String verde = "\033[32m";
  
  while (enterTheMatrix) {
  matrix = (int)(Math.random()*127)+32;

  System.out.print(verde + (char)matrix);
  }
  
  }
  
}
