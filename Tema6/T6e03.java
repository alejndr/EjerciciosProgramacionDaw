/**
*  Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
*  de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
*  @author Alejandro.MV
**/

public class T6e03 {
  public static void main(String[] args) {
  
  int numeroAleatorio = 0;
  int genPalo = 0;
    
      numeroAleatorio = ((int)(Math.random()*10)+1);
      genPalo = ((int)(Math.random()*4)+1);
      String palo = "";
      
      switch (genPalo) {
      case 1:
      palo = "oros";  
        break;
      case 2:
      palo = "copas";  
        break;
      case 3:
      palo = "bastos";  
        break;
      case 4:
      palo = "espadas";  
        break;
      default:
        
      }
    
      switch (numeroAleatorio) {
      case 1:
      System.out.println("Carta de la baraja española: As de " + palo );
        break;
      case 2:
      System.out.println("Carta de la baraja española: 2 de " + palo );
        break;
      case 3:
      System.out.println("Carta de la baraja española: 3 de " + palo );
        break;
      case 4:
      System.out.println("Carta de la baraja española: 4 de " + palo );
        break;
      case 5:
      System.out.println("Carta de la baraja española: 5 de " + palo );
        break;
      case 6:
      System.out.println("Carta de la baraja española: 6 de " + palo );
        break;
      case 7:
      System.out.println("Carta de la baraja española: 7 de " + palo );
        break;
      case 8:
      System.out.println("Carta de la baraja española: Sota de " + palo );
        break;
      case 9:
      System.out.println("Carta de la baraja española: Caballo de " + palo );
        break;
      case 10:
      System.out.println("Carta de la baraja española: Rey de " + palo );
        break;
        
      default:
        
      }
      
  }
}
