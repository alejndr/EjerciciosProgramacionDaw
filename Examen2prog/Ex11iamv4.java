/*
 * Los Reyes Magos de Oriente se están entrenando para estar en forma cuando tengan que repartir los
 * regalos a los niños. Para ello, compiten con frecuencia haciendo carreras de camellos entre ellos.
 * Realiza un simulador de carreras de camellos que cumpla las siguientes condiciones:
 * a) La pista de carreras tiene 8 posiciones (7 guiones y una bandera).
 * b) La carrera se realizará por pasos, en cada paso el programa debe pintar el estado de la carrera.
 * c) La línea de meta se indica con una banderita (una P mayúscula), que está exactamente en la
 * posición número 8 de la pista de carreras.
 * d) En el paso número 1, todos los competidores están en la posición número 1.
 * e) En cada paso, uno de los competidores (elegido de forma aleatoria) avanza un paso.
 * f) Gana la carrera el Rey Mago que consigue llegar a la línea de meta (donde está la bandera).
 * g) Los caracteres utilizados y el formato debe ser como el que se muestra en el ejemplo.
 * 
 * Jueves 14 de diciembre 2017
 * Segundo turno
 * @author Alejandro MV
 */



public class Ex11iamv4 {
  public static void main(String[] args) {

    int[] espacios = new int[3];
    espacios[0] = 0;
    espacios[1] = 1;
    espacios[2] = 2;

    String ganador = "";
    int espaciosM = 0;
    int espaciosB = 0;
    int espaciosG = 0;
    int contador = 1;
    int azar = 0;

    boolean bucle = true; 

    while (bucle) {

      azar = (int)(Math.random()*3);

      System.out.println("Paso " + contador + "   -------P");
      System.out.print(" Melchor:");
        if (espacios[azar] == 0) {
          espaciosM++; 
        }
        for (int i = 0;i < espaciosM; i++) {
          System.out.print(" ");
        }
      System.out.println("M");

      System.out.print("  Gaspar:");
      if (espacios[azar] == 1) {
        espaciosG++;
      }
      for (int i = 0;i < espaciosG; i++) {
        System.out.print(" ");
      }
      System.out.println("G");

      System.out.print("Baltasar:");
      if (espacios[azar] == 2) {
        espaciosB++;
      }
      for (int i = 0;i < espaciosB; i++) {
        System.out.print(" ");
      }
      System.out.println("B");
        
      System.out.println("");
      
      contador++;

      if (espaciosM == 8) {
        bucle = false;
        ganador = "Melchor";
      }
      if (espaciosB == 8) {
        bucle = false;
        ganador = "Baltasar";
      }
      if (espaciosG == 8) {
        bucle = false;
        ganador = "Gaspar";
      }

    }

    System.out.println("¡Ha ganado " + ganador + "!");


  }
  
}