package t9ej02;

/**
 *
 * @author alejandro
 */
public abstract class Vehiculo {

  private static int  vehiculosCreados;
  private static double kilometrosTotales;
  private int kilometraje;

  public Vehiculo() {
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static double getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(double kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
  }

  
  
  public void anda(int km) {
    this.kilometraje+=km;
    Vehiculo.kilometrosTotales+=km;
  }
}
