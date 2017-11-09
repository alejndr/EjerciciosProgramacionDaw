/*
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
 * positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
 * primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
 * cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author Alejandro MV
 */


public class Ejercicio1 {
  public static void main(String[] args) {
  System.out.println("Título");
  
  int intro = 0;
  int media = 0;
  int divi = 0;
  int contador = 0;
  int maximo = 0;
  int minimo = 0;
  
  boolean primo = true;
  boolean noPrimo = true;
  
  while (noPrimo) {
  
    intro = Integer.parseInt(System.console().readLine());
    
    primo = true;
    for (int i = 2;i < intro;i++) {
      if ((intro%i) == 0) {
      
      primo = false;
      }
    }
    
    if (primo) {
    
    noPrimo = false;
      
    }
    
    if (intro > maximo) {
    
    maximo = intro;
    }
    
    
    if (contador == 0) {
      
    minimo = intro;
    }
    if (intro < minimo) {
    
    minimo = intro;
    } 
    
    
    
    media = media + intro;
    divi++;
    contador++;
  }

  System.out.println("Números no primos introducidos: " + contador);
  System.out.println("Máximo número introducido: " + maximo );
  System.out.println("Mínimo número introducido: " + minimo );
  System.out.println("Media de los números introducidos: " + (media/divi) );

  }
  
}


