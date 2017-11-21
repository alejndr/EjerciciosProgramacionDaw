/*
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El programa
 * preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. La tarta de
 * manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el programa
 * debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; la nata suma
 * 2’50 y la escritura del nombre 2’75.
 * 
 * @author Alejandro MV
 */


public class Ejercicio1-2016 {
  public static void main(String[] args) {
  
  float precio = 0;
  
  System.out.println("Presupuestos para tartas");
  System.out.print("¿De que quiere su tarta? (manzana, fresa o chocolate): ");
  string tarta = System.console().readLine();
  
  switch (tarta) {
    case "manzana":
      precio += 18;
      break;
    case "fresa":
      precio += 16;
      break;
    case "chocolate":
      System.out.print("¿Que chocolate quiere? (negro o blanco): ");
      string chocolate = System.console().readLine();
      
      if (chocolate.equals("negro")) {
      precio += 14;
      } else if (chocolate.equals("blanco")) {
        precio += 15;
        }
      break;

    default:
      
  }
  
  System.out.print("¿Quiere su tarta con nata? (si o no): ");
  string nata = System.console().readLine();
  if (nata.equals("si")) {
    precio += 2.5;
  }
  
  
  System.out.print("¿Quiere su tarta con su nombre? (si o no): ");
  string nombre = System.console().readLine();
  
  if (nombre.equals("si")) {
    precio += 2.75;
  }
  
  System.out.printf("Tarta de %s: %.2f", tarta);
  System.out.printf("El %s", "numero");
  System.out.printf("El %s", "numero");
  
  }
  
}
