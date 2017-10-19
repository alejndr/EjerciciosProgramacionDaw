/**

 *
 * @author Alejandro mv
 */

public class T4e6 {
  public static void main(String[] args) {   
    
   double g = 9.81;
    
    System.out.println("Vamos a calcular el tiempo que tardará en caer un objeto");
    System.out.print("Introduce la altura desde que va a caer (metros): ");
    Double altura = Double.parseDouble(System.console().readLine());

    double calculo = Math.sqrt(2*altura/g);
    
    System.out.printf("El objeto tadara en caer: %.2f", calculo);
}


}
