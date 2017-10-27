/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Alejandro MV
 */
public class T5e8 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int multi = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i <= 10; i++) {
    
    System.out.println(multi + "x" + i + "=" + (multi * i));
  }
    
  }
}
