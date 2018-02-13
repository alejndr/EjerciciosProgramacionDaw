/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscoches;

/**
 *
 * @author alejandro
 */
public class Coche implements ICoche{
  String marca;
  String modelo;
  String color;
  String matricula;
  String nomBastidor;
  int numeroDePuertas;
  int kilometraje = 0;
  static int kilometrajeTotal = 0;

  public static int getKilometrajeTotal() {
    return kilometrajeTotal;
  }

  public static void setKilometrajeTotal(int kilometrajeTotal) {
    Coche.kilometrajeTotal = kilometrajeTotal;
  }
  
  public int getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
  }

  public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public Coche(String marca, String modelo, String color, String matricula, String nomBastidor, int numeroDePuertas) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.matricula = matricula;
    this.nomBastidor = nomBastidor;
    this.numeroDePuertas = numeroDePuertas;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNomBastidor() {
    return nomBastidor;
  }

  public void setNomBastidor(String nomBastidor) {
    this.nomBastidor = nomBastidor;
  }

  public int getNumeroDePuertas() {
    return numeroDePuertas;
  }

  public void setNumeroDePuertas(int numeroDePuertas) {
    this.numeroDePuertas = numeroDePuertas;
  }
  // ToString

  @Override
  public String toString() {
    return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + ", nomBastidor=" + nomBastidor + ", numeroDePuertas=" + numeroDePuertas + ", kilometraje=" + kilometraje + '}';
  }
  
  // Metodos
  public void recorre(int km) {
  this.kilometraje+=km;
  Coche.kilometrajeTotal+=km;
  }
  
  
}
