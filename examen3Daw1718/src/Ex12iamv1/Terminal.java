package Ex12iamv1;

/**
 *
 * @author Ignacio Alejandro De La Maza Villalba
 * Fecha: 20 de Febrero de 2018
 */
public class Terminal {
  private String numero;
  private int tiempoConversacion;

  public Terminal(String numero) {
    this.numero = numero;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }
  
  

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion + "s de conversación";
  }
  
  
  
  public void llama(Terminal n, int duracion){
  
    this.tiempoConversacion+=duracion;
    n.tiempoConversacion+=duracion;
  
  }
  
}
