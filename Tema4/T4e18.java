/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Alejandro mv
 */

public class T4e18 {
  public static void main(String[] args) {   
  System.out.print("Vamos a decir la primera cifra de un número");
  System.out.print("Introduce un número(entero con menos de 5 cifras): ");
  int numero = Integer.parseInt(System.console().readLine());
  
  if(numero < 10){System.out.print("La primera cifra de tu número: " + numero);}
  else if (numero < 100 && numero < 1000){System.out.print("La primera cifra de tu número: " + numero/10);}
  else if (numero < 1000 && numero < 10000){System.out.print("La primera cifra de tu número: " + numero/100);}
  else if (numero < 10000 && numero < 100000){System.out.print("La primera cifra de tu número: " + numero/1000);}
  else if (numero < 100000 && numero < 1000000){System.out.print("La primera cifra de tu número: " + numero/10000);}
  }
}



