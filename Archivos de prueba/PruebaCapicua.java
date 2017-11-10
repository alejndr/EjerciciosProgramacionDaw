/*
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * @author Alejandro MV
 */


public class T5e36 {
  public static void main(String[] args) {
  System.out.println("Este programa va a comprobar si tu número es capicua.");
  System.out.print("Introduce un número entero positivo: ");
  int intro = Integer.parseInt(System.console().readLine());
  
  int numero = intro;
  int vuelta = 0;
  int pares = 0;
  int impares = 0;
  
  while (numero > 0) {
    
    vuelta = (vuelta*10) + (numero%10);
    numero = numero / 10;
    
  }
  
  if (intro == vuelta) {
    
  System.out.print("El número es capicua");
  
  } else {
  
  System.out.print("El número no es capicua");
  
  }
  
  }
  
}


