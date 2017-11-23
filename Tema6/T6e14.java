/*
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 * 
 * @author Alejandro MV
 */


public class T6e14 {
  public static void main(String[] args) {
  
  
  System.out.println("Piensa en un número del 0 al 100 y intentare adivinarlo.");
  int solucion = 0;
  String respuesta = "";
  int menorAleatorio = 101;
  String respuestaMayorMenor = "";
  int mayorAleatorio = 0;
  
  
    for (int i = 1; i < 6; i++) {
      solucion = (int)((Math.random()*menorAleatorio)+mayorAleatorio);
      System.out.println("¿Es el numero " + solucion + " ? (s/n): ");
      respuesta = (System.console().readLine());
      
      
      if (respuesta.equals("s")) {
      System.out.print("Bien, algun dia las maquinas dominaremos a los humanos");
      break;
      } else if (respuesta.equals("n")) {
          System.out.println("¿Es mayor o menor? (mayor/menor): ");
          respuestaMayorMenor = (System.console().readLine());
          
          if (respuestaMayorMenor.equals("mayor")) {
            menorAleatorio -= solucion;
            mayorAleatorio += solucion;
            
          } else {
            menorAleatorio -= solucion;
            
            
            }
          
          
          
        }
    }
  
  }
  
}
