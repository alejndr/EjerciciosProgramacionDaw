/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
 * debe introducir por teclado.
 *
 * @author Alejandro MV
 */
public class T5e12 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero: ");
    int repeticion = Integer.parseInt(System.console().readLine());
    
    switch (repeticion) {
      case 1:
      System.out.print("0");
      break;
      
      case 2:
      System.out.println("0");
      System.out.print("1");
      break;
      
      case 3:
      System.out.println("0");
      System.out.println("1");
      System.out.print("1");
      break;
      
      default:
      
      System.out.println("0");
      System.out.println("1");
      System.out.println("1");
      int a = 1;
      int b = 1;
      int aux = 0;
        for (int i = 4; i <= repeticion; i++) {
        
        aux = a;
        a = b;
        b = aux + b;
        
        System.out.println(b);
      }
    }
    
    
    
    
    
    
  }
}


