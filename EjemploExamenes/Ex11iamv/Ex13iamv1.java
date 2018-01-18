/*
 * Igancio Alejandro de la Maza villalba, 14 de noviembre de 2017, turno 1
 * 
 * La compañía automovilística Ñesla nos ha encargado un configurador para calcular el precio de su
 * coche eléctrico. Los dos modelos que tiene a la venta son el Ñesla Modelo 5 y el Ñesla Modelo 8,
 * que tienen un precio base de 30.000 € y 36.000 € respectivamente. El Modelo 5 se puede encargar
 * con batería de 50 kWh o de 70 kWh mientras que el modelo 8 se puede pedir con 80 kWh o con 120
 * kWh. En todos los casos, cada kWh de batería se paga a 125 €. El Modelo 8 (solo este modelo) se
 * puede encargar con el paquete de conducción autónoma, que cuesta 1800 €. Todos los coches
 * eléctricos cuentan con una subvención del gobierno del 5% del precio final del vehículo. No hay que
 * considerar el IVA, ya está incluido en todas las tarifas.
 * 
 * @author Alejandro MV
 */



public class Ex13iamv1 {
  public static void main(String[] args) {
  
  String bateriaSeleccionada = "";
  double precio = 0;
  double precioA = 30000;
  double precioB = 36000;
  double kwh = 125;
  double conduccionAutonoma = 1800;
  String modeloDeCoche = "";
  double precioBase = 0;
  double subvencion = 0;
  String bateria;
  String printAutonoma = "";
  double precioAutonoma = 0;
  double printPrecioBateria = 0;
  
  System.out.print("Seleccione el modelo de coche (a)modelo 5 (b)modelo 8: ");
  String modelo = System.console().readLine();
  
  
  switch (modelo) {
    case "a":
      precio += precioA;
    
      modeloDeCoche = "Ñesla modelo 5";
      precioBase = precioA;
      System.out.print("Seleccione el tipo de batería (a)50kWh (b)70kWh: ");
      bateria = System.console().readLine();
    
      if (bateria.equals("a")) {
        
        bateriaSeleccionada = "50 kWh";
        precio = precio + (kwh*50);
        printPrecioBateria = kwh*50;
      } else {
        
        bateriaSeleccionada = "70 kWh";
        precio = precio + (kwh*70);
        printPrecioBateria = kwh*70;
        }
      
      break;
    case "b":
      precio += precioB;
    
      precioBase = precioB;
      modeloDeCoche = "Ñesla modelo 8";
      System.out.print("Seleccione el tipo de batería (a)80kWh (b)120kWh: ");
      bateria = System.console().readLine();
    
    if (bateria.equals("a")) {
      
      bateriaSeleccionada = "80 kWh";
      precio = precio + (kwh*80);
      printPrecioBateria = kwh*80;
    } else {
      
      bateriaSeleccionada = "120 kWh";
      precio = precio + (kwh*120);
      printPrecioBateria = kwh*120;
      }
      
    System.out.print("¿Quiere el paquete de conducción autónoma? (s/n): ");
    String autonoma = System.console().readLine();
    
    if (autonoma.equals("s")) {
      
      precio = precio + conduccionAutonoma;
      printAutonoma = "Con conducción aut.";
      precioAutonoma = conduccionAutonoma;
    } else {
        precioAutonoma = 0;
        printAutonoma = "Sin conducción aut.";
    }
      
      
      break;

    default:
      
  }
  
  

  subvencion = precio * 0.05;
  precio = precio - subvencion;
  
  System.out.println("Gracias. Aqui tiene el presupuesto de su coche: \n");
  System.out.printf("%s \n", modeloDeCoche);
  System.out.printf("Precio base: %.2f€ \n", precioBase);
  System.out.printf("Bateria de %s: %.2f€ \n", bateriaSeleccionada, printPrecioBateria);
  
  if (modelo.equals("b")) {
  
    System.out.printf("%s: %.2f€ \n", printAutonoma, precioAutonoma);
  }
  
  System.out.printf("Subvención estatal: -%.2f€ \n", subvencion);
  System.out.printf("Total: %.2f€ \n", precio);
  

  
  }
  
}
