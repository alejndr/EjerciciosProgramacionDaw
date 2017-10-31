/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Alejandro MV
 */
public class T5e11 {
  public static void main(String[] args) {
    System.out.println("Vamos a calcular el cuadrado y el cubo de los 5 primeros números a partir del que introduzcas.");
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    
    for (int i = 0; i <= 5; i++) {
    
    System.out.printf("|%-6d|%-6d|%-6d|\n", numero, numero*numero, numero*numero*numero);
    numero++;
  }
    
  }
}

