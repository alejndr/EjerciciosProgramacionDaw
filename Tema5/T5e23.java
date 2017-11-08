/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author Alejandro MV
 */


public class T5e23 {
  public static void main(String[] args) {
  System.out.println("Este programa pide números asta que alcancen la suma de 10000");
  System.out.println("entonces saca la cantidad de números introducidos, la suma entre ellos y la media entre ellos.");
 
  int contador = 0;
  int numero = 0;
  int numerosIntroducidos = 0;
  int media = 0;
  int divi = 0;
  
  while (contador <= 10000) {
  
  numero = Integer.parseInt(System.console().readLine());
  
  media = media + numero;
  divi++; 
  numerosIntroducidos++;
  contador = numero + contador;
  }
  
  System.out.println("Números introducidos: " + numerosIntroducidos);
  System.out.println("Suma de los números introducidos: " + contador);
  System.out.println("Media de los números introducidos: " + (media/divi));
  }

  
  }

