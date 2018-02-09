package t9ej02;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class pruebaVehiculo {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Bicicleta bici = new Bicicleta();
    Coche coche = new Coche();
    int menu = 0;

    while (menu != 8) {
      System.out.println("VEHICULOS\n=========\n1. Anda con la bicicleta\n2. Haz el caballito con la bicicleta\n3. Anda con el coche\n4. Quema rueda con el coche\n5. Ver kilometraje de la bicicleta\n6. Ver kilometraje del coche\n7. Ver kilometraje total\n8. Salir");
      System.out.print("Introduce una opción(1-8): ");
      menu = s.nextInt();
      switch (menu) {
        case 1:
          
          break;
        case 2:
          
          break;
        case 3:
          
          break;
        case 4:
          
          break;
        case 5:
          System.out.println("Kilometros recorridos por la bicicleta: ");
          break;
        case 6:
          System.out.println("Kilometros recorridos por el coche: ");
          break;
        case 7:
          System.out.println("Kilometros recorridos por todos los vehiculos: ");
          break;
        case 8:
          System.out.println("Adios");
          break;

        default:

      }
    }
  }
}
