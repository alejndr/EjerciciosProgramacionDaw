/*
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
 * ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
 * bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
 * precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
 * IVA ya está incluido en todas las tarifas.
 * 
 * @author Alejandro MV
 */


public class Ejercicio2 {
  public static void main(String[] args) {
  System.out.println("Fatura bandera españa");
  
  double total = 0;
  double areaBandera = 0;
  double precioBandera = 0;
  double gastosEnvio = 3.25;
  double bordadoSi = 2.5;
  int alto = 0;
  int ancho = 0;
  
  System.out.print("Alto en cm: ");
  alto = Integer.parseInt(System.console().readLine());
  System.out.print("Ancho en cm: ");
  ancho = Integer.parseInt(System.console().readLine());
  System.out.print("¿Quiere escudo bordado? (s/n)");
  String bordado = System.console().readLine();

  areaBandera = alto * ancho;
  precioBandera = areaBandera * 0.01;
  
  total = precioBandera + gastosEnvio;
  
  if (bordado.equals("s")) {
    total = total + bordadoSi;
    }

  
  System.out.println("Gracias. Aquí tiene el desglose de su compra.");
  System.out.printf("Su bandera de %.2f m²: %5.2f€ \n", areaBandera, precioBandera);
    
    if (bordado.equals("s")) {
    System.out.printf("Con bordado: %5.2f€ \n", 2.50);
    } else {
      System.out.printf("Sin bordado: %5.2f€ \n", 0.0);
      }
  
  System.out.printf("Gastos de envio: %5.2f€ \n", 3.25);
  System.out.printf("Total: %6.2f€ ", total);

  }
  
}


