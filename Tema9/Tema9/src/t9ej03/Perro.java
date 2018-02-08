package t9ej03;

/**
 *
 * @author alejandro
 */
public class Perro extends Mamifero{

  public Perro(String nombre, String sexo) {
    super(nombre, sexo);
  }
  
  public void ladra(){
    System.out.println(this.nombre+" dice: Guau! Guau!");
  }
}
