package Ex12iamv2;

import Ex12iamv1.Terminal;

/**
 *
 * @author Ignacio Alejandro De La Maza Villalba
 * Fecha: 20 de Febrero de 2018
 */
public class Movil extends Terminal {

  private String tarifa;
  private double tarificacion;
  private int tiempoConversacionMovil;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
  }

  @Override
  public String toString() {
    String mensaje = "";

    mensaje += "Nº ";
    mensaje += this.getNumero();
    mensaje += " - ";
    mensaje += this.tiempoConversacionMovil;
    mensaje += "s de conversación";
    mensaje += " - ";
    mensaje += "tarificados ";
    mensaje += tarificacion;
    mensaje += " euros";

    return mensaje;
  }

  public void llama(Movil n, int duracion) {
    
    switch (tarifa) {
      case "rata":
        this.tarificacion += ((double)duracion/60) * 0.06;
        break;

      case "mono":
        this.tarificacion += ((double)duracion/60) * 0.12;
        break;

      case "bisonte":
        this.tarificacion += ((double)duracion/60) * 0.30;
        break;

      default:
    }
    
    this.tiempoConversacionMovil+=duracion;
    n.tiempoConversacionMovil+=duracion;

  }

}
