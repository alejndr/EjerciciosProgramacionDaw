/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
 * gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 *
 * @author Alejandro mv
 */

public class T4e23 {
  public static void main(String[] args) {   
  System.out.print("Introduce la base imponible: ");
  double base = Double.parseDouble(System.console().readLine());
  System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
  String iva = (System.console().readLine().toLowerCase());
  System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
  int promo = Integer.parseInt(System.console().readLine());
  
  switch (iva) {
    case "general":
      double ivaAplicado = ((base * 0.21) + base);
      break;
    case "reducido":
      double ivaAplicado = ((base * 0.10) + base);
      break;
    case "superreducido":
      double ivaAplicado = ((base * 0.04) + base);
      break;

    default:
        
    }
  
  
  }
}



