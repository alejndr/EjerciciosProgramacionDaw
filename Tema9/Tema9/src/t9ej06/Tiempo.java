package t9ej06;

/**
 *
 * @author alejandro
 */
public class Tiempo {

  int hora;
  int minuto;
  int segundo;

  public Tiempo(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  public Tiempo() {
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  @Override
  public String toString() {
    return hora + "h " + minuto + "m " + segundo + "s";
  }

  public Tiempo suma(Tiempo n) {
    
    this.segundo+=n.segundo;
    this.minuto+=n.minuto;
    
    while (this.segundo >= 60) {
      this.segundo -= 60;
      this.minuto += 1;
    }
    
    while (this.minuto >= 60) {
      this.minuto -= 60;
      this.hora += 1;
    }

    this.hora += n.hora;
    
    Tiempo aux = new Tiempo(this.hora, this.minuto, this.segundo);
    
    return aux;
  }
  
  public Tiempo resta(Tiempo n) {

    this.hora -= n.hora;
    
    while (this.hora < 0) {
    this.minuto-=60;
    this.hora+=1;
    }
    
    this.minuto-=n.minuto;
    
    while(this.minuto > 0){
    
    }
    
    Tiempo aux = new Tiempo(this.hora, this.minuto, this.segundo);
    
    return aux;
  }
  
}