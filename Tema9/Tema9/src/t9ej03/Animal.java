package t9ej03;

/**
 *
 * @author alejandro
 */
public abstract class Animal {
  String nombre;
  String sexo;
  double peso;
  int edad;

  public Animal(String nombre, String sexo) {
    this.nombre = nombre;
    this.sexo = sexo;
  }
  
  
  
  public void respira(){
    System.out.println(this.nombre + " toma una bocanada.");
  
  }
}

