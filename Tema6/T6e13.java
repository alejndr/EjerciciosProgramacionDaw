  /*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author Alejandro MV
 */


public class T6e13 {
  public static void main(String[] args) {
  
  int numeroAleatorio = 0;
  int numeroAleatorio2 = 0;
  boolean numerosIguales = true;
  
  while (numerosIguales) {
      numeroAleatorio = ((int)(Math.random()*6)+1);
      numeroAleatorio2 = ((int)(Math.random()*6)+1);
      
    switch (numeroAleatorio) {
    case 1:
    System.out.print("⚀ ");
    break;
    case 2:
    System.out.print("⚁ ");
    break;
    case 3:
    System.out.print("⚂ ");
    break;
    case 4:
    System.out.print("⚃ ");
    break;
    case 5:
    System.out.print("⚄ ");
    break;
    case 6:
    System.out.print("⚅ ");
    break;

    default:
      
    }
    
    switch (numeroAleatorio2) {
    case 1:
    System.out.println("⚀ ");
    break;
    case 2:
    System.out.println("⚁ ");
    break;
    case 3:
    System.out.println("⚂ ");
    break;
    case 4:
    System.out.println("⚃ ");
    break;
    case 5:
    System.out.println("⚄ ");
    break;
    case 6:
    System.out.println("⚅ ");
    break;

    default:
      
    }
  
  if (numeroAleatorio == numeroAleatorio2) {
    
  numerosIguales = false;
  
  }
  
  }

  
  }
  
}
