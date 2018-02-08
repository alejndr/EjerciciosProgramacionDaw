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

  public void invierte() {
    int jk;
    jk = numerador;
    numerador = denominador;
    denominador = jk;
  }

  public void simplifica() {

  }

  public Fraccion multiplica(Fraccion fraccion2) {
    this.numerador = this.numerador * fraccion2.numerador;
    this.denominador = this.denominador * fraccion2.denominador;

    Fraccion fraccionMultiplicada = new Fraccion(this.numerador, this.denominador);

    return fraccionMultiplicada;
  }

  @Override
  public String toString() {
    return "Fraccion:\n" + "\nDenominador: " + denominador + "\nNumerador: " + numerador;
  }

  public Fraccion divide(Fraccion fraccion2) {
    this.numerador = this.numerador * fraccion2.denominador;
    this.denominador = this.denominador * fraccion2.numerador;

    Fraccion fraccionDividida = new Fraccion(this.numerador, this.denominador);
    return fraccionDividida;
  }
}
