package t9ej03;

/**
 *
 * @author alejandro
 */
public class T9Ej03 {
  public static void main(String[] args) {
    Gato darko = new Gato("Darko","macho");
    Gato jackie = new Gato("Jackie","hembra");
    Perro leto = new Perro("Leto", "macho");
    
    jackie.daDeMamar();
    jackie.araña();
    darko.araña();
    darko.maulla();
    darko.daDeMamar();
    leto.ladra();
    leto.respira();
    
    
    
  }
}
