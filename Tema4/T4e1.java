/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author Alejandro mv
 */

public class T4e1 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un dia de la semana (sin tildes): ");
    String diaSemana = (System.console().readLine().toLowerCase());
    //(System.console().readLine().toLowerCase()); toLowerCase pasa todos los caracteres a minuscula
    String asignatura;
    
    switch (diaSemana) {
      case "lunes":
        asignatura = "Sistemas";
        break;
      case "martes":
        asignatura = "Programación";
        break;
      case "miercoles":
        asignatura = "Sistemas";
        break;
      case "jueves":
        asignatura = "Programación";
        break;
      case "viernes":
        asignatura = "Programación";
        break;
      case "sabado":
        asignatura = "Rave";
        break;
      case "domingo":
        asignatura = "Curar la resaca";
        break;
      default:
        asignatura = "No existe ese dia";
    }

    System.out.println("Los " + diaSemana + " te toca: " + asignatura);
  }
}

