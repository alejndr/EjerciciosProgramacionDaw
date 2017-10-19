/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 *
 * @author Alejandro mv
 */

public class T4e10 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca el número mes en el que naciste: ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el dia en el que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case 1:
        if (dia <= 19) {
        System.out.print("Tu signo del zodiaco es: Capricornio"); }
        if (dia >= 20) {
         System.out.print("Tu signo del zodiaco es: Acuario"); }
        break;
      case 2:
        if (dia <= 18) {
        System.out.print("Tu signo del zodiaco es: Acuario"); }
        else if (dia >= 19) {
         System.out.print("Tu signo del zodiaco es: Piscis"); }
        break;
      case 3:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Piscis"); }
        else if (dia >= 21) {
         System.out.print("Tu signo del zodiaco es: Aries"); }
        break;
      case 4:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Aries"); }
        else if (dia >= 21) {
         System.out.print("Tu signo del zodiaco es: Tauro"); }
        break;
      case 5:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Tauro"); }
        else if (dia >= 21) {
         System.out.print("Tu signo del zodiaco es: Géminis"); }
        break;
      case 6:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Géminis"); }
        else if (dia >= 21) {
         System.out.print("Tu signo del zodiaco es: Cáncer"); }
        break;
      case 7:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Cáncer"); }
        else if (dia >= 21) {
         System.out.print("Tu signo del zodiaco es: Leo"); }  
        break;
      case 8:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Leo"); }
        else if (dia >= 22) {
         System.out.print("Tu signo del zodiaco es: Virgo"); }  
        break;
      case 9:
        if (dia <= 22) {
        System.out.print("Tu signo del zodiaco es: Virgo"); }
        else if (dia >= 23) {
         System.out.print("Tu signo del zodiaco es: Libra"); }  
        break;
      case 10:
        if (dia <= 22) {
        System.out.print("Tu signo del zodiaco es: Libra"); }
        else if (dia >= 23) {
         System.out.print("Tu signo del zodiaco es: Escorpio"); }  
        break;
      case 11:
        if (dia <= 22) {
        System.out.print("Tu signo del zodiaco es: Escorpio"); }
        else if (dia >= 23) {
         System.out.print("Tu signo del zodiaco es: Sagitario"); }  
        break;
      case 12:
        if (dia <= 20) {
        System.out.print("Tu signo del zodiaco es: Sagitario"); }
        else if (dia >= 21) {
         System.out.print("Tu signo del zodiaco es: Capricornio"); }  
        break;
      default:
        
    }

  }
}
