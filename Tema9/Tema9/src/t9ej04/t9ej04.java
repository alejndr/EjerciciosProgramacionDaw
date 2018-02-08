package t9ej04;

/**
 *
 * @author alejandro
 */
public class t9ej04 {

  public static void main(String[] args) {
    Fraccion primera = new Fraccion(4, 5);
    Fraccion segunda = new Fraccion(3, 9);
    
    primera.divide(segunda);
    
    System.out.println("Multipicada: \n"+primera);
    
    primera.invierte();
    
    System.out.println("invertida: \n"+primera);
    
    primera.multiplica(segunda);
    
    System.out.println("Dividida: \n" + primera);
  }
}
