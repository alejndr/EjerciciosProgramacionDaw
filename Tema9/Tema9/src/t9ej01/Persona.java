/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9ej01;

/**
 *
 * @author alejandro
 */
public class Persona {

  String nombre;
  String apellidos;
  double peso;

  public Persona() {
  }

  public Persona(String nombre, String apellidos, double peso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.peso = peso;
  }

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + " Apellidos: " + apellidos + " Peso: " + peso + "Kg";
  }

  public void espolea(String actitud) {
    switch (actitud) {
      case "agresivamente":
        System.out.println("Ghia!!");
        break;
      case "cariñosamente":
        System.out.println("Corre caballito");
        break;
      default:
        System.out.println("Arre Arre");
    }
    System.out.println("Arre Arre");
  }
}
