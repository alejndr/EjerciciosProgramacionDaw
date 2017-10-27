/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 *
 * @author Alejandro MV
 */
public class T5e9 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero: ");
    int intro = Integer.parseInt(System.console().readLine());
    
    int comparar = 10;
    int salida = 0;
    int digit = 1;
    
    while (salida == 0) {
    
    if (intro < comparar){
    
    System.out.print("El número tiene " + digit + " dígitos");
    salida = 1;
    
    } else {
      
      comparar = comparar * 10;
      digit = digit + 1;
      }
      
    }
  
  }
    
  }


