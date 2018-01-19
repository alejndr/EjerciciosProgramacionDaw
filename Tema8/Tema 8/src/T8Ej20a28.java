
/**
 *
 * @author alejandro
 */
import Arrays.array;
import java.util.Scanner;

public class T8Ej20a28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int numero2;
    int numero3;
    /// Generar Array //////////////////////////////////////////////////////////
    
    System.out.println("Vamos a generar un array aleatoriamente. Introduce de que tamaño quieres que sea el array: ");
    numero = s.nextInt();
    System.out.println("Introduce el numero mas pequeño");
    numero2 = s.nextInt();
    System.out.println("Introduce el numero mas grande");
    numero3 = s.nextInt();
    int[] x = Arrays.array.generaArrayInt(numero, numero2, numero3);
    
    Arrays.array.muestraArrayInt(x);
    System.out.println(" ");
    
    /// Minimo Array ///////////////////////////////////////////////////////////
    
    System.out.println("Vamos a mostrar el numero mas pequeño del anterior Array:");
    System.out.println(Arrays.array.minimoArrayInt(x));
    System.out.println(" ");
    
    /// Minimo Array ///////////////////////////////////////////////////////////
    
    System.out.println("Vamos a mostrar el numero mas grande del array generado:");
    System.out.println(Arrays.array.maximoArrayInt(x));
    System.out.println(" ");
    
    /// Media Array ////////////////////////////////////////////////////////////
    
    System.out.println("Vamos a mostrar la media entre los numeros del array generado:");
    System.out.println(Arrays.array.mediaArrayInt(x));
    System.out.println(" ");
    
    /// Esta en Array //////////////////////////////////////////////////////////
    
    System.out.println("Introduce un numero para saber si se encuentra en el array generado:");
    numero = s.nextInt();
    if (Arrays.array.estaEnArrayInt(x, numero)) {
    System.out.println("El número si esta en el array");
    } else {
    System.out.println("El número no esta en el array");
    }
    System.out.println(" ");
    
    /// Posición en Array //////////////////////////////////////////////////////
    
    System.out.println("Introduce un numero para saber en que posición se encuentra en el array generado, devolvera -1 en caso de que ese numero no se encuentre");
    numero = s.nextInt();
    System.out.println(Arrays.array.posicionEnArrayInt(x, numero));
    System.out.println(" ");
    
    /// Voltear Array //////////////////////////////////////////////////////////
    
    System.out.println("Vamos a darle la vuelta al array generado: ");
    int[] arrayvolteado = Arrays.array.volteaArrayInt(x);
    Arrays.array.muestraArrayInt(arrayvolteado);
    System.out.println(" ");
    
    /// Rotar der Array ////////////////////////////////////////////////////////
    System.out.println("Introduce cunatas posiciones vamos rotar a la derecha el array generado: ");
    numero = s.nextInt();
    int [] arrayrotado = Arrays.array.rotaDerechaArrayInt(x, numero);
    Arrays.array.muestraArrayInt(arrayrotado);
    
    /// Rotar izq Array ////////////////////////////////////////////////////////
    System.out.println("Introduce cunatas posiciones vamos rotar a la izquierda el array generado: ");
    numero = s.nextInt();
    arrayrotado = Arrays.array.rotaIzquierdaArrayInt(x, numero);
    Arrays.array.muestraArrayInt(arrayrotado);
    
    
    
  
  }
}
