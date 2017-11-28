/*
 * Define tres arrays de 20 números enteros cada una, con nombres numero ,
 * cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero . En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 * 
 * @author Alejandro MV
 */



public class T7e04 {
  public static void main(String[] args) {
 
  
  int indiceNumero = 0;

  int[] numero = new int[20];

  int[] cuadrado = new int[20];

  int[] cubo = new int[20];

  for (int i = 0;i < 20;i++) {
    numero[indiceNumero] = (int)(Math.random()*101);
    cuadrado[indiceNumero] = numero[indiceNumero] * numero[indiceNumero];
    cubo[indiceNumero] = numero[indiceNumero] * numero[indiceNumero] * numero[indiceNumero];
    indiceNumero++;
  }

  indiceNumero = 0;

  System.out.printf("%5s  %5s  %5s \n", "numero", "cuadrado", "cubo");

  for (int i = 0;i < 20;i++) {
    
    System.out.printf("%5d    %5d     %5d \n", numero[indiceNumero], cuadrado[indiceNumero], cubo[indiceNumero]);
    indiceNumero++;
  }

  }
  
}