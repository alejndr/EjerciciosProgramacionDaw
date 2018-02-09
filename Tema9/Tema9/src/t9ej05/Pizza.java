package t9ej05;

/**
 *
 * @author alejandro
 */
public class Pizza {
  String tipo;
  String tamaño;
  String servida="pedida";
  static int totalServidas;
  static int totalPedidas;

  public Pizza(String tipo, String tamaño) {
    this.tipo = tipo;
    this.tamaño = tamaño;
    totalPedidas++;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  public String getTamaño() {
    return tamaño;
  }

  public void setTamaño(String tamaño) {
    this.tamaño = tamaño;
  }

  public String isServida() {
    return servida;
  }

  public void setServida(String servida) {
    this.servida = servida;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }
  
  //toString

  @Override
  public String toString() {
    return "pizza " + tipo + " " + tamaño + ", " + servida;
  }
  
  
  public void sirve(){
  if(servida.equals("pedida")){
  servida="servida";
  totalServidas++;
  } else {
    System.out.println("esa pizza ya se ha servido");
  }
  
  
  }
  
  
}
