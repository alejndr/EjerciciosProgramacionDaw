package t9ej01;

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
  String sexo;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public Caballo() {
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

  public String getSexo() {
    return sexo;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "Caballo{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", color=" + color + ", velocidad=" + velocidad + ", jinete=" + jinete + '}';
  }

  public void galopa() {
    System.out.println(this.nombre + " corre como el viento.");
  }

  public String getNombre() {
    return nombre;
  }
  
  // Metodo para aparear dos caballos
  public Caballo seApareaCon(Caballo pareja, String nombreSiHembra, String nombreSiMacho) {
    if (pareja.getSexo().equals(this.sexo)) {
      System.out.println("Polvo sin crias");
      return null;
    } else {
      Caballo cria = new Caballo();
      
      if ((int) (Math.random() * 2) == 0) {
        cria.setSexo("hembra");
        cria.setNombre(nombreSiHembra);
      } else {
        cria.setSexo("macho");
        cria.setNombre(nombreSiMacho);
      }
      return cria;
    }
    
  }
}
