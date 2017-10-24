/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
 * mantiene la nota media anterior.
 *
 * @author Alejandro mv
 */

public class T4e21 {
  public static void main(String[] args) {   
  System.out.println("Notas programación 1º trimestre 2017");
  System.out.print("Introduce la nota del primer examen: ");
  int nota1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce la nota del segundo examen: ");
  int nota2 = Integer.parseInt(System.console().readLine());
  
  int media = (nota1 + nota2) / 2;
  
  if (media >= 5) {
  System.out.print("media del trimestre: " + media);
  } else {
  System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
  String recu = (System.console().readLine());
  
  if ("apto".equals(recu)) {
  System.out.print("Tu nota media es: 5");
  } else {
  System.out.print("Tu nota media es: " + media);
  }
  }
}
}


