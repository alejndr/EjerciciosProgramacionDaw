


/**
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author alejandro
 */
public class T18Ej15 {
  public static void main(String[] args) {
    
    int num = 2;
    
    for (int i=2;i<1000;i++) {
    
    if (matematicas.manejonumeros.esPrimo(num)) {
    
    System.out.println(num + " ");
      
    }
    num++;
    }
	
  
  }
  
}
