/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Alejandro MV
 */


public class T5e20 {
  public static void main(String[] args) {
  System.out.println("Este programa nos va a sacar una piramide hueca dada una altura y un caracter de relleno.");
  System.out.print("Introduce la altura: ");
  int altura = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el caracter de relleno: ");
  String relleno = (System.console().readLine());

  int x = 0;
  int espacios = altura - 1;
  int contaRelleno = 1;

  while (x < altura) {

    for (int i = 0;i < espacios;i++) {
      
    System.out.print(" ");
    }
  
    for (int e = 1;e < contaRelleno*2;e++) {
    
    System.out.print(relleno);
    }
    
  System.out.println();
  
  espacios--;
  contaRelleno++;
  x++;
  
  }
  
  }
  
}
