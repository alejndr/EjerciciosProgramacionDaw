/**
*  Realiza un programa que muestre al azar el nombre de una carta de la
*  baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
*  diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
*  cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
*  sería el 1). Para convertir un número en una cadena de caracteres podemos
*  usar String.valueOf(n) .
*
*  @author Alejandro.MV
**/

public class T6e02 {
  public static void main(String[] args) {
  
  int numeroAleatorio = 0;
  int genPalo = 0;
    
      numeroAleatorio = ((int)(Math.random()*13)+1);
      genPalo = ((int)(Math.random()*4)+1);
      String palo = "";
      
      switch (genPalo) {
      case 1:
      palo = "picas";  
        break;
      case 2:
      palo = "corazones";  
        break;
      case 3:
      palo = "diamantes";  
        break;
      case 4:
      palo = "trevoles";  
        break;
      default:
        
      }
    
      switch (numeroAleatorio) {
      case 1:
      System.out.println("Carta de la baraja francesa: A de " + palo );
        break;
      case 2:
      System.out.println("Carta de la baraja francesa: 2 de " + palo );
        break;
      case 3:
      System.out.println("Carta de la baraja francesa: 3 de " + palo );
        break;
      case 4:
      System.out.println("Carta de la baraja francesa: 4 de " + palo );
        break;
      case 5:
      System.out.println("Carta de la baraja francesa: 5 de " + palo );
        break;
      case 6:
      System.out.println("Carta de la baraja francesa: 6 de " + palo );
        break;
      case 7:
      System.out.println("Carta de la baraja francesa: 7 de " + palo );
        break;
      case 8:
      System.out.println("Carta de la baraja francesa: 8 de " + palo );
        break;
      case 9:
      System.out.println("Carta de la baraja francesa: 9 de " + palo );
        break;
      case 10:
      System.out.println("Carta de la baraja francesa: 10 de " + palo );
        break;
      case 11:
      System.out.println("Carta de la baraja francesa: J de " + palo );
        break;
      case 12:
      System.out.println("Carta de la baraja francesa: Q de " + palo );
        break;
      case 13:
      System.out.println("Carta de la baraja francesa: K de " + palo );
        break;
        

      default:
        
      }
      
  }
}
