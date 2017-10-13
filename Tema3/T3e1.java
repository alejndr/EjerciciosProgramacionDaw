/**
* Realiza un programa que pida dos números y que luego muestre el resultado
* de su multiplicación.
*
* @author AlejandroMV
*/

public class T3e1 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce un número entero: ");
    int primerNumero = Integer.parseInt( System.console().readLine() );
    
    System.out.print("Por favor, introduce un segundo número entero: ");
    int segundoNumero = Integer.parseInt( System.console().readLine() );
    
    System.out.print("\033[37m" + "El primer número introducido es " + "\033[31m" + primerNumero);
    System.out.println("\033[37m" + " y el segundo es " + "\033[31m" + segundoNumero);
    System.out.print("\033[37m" + "El primer número multiplicado por el segundo dan de resultado: ");
    System.out.print("\033[31m" + primerNumero * segundoNumero);
  } 
}

