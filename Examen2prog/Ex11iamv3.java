/*
 * En ocasiones, en clase, se pide la iniciativa de un alumno voluntario para corregir ejercicios, salir a la
 * pizarra, etc. Por vergüenza, por no tener las tareas hechas o por cualquier otro motivo, a veces nadie
 * se presta voluntario o bien se ofrecen siempre los mismos. Para evitar esta situación vamos a realizar
 * un programa que seleccione un alumno de la clase de forma aleatoria. Para simplificar, se tienen en
 * cuenta solamente 6 alumnos.
 * 
 * Jueves 14 de diciembre 2017
 * Segundo turno
 * @author Alejandro MV
 */



public class Ex11iamv3 {
  public static void main(String[] args) {
    
    String[] nombres = new String[6];
    nombres[0] = "Adrián Aguilar"; 
    nombres[1] = "Manuel Alcántara"; 
    nombres[2] = "Jorge Alcaraz"; 
    nombres[3] = "Joaquín Bello"; 
    nombres[4] = "María Margarita Benítez"; 
    nombres[5] = "Francisco Casasola"; 

    int azar = (int)(Math.random()*6);
    
    
    System.out.print("Le ha tocado salir a... " + nombres[azar]);

  
  }
  
}