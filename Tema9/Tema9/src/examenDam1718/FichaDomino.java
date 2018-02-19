package examenDam1718;

/**
 *
 * @author alejandro
 */
public class FichaDomino {

  private int posicion1;
  private int posicion2;

  public FichaDomino(int posicion1, int posicion2) {
    this.posicion1 = posicion1;
    this.posicion2 = posicion2;
  }

  public int getPosicion1() {
    return posicion1;
  }

  public void setPosicion1(int posicion1) {
    this.posicion1 = posicion1;
  }

  public int getPosicion2() {
    return posicion2;
  }

  public void setPosicion2(int posicion2) {
    this.posicion2 = posicion2;
  }
  
  

  @Override
  public String toString() {
    
    String imprimir= "";
    
    imprimir+= "[";
    
    if (posicion1==0) {
    imprimir+= " ";
    } else {
    imprimir+=posicion1;
    }
    
    imprimir+="|";
    
    if (posicion2==0) {
    imprimir+= " ";
    } else {
    imprimir+=posicion2;
    }
    
    imprimir+="]";
    
    return imprimir;
  }

  public FichaDomino voltea() {

    int aux = this.posicion1;
    this.posicion1 = this.posicion2;
    this.posicion2 = aux;

    FichaDomino fichaVolteada = new FichaDomino(this.posicion1, this.posicion2);

    return fichaVolteada;
  }
  
  public boolean encaja(FichaDomino n){
  boolean encaja;
  
  if (this.posicion2 == n.posicion1 || this.posicion1 == n.posicion2 || this.posicion1 == n.posicion1 || this.posicion2 == n.posicion2) {
  encaja = true;
  } else {
  encaja = false;
  }
  
    return encaja;
  }

}
