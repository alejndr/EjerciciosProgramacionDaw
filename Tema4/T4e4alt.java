/**
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author Alejandro mv
 */

public class T4e4 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca que hora es (sin minutos): ");
    int horas = Integer.parseInt(System.console().readLine());
    
    int salario = horas * 12;
    
    if (horas >= 41 ) {
      System.out.print("Tu salario de la semana es: " + salario);
    } 
    if (horas <= 41 ) {
      System.out.print("Tu salario de la semana es: " + ((horas - 40)*16) + salario);
    }
  }
}
