/**
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto.
*
*  @author Alejandro MV
**/

public class T6e06 {
  public static void main(String[] args) {

    System.out.println("Voy a pensar en un número entre 0 y 100 para que lo adivines:");
    
    int solucion = (int)(Math.random()*101);
    
    /*System.out.println("Numero pensado: " + solucion);*/

    for (int i = 1; i < 6; i++) {
      System.out.print("¿Que número estoy pensando?: ");
      int respuesta = Integer.parseInt( System.console().readLine() );
      
      if (respuesta == solucion) {
      System.out.print("¡Enhorabuena! ¡Has acertado!");
      break;
      } else {
        
        if (respuesta < solucion) {
        System.out.println("Lo siento, ese no es, prueba a decir una cifra mayor, te quedan " + (5 - i) + " intentos");
        } else {
          System.out.println("Lo siento, ese no es, prueba a decir una cifra menor, te quedan " + (5 - i) + " intentos");
          }
        }
    }
  }
}
