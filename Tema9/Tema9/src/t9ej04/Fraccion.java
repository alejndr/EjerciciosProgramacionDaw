package t9ej04;

/**
 *
 * @author alejandro
 */
public class Fraccion {
  int numerador;
  int denominador;

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  public void invierte(){
    int jk;
    jk = numerador;
    numerador = denominador;
    denominador = jk;
  }
  
  public void simplifica(){
  
  }
  
  public void multiplica(){
  
  }
  
  public void divide(){
  
  }
}
