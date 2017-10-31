/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Alejandro MV
 */


public class T5e13 {
  public static void main(String[] args) {
  System.out.println("A partir de 10 números te voy a decir cuantos son positivos y cuantos negativos");
  System.out.println("Introduce 10 números enteros: ");
    
  int negativos = 0;
  int positivos = 0;  
  
    for (int i = 0; i < 10; i++) {
    
    int numeros = Integer.parseInt(System.console().readLine());
    
    if (numeros < 0){
    negativos ++;
    } else {
      positivos ++;
      }
    
    
    }
   System.out.println("Números negativos: " + negativos);
   System.out.print("Números positivos: " + positivos);
  
  }
    
}
