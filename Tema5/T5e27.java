/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author Alejandro MV
 */


public class T5e25 {
  public static void main(String[] args) {
  System.out.println("Este programa va a darle la vuelta al número introducido.");
  System.out.print("Introduce un número entero: ");
  int intro = Integer.parseInt(System.console().readLine());
  
  int numero = intro;
  int vuelta = 0;
  
  while (numero > 0) {
    
    vuelta = (vuelta*10) + (numero%10);
    numero = numero / 10;
    
  }
  
  System.out.print("El número: " + intro + " dado la vuelta es: " + vuelta);
  
  }
  
}
