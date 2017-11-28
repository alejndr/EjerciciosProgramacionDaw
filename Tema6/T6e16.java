  /*
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * 
 * @author Alejandro MV
 */


public class T6e16 {
    public static void main(String[] args) {
    
      int figura1 = 0;
      int figura2 = 0;
      int figura3 = 0;

      System.out.println("Maquina tragaperras, haga su tirada:");
      
    
      figura1 = (int)(Math.random()*5);
      figura2 = (int)(Math.random()*5);
      figura3 = (int)(Math.random()*5);

      switch (figura1){
        case 0:
        System.out.print("Limón ");
          break;
        case 1:
        System.out.print("Campana ");
          break;
        case 2:
        System.out.print("Herradura ");
          break;
        case 3:
        System.out.print("Diamante ");
          break;
        case 4:
        System.out.print("Corazón ");
          break;  
        default:
      }

      switch (figura2){
        case 0:
        System.out.print("Limón ");
          break;
        case 1:
        System.out.print("Campana ");
          break;
        case 2:
        System.out.print("Herradura ");
          break;
        case 3:
        System.out.print("Diamante ");
          break;
        case 4:
        System.out.print("Corazón ");
          break;  
        default:
      }

      switch (figura3){
        case 0:
        System.out.println("Limón ");
          break;
        case 1:
        System.out.println("Campana ");
          break;
        case 2:
        System.out.println("Herradura ");
          break;
        case 3:
        System.out.println("Diamante ");
          break;
        case 4:
        System.out.println("Corazón");
          break;  
        default:
      }

      if (figura1 != figura2 && figura2 != figura3) {
        System.out.println("Lo siento, ha perdido.");
      
      }
      else if (figura1 == figura2 && figura2 == figura3) {
        System.out.println("Enhorabuena, ha ganado 10 monedas!");
      
      }
      else if (figura1 == figura2 || figura2 == figura3) {
        System.out.println("Bien, a recuperado su moneda!");
      
      }
    }
    
  }
  