/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 *
 * @author Alejandro mv
 */

public class T4e22 {
  public static void main(String[] args) {   
  System.out.println("Contador de minutos asta el fin de semana");
  System.out.print("Introduce el dia de la semana (en texto): ");
  String diaSem = (System.console().readLine().toLowerCase());
  System.out.print("Introduce la hora que es (solo hora): ");
  int horaSem = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce los minutos: ");
  int minutoSem = Integer.parseInt(System.console().readLine());
  
  int minutosDia = 1440;
  int astaLasTres = 900;
  
  switch (diaSem) {
    case "lunes":
      int quedanL = (minutosDia-((horaSem * 60)+minutoSem))+(minutosDia * 3) + astaLasTres;
      System.out.print("Quedan " + quedanL + " minutos asta el fin de semana.");
      break;
    case "martes":
      int quedanM = (minutosDia-((horaSem * 60)+minutoSem))+(minutosDia * 2) + astaLasTres;
      System.out.print("Quedan " + quedanM + " minutos asta el fin de semana.");
      break;
    case "miercoles":
      int quedanMi = (minutosDia-((horaSem * 60)+minutoSem))+(minutosDia * 1) + astaLasTres;
      System.out.print("Quedan " + quedanMi + " minutos asta el fin de semana.");
      break;
    case "jueves":
      int quedanJ = (minutosDia-((horaSem * 60)+minutoSem)) + astaLasTres;
      System.out.print("Quedan " + quedanJ + " minutos asta el fin de semana.");
      break;
    case "viernes":
      if (horaSem < 15) {int quedanV = (astaLasTres-((horaSem * 60)+minutoSem));
        System.out.print("Quedan " + quedanV + " minutos asta el fin de semana.");}
      else if (horaSem >= 15) {int quedanV = (minutosDia-((horaSem * 60)+minutoSem)) + (minutosDia * 6) + astaLasTres;
        System.out.print("Quedan " + quedanV + " minutos asta el siguiente fin de semana.");}
      
      break;
    case "sabado":
      int quedanS = (minutosDia-((horaSem * 60)+minutoSem))+(minutosDia * 5) + astaLasTres;
      System.out.print("Quedan " + quedanS + " minutos asta el siguiente fin de semana.");
      break;
    case "domingo":
      int quedanD = (minutosDia-((horaSem * 60)+minutoSem))+(minutosDia * 4) + astaLasTres;
      System.out.print("Quedan " + quedanD + " minutos asta el siguiente fin de semana.");
      break;

      default:
        
    }
  
  
  }
}


