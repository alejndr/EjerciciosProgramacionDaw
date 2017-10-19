/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 *
 * @author Alejandro mv
 */

public class T4e15 {
  public static void main(String[] args) {   
    
    
    System.out.println("--Constructor de piramides con caracteres--");
    System.out.print("Introduce una una letra, un número o un símbolo como *, +, -, $ o &: ");
    String O = (System.console().readLine());
    System.out.println("¿A que dirección quieres que apunte la pirámide?");
    System.out.println("-Para que apunte arriba pulsa (1)");
    System.out.println("-Para que apunte abajo pulsa (2)");
    System.out.println("-Para que apunte a la derecha pulsa (3)");
    System.out.println("-Para que apunte a la izquierda pulsa (4)");
    int direccion = Integer.parseInt(System.console().readLine());
    
    switch (direccion) {
      case 1:
		System.out.println("    "+O);
		System.out.println("   "+O+O+O);
		System.out.println("  "+O+O+O+O+O);
		System.out.println(" "+O+O+O+O+O+O+O); 
        System.out.println(O+O+O+O+O+O+O+O+O);
        break;
      case 2:
        System.out.println(O+O+O+O+O+O+O+O+O);
        System.out.println(" "+O+O+O+O+O+O+O); 
        System.out.println("  "+O+O+O+O+O);
        System.out.println("   "+O+O+O);
        System.out.println("    "+O);
        break;
      case 3:
        System.out.println(" "+O);
        System.out.println(" "+O+" "+O); 
        System.out.println(" "+O+" "+O+" "+O);
        System.out.println(" "+O+" "+O+" "+O+" "+O);
        System.out.println(" "+O+" "+O+" "+O+" "+O+" "+O);
        System.out.println(" "+O+" "+O+" "+O+" "+O);
        System.out.println(" "+O+" "+O+" "+O);
        System.out.println(" "+O+" "+O);
        System.out.println(" "+O);
        break;
      case 4:
        System.out.println("         "+O);
        System.out.println("       "+O+" "+O); 
        System.out.println("     "+O+" "+O+" "+O);
        System.out.println("   "+O+" "+O+" "+O+" "+O);
        System.out.println(" "+O+" "+O+" "+O+" "+O+" "+O);
        System.out.println("   "+O+" "+O+" "+O+" "+O);
        System.out.println("     "+O+" "+O+" "+O);
		System.out.println("       "+O+" "+O);
        System.out.println("         "+O);
        break;
      default:
        
    }
  }
}



