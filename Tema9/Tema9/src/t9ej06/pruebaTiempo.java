package t9ej06;

/**
 *
 * @author alejandro
 */
public class pruebaTiempo {
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo(0, 30, 40);
    Tiempo t2 = new Tiempo(0, 35, 20);
    
    System.out.println("Suma: " + t1.suma(t2));
    
    System.out.println("Resta: " + t1.resta(t2));
  }
}
