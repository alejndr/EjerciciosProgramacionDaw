/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Alejandro MV
 */


public class T5e31 {
  public static void main(String[] args) {
  System.out.println("Este programa va mostar una L de la altura introducida.");
  System.out.print("Introduce la altura de la L: ");
  int intro = Integer.parseInt(System.console().readLine());
  
    int altura = intro-1;
  
    for (int i = 0;altura>i;i++) {
    
    System.out.println("*");
    }
    
    int base = (intro/2)+1;
    
    for (int i = 0;base>i;i++) {
    
    System.out.print("*");
    }
  
  }
  
}
