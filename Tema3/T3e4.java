/**
* Escribe un programa que sume, reste, multiplique y divida dos números
* introducidos por teclado.
*
* @author AlejandroMV
*/

public class T3e4{
  public static void main(String[] args) {

    System.out.print("Por favor, introduce un número entero: ");
    int primerNumero = Integer.parseInt( System.console().readLine() );
    
    System.out.print("Por favor, introduce un segundo número entero: ");
    int segundoNumero = Integer.parseInt( System.console().readLine() );
    
    System.out.println("primer número: " + primerNumero );
    System.out.println("segundo número: " + segundoNumero );
    System.out.println("División: " + (primerNumero / segundoNumero)); 
    System.out.println("Multiplicación: " + (primerNumero * segundoNumero)); 
    System.out.println("Suma: " + (primerNumero + segundoNumero)); 
    System.out.println("Resta: " + (primerNumero - segundoNumero)); 
    
  } 
}

