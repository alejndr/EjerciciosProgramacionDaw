/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author Alejandro MV
 */
public class T5e10 {
  public static void main(String[] args) {
  
  int intro = 0;
  int suma = 0;
  int divi = 0;
   System.out.println("Vamos a calcular la media de los números que introduzcas");
  do{
  
  System.out.print("Cuando termines introduce un número negativo: ");
  intro = Integer.parseInt(System.console().readLine());
   
    if(intro >= 0){
    suma = suma + intro;
    divi ++;
    }
  
    
    }while (intro >= 0); {
  
    System.out.println("Media: " + (suma / divi));
    
    }
  
  }
}

