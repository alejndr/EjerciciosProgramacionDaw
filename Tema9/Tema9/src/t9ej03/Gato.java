package t9ej03;

/**
 *
 * @author alejandro
 */
public class Gato extends Mamifero {

  public Gato(String nombre, String sexo) {
    super(nombre, sexo);
  }

  public String getNombre() {
    return nombre;
  }

  public String getSexo() {
    return sexo;
  }
  
  
  public void maulla(){
    System.out.println(this.nombre+" dice: Miau");
  }
  
  public void araña(){
    System.out.println(this.nombre+" rasca el sofa.");
  }
}
