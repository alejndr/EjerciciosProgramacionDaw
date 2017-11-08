/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Alejandro MV
 */


public class T5e21 {
  public static void main(String[] args) {
  System.out.println("Este programa nos va a contar cuantos números se han introducido, el mayor número de los pares y la media entre los que sean impares ");
  System.out.print("Introduce números enteros, cuando termines introduce uno negativo: ");
  
  int intro = 0;
  int contador = 0;
  int pares = 0;
  int mediaimpar = 0;
  int divi = 0;
  
  do {
    
    intro = Integer.parseInt(System.console().readLine());
    
    if (intro >=0) {contador++;
    
      if (intro%2 == 0) {
      
        if (intro > pares) {
        
        pares = intro;
        
        }
        
      }
      
      if (intro%2 != 0) {
        
        divi ++;
        mediaimpar = mediaimpar + intro;
  
      }
      
      if (intro < 0) {
      contador = contador - intro;
      pares = pares - intro;
      mediaimpar = mediaimpar - intro;
      divi = divi - 1;
      }
      
    }
  
  } while (intro >= 0);
  
  
  
  System.out.println("Números introducidos: " + contador);
  System.out.println("El mayor de los pares: " + pares);
  System.out.println("La media de los impares: " + (mediaimpar / divi));
  
  
  
  

  }
  
}
