package t9ej03;

/**
 *
 * @author alejandro
 */
public abstract class Mamifero extends Animal {

  public Mamifero(String nombre, String sexo) {
    super(nombre, sexo);
  }

  public void daDeMamar() {
    if (this.sexo.equals("macho")) {
      System.out.println(this.nombre + " dice: No puedo dar de mamar, soy macho");
    } else {
      System.out.println(this.nombre + " da de mamar a su cria.");
    }

  }

}
