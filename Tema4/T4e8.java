/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Alejandro mv
 */
 
public class T4e8 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor introduce la primera nota del trimestre: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor introduce la segunda nota del trimestre: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor introduce la tercera nota del trimestre: ");
    Double c = Double.parseDouble(System.console().readLine());
    
    double media = (a+b+c) / 3;
    
    System.out.printf("Tu nota media del trimestre es: %.1f \n", media);
    
    if (media < 5) {
    System.out.println("Tu calificación es insuficiente");
    } else {
        if (media == 5) {
        System.out.println("Tu calificación es suficiente");
    }     else {
            if (media == 6) {
            System.out.println("Tu calificación es bien");
    }         else {
                if (media >=7 || media <=9 ) {
                System.out.println("Tu calificación es notable");
    }             else { 
                    if (media == 10) {
                      System.out.println("Tu calificación es sobresaliente");
    } 
    }
    }
    }
    }
  }
}

