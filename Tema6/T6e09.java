/**
* Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
*
*  @author Alejandro MV
**/

public class T6e09 {
  public static void main(String[] args) {
    int numeroAleatorio = 0;
    int contador = 0;
    
    System.out.println("Este programa va a sacar números aleatorios pares entre 0 y 100 asta que salga el número 24:");

    while (numeroAleatorio != 24) {
      numeroAleatorio = (int)(Math.random()*101);
      
      if (numeroAleatorio%2 == 0) {
      System.out.println(numeroAleatorio);
      
      contador++;
      }
      
    }
    
  System.out.println("Se han generado " + contador + " números");
  }
}
