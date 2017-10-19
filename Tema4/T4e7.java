/**
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Alejandro mv
 */

public class T4e7 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor introduce la primera nota del trimestre: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor introduce la segunda nota del trimestre: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor introduce la tercera nota del trimestre: ");
    Double c = Double.parseDouble(System.console().readLine());
    
    double media = (a+b+c) / 3;
    System.out.printf("Tu nota media del trimestre es: %.1f", media);
    
  }
}

