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
    int kilom;

    while (menu != 8) {
      System.out.println("VEHICULOS\n=========\n1. Anda con la bicicleta\n2. Haz el caballito con la bicicleta\n3. Anda con el coche\n4. Quema rueda con el coche\n5. Ver kilometraje de la bicicleta\n6. Ver kilometraje del coche\n7. Ver kilometraje total\n8. Salir");
      System.out.print("Introduce una opción(1-8): ");
      menu = s.nextInt();
      switch (menu) {
        case 1:
          System.out.println("Cuantos kilometros andas con la bici?");
          kilom = s.nextInt();
          bici.anda(kilom);
          break;
        case 2:
          bici.haceCaballito();
          System.out.println("Recorres 1km haciendo el caballito, eres el mas loco del barrio");
          break;
        case 3:
          System.out.println("Cuantos kilometros andas con el coche?");
          kilom = s.nextInt();
          coche.anda(kilom);
          break;
        case 4:
          coche.quemaRueda();
          System.out.println("Recorres 30 kilometros en un suspiro");
          break;
        case 5:
          System.out.print("Kilometros recorridos por la bicicleta: ");
          System.out.println(bici.getKilometraje()); 
          break;
        case 6:
          System.out.print("Kilometros recorridos por el coche: ");
          System.out.println(coche.getKilometraje());
          break;
        case 7:
          System.out.print("Kilometros recorridos por todos los vehiculos: ");
          System.out.println(Vehiculo.getKilometrosTotales());
          break;
        case 8:
          System.out.println("Adios");
          break;

        default:

      }
    }
  }
}
