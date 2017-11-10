/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author Alejandro MV
 */


public class pruebavuelta {
  public static void main(String[] args) {
  System.out.println("Este programa va a darle la vuelta al número introducido.");
  System.out.print("Introduce un número entero: ");
  int intro = Integer.parseInt(System.console().readLine());
  
  int numero = intro;
  int vuelta = 0;
  int pares = 0;
  int impares = 0;
  
  while (numero > 0) {
    
    vuelta = (vuelta*10) + (numero%10);
    numero = numero / 10;
    
    
    if ((vuelta%10)%2 == 0) {
    
    pares++;
    
    } else {
    impares++;  
    }
    
  }
  
  
  
  System.out.print("El número: " + intro + " tiene: " + pares + " pares y " + impares + " impares");
  
  }
  
}

