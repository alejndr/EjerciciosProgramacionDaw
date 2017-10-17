/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 *
 * @author Alejandro mv
 */

public class T4e3 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un numero de la semana: ");
    int semana = Integer.parseInt(System.console().readLine());
    
    String nombreDia;
    
    switch (semana) {
      case 1:
        nombreDia = "Lunes";
        break;
      case 2:
        nombreDia = "Martes";
        break;
      case 3:
        nombreDia = "Miércoles";
        break;
      case 4:
        nombreDia = "Jueves";
        break;
      case 5:
        nombreDia = "Viernes";
        break;
      case 6:
        nombreDia = "Sabado";
        break;
      case 7:
        nombreDia = "Domingo";
        break;
      default:
        nombreDia = "no existe ese dia";
    }

    System.out.println("Dia " + semana + ": " + nombreDia);
  }
}

