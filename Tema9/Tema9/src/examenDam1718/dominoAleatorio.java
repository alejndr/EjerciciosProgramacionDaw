package examenDam1718;

/**
 *
 * @author alejandro
 */
public class dominoAleatorio {

  public static void main(String[] args) {
    int contador = 0;
    String piezas = "";

    int aleatorio1 = (int) (Math.random() * 7);
    int aleatorio2 = (int) (Math.random() * 7);

    FichaDomino primeraFicha = new FichaDomino(aleatorio1, aleatorio2);
    FichaDomino comparador;
    comparador = primeraFicha;
    piezas += primeraFicha;

    while (contador < 8) {
      aleatorio1 = (int) (Math.random() * 7);
      aleatorio2 = (int) (Math.random() * 7);
      
      if (comparador.getPosicion2() == aleatorio1) {
        FichaDomino fichas = new FichaDomino(aleatorio1, aleatorio2);
        comparador = fichas;
        piezas += fichas;
        contador++;
      }
    }

    System.out.println(piezas);

  }

}
