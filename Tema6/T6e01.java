/**
*  Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
*  también la suma total (los puntos que suman entre los tres dados).
*
*  @author Alejandro.MV
**/

public class T6e01 {
  public static void main(String[] args) {
  
  int numeroAleatorio = 0;
    System.out.println("Tirada de 3 dados: ");

    for (int i = 0; i < 3; i++) {
      numeroAleatorio = ((int)(Math.random()*6)+1);
      
     switch (numeroAleatorio) {
    case 1:
      System.out.println("⚀");
      break;
    case 2:
      System.out.println("⚁");
      break;
    case 3:
      System.out.println("⚂");
      break;
    case 4:
      System.out.println("⚃");
      break;
    case 5:
      System.out.println("⚄");
      break;
    case 6:
      System.out.println("⚅");
      break;

    default:
      
  }
    }
    
    
  }
}

