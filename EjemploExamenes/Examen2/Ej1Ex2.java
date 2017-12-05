/*
 * Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
 * deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo, el
 * programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”
 * 
 * @author Alejandro MV
 */


public class Ej1Ex2 {
  public static void main(String[] args) {
  
    int[] numero = new int[20]; 
    int[] primo = new int[20]; 
    boolean esPrimo = false;
    


    for (int i = 0;i < 20;i++) {
      numero[i] = (int)(Math.random()*98)+2;
      esPrimo = true;

      for (int e = 2;e < numero[i];e++) {
        
        if ((numero[i]%e) == 0) {
        
          esPrimo = false;
        
        }
        
      }
      
      if (esPrimo) {
        primo[i] = numero[i];
      }
      
    }

    System.out.print("Numeros generados: ");
    for (int n : numero) {
      System.out.print(n + " ");
    }
    System.out.println(" ");
    System.out.print("Numeros Primos: ");
    for (int n : primo) {

      if (n != 0) {
        System.out.print(n + " ");
      }  
    }
  }
  
}