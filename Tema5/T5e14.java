/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 * 
 * @author Alejandro MV
 */


public class T5e14 {
  public static void main(String[] args) {
  System.out.print("Introduce la base: ");
  int base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el exponente: ");
  int exponente = Integer.parseInt(System.console().readLine());
  
  int aux = 1;
  int veces = 0;
  
  if (exponente == 0){
  aux = 1;
  } else {
      while (veces < exponente){
      
      aux = base * aux;
      
      veces ++;
      }
    }
  System.out.println("Potencia: " + aux);
  }
  
}
