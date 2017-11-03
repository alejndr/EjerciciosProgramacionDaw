/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Alejandro MV
 */


public class T5e22 {
  public static void main(String[] args) {
  System.out.println("Este programa Muestra los numeros primos entre 2 y 100");
 
   boolean esPrimo = true;

  
  for (int numero = 2;numero <= 100;numero++) {
    
    esPrimo = true;
    
    for (int i = 2;i < numero;i++) {
      if ((numero%i) == 0) {
      
      esPrimo = false;
      
      }
    }
    
    if (esPrimo) {
      
    System.out.println(numero);
    
    }
    
    }
  }

  
  }

