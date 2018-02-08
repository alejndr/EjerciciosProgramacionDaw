package T9Ej01;

/**
 *
 * @author alejandro
 */
public class Caballo {
  String nombre;
  double peso; //Peso en kilos
  int altura; //Altura en cm
  String color;
  int velocidad = 0;
  Persona jinete;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public double getPeso() {
    return peso;
  }

  public int getAltura() {
    return altura;
  }

  public String getColor() {
    return color;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public Persona getJinete() {
    return jinete;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }

  @Override
  public String toString() {
    return "Caballo{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", color=" + color + ", velocidad=" + velocidad + ", jinete=" + jinete + '}';
  }
  
  public void galopa(){
    System.out.println(this.nombre+" corre como el viento.");
  }
}
