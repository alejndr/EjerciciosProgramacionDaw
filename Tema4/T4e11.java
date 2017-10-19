/**
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Alejandro mv
 */

public class T4e11 {
  public static void main(String[] args) {   
    
    int segundosDia = 86400;
    
    System.out.print("Dime que hora es (solo hora): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Dime los minutos minutos): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int horaSeg = (hora * 60) * 60;
    int minutosSeg = minutos * 60;
    int segTotal = (horaSeg + minutosSeg) - segundosDia;
    
    if (segTotal > 86400) {
    System.out.println("La hora que has introducido es incorrecta");}
    
    System.out.printf("Faltan %d segundos para la media noche", segTotal);
  }
}



