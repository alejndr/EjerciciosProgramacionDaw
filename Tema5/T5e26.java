/*
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Alejandro MV
 */


public class T5e26 {
  public static void main(String[] args) {
  System.out.println("Este programa va a señalar posiciones del primer número obtenido a partir del segundo.");
  System.out.print("Introduce un número entero: ");
  long intro = Long.parseLong(System.console().readLine());
  System.out.print("Introduce un digito del número anterior: ");
  int intro2 = Integer.parseInt(System.console().readLine());
  
  long numero = intro;
  long vuelta = 0;
  long posicion = 0;
  
  System.out.println("El digito " + intro2 + " esta, de derecha a izquierda, en la posicion: ");
  
  while (numero > 0) {
    
    vuelta = (vuelta*10) + (numero%10);
    numero = numero / 10;
    
    posicion++;
    if ((vuelta%10) == intro2) {
    
    
    System.out.print(posicion + " ");
    
    }
    
  }
  
  
  /*System.out.print("El número impares");*/
  
  }
  
}

