/*
 * Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa
 * debe pedir el día de la semana (de lunes a domingo) y debe mostrar de forma aleatoria la secuencia
 * del entrenamiento en función de las siguientes pautas:
 * a) El entrenamiento empieza siempre con un calentamiento aeróbico que puede ser bicicleta,
 * elíptica o cinta.
 * b) A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los
 * grupos musculares grandes son espalda, pecho y piernas y los grupos musculares pequeños
 * son bíceps, tríceps y hombros.
 * c) El entrenamiento finaliza o bien con abdominales o bien con ejercicio aeróbico (bicicleta,
 * elíptica o cinta). En caso de finalizar con aeróbico, no se puede repetir el ejercicio que se hizo
 * en el calentamiento.
 * d) Los miércoles y los domingos son días de descanso.
 * 
 * @author Alejandro MV
 */



public class Ej4Ex2Gimnasio {
  public static void main(String[] args) {
  
    String[] calentamiento = new String[3];
    calentamiento[0] = "bicicleta"; 
    calentamiento[1] = "eliptica";
    calentamiento[2] = "cinta";

    String[] muscularGrande = new String[3];
    muscularGrande[0] = "espalda";
    muscularGrande[1] = "pecho";
    muscularGrande[2] = "piernas";

    String[] muscularPequeño = new String[3];
    muscularPequeño[0] = "biceps";
    muscularPequeño[1] = "triceps";
    muscularPequeño[2] = "hombros";


    String[] finaliza = new String[4];
    finaliza[0] = "bicicleta"; 
    finaliza[1] = "eliptica";
    finaliza[2] = "cinta";
    finaliza[3] = "abdominales";

    int azar = (int)(Math.random()*3);
    int azar3 = (int)(Math.random()*3);
    int azar4 = (int)(Math.random()*3);
    int azar2 = (int)(Math.random()*4);
    
    String diaSemana = "";

    System.out.print("Introduzca el dia de la semana: ");
     diaSemana = System.console().readLine();

    String comienzo = calentamiento[azar];
    String fin = finaliza[azar2];
    while (fin == comienzo) {
    fin = finaliza[azar2];
    }

    switch (diaSemana) {
      case "lunes":
      System.out.print("Su calentamiento de hoy es: " + comienzo +", "+ muscularGrande[azar3] +", "+ muscularPequeño[azar4] +", "+ fin);
      break;
      case "martes":
      System.out.print("Su calentamiento de hoy es: " + comienzo +", "+ muscularGrande[azar3] +", "+ muscularPequeño[azar4] +", "+ fin);
      break;
      case "miercoles":
      System.out.print("Dia de descanso");
      break;
      case "jueves":
      System.out.print("Su calentamiento de hoy es: " + comienzo +", "+ muscularGrande[azar3] +", "+ muscularPequeño[azar4] +", "+ fin);
      break;
      case "viernes":
      System.out.print("Su calentamiento de hoy es: " + comienzo +", "+ muscularGrande[azar3] +", "+ muscularPequeño[azar4] +", "+ fin);
      break;
      case "sabado":
      System.out.print("Su calentamiento de hoy es: " + comienzo +", "+ muscularGrande[azar3] +", "+ muscularPequeño[azar4] +", "+ fin);
      break;
      case "domingo":
      System.out.print("Dia de descanso");
      break;

    default:
    }
    
    }
  
}