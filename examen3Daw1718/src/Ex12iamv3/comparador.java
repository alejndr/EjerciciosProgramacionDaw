package Ex12iamv3;

/**
 *
 * @author Ignacio Alejandro De La Maza Villalba
 * Fecha: 20 de Febrero de 2018
 */
public class comparador {
  
  public static void main(String[] args) {
    
    String[] arrayA = {"casa", "coche", "sol", "mesa", "ordenador", "sol", "CASA"};
    String[] arrayB = {"zambomba", "coche", "casa", "sol", "mermelada"};
    String[] resultado = palabrasComunes(arrayA, arrayB);
    
    System.out.println("Primer array: ");
    
    for (String a : arrayA) {
      System.out.print(a + " ");
    }
    
    System.out.println("");
    System.out.println("");
    
    System.out.println("Segundo array: ");
    
    for (String a : arrayB) {
      System.out.print(a + " ");
    }
    
    System.out.println("");
    System.out.println("");
    
    System.out.println("Array con las repeticiones: ");
    
    for (String a : resultado) {
      System.out.print(a + " ");
    }
    
    System.out.println("");
    
    
    
  }
  
  public static String[] palabrasComunes(String[] a, String[] b) {
   int repetidos = 0;
   for (int i = 0; i < a.length; i++) {
      for (int e = 0; e < b.length; e++) {
        if (a[i].equals(b[e])) {
          repetidos++;
        }
      }
    }
   
   
   String[] resultado = new String[repetidos];
   
   int indice = 0;
   for (int i = 0; i < a.length; i++) {
      for (int e = 0; e < b.length; e++) {
        if (a[i].equals(b[e])) {
          resultado[indice]=a[i];
          indice++;
        }
      }
    }
   
    return resultado ;
  }
  
}
