/*
 * Igancio Alejandro de la Maza villalba, 14 de noviembre de 2017, turno 1
 * 
 * Los números “donut” son los que tienen un 0 justo en la posición central, en caso de que el número de
 * cifras sea impar; o bien, los que tienen dos ceros en las posiciones centrales, en caso de que el
 * número de dígitos sea par. El resto de dígitos pueden ser ceros o no, no se tienen en cuenta. Por
 * ejemplo, los números 23037, 1008, 9060044, 0 y 8000 son “números donut”. Sin embargo 6758, 8903,
 * 4200, 1234 y 7 no lo son. Realiza un programa que diga si un número introducido por teclado es un
 * “número donut” o no.
 * 
 * @author Alejandro MV
 */



public class Ex13iamv4 {
  public static void main(String[] args) {
  System.out.print("Introduzca un número entero positivo: ");
  int intro = Integer.parseInt(System.console().readLine());
  
  int numero = intro;
  int vuelta = 0;
  int cuantosDigitos = 0;
  int posicionCero = 0;
  
  while (numero > 0) {
    
    vuelta = (vuelta*10) + (numero%10);
    numero = numero / 10;
    
    cuantosDigitos++;
    if (vuelta%10 == 0) {
    posicionCero = cuantosDigitos;
    
    }
  }
  
  if ((cuantosDigitos%2) != 0 && posicionCero == ((cuantosDigitos/2)+1)) {
  System.out.print("El número " + intro + " es un número donut"); 
    
  } else if ((cuantosDigitos%2) == 0 && posicionCero == ((cuantosDigitos/2)+1)) {
  System.out.print("El número " + intro + " es un número donut"); 
  
  } else {
    System.out.print("El número " + intro + " no es un número donut"); 
    
    }

    }
  
  }
  
