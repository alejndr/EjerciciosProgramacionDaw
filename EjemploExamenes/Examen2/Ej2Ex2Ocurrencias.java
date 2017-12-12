/*
 * Realiza un programa que genere 20 números aleatorios entre 1 y 10 (ambos incluidos) y que los
 * muestre por pantalla. A continuación, el programa deberá mostrar el número de ocurrencias de cada
 * número. Puedes usar tantos arrays auxiliares como estimes oportuno.
 * 
 * @author Alejandro MV
 */



public class Ej2Ex2Ocurrencias {
  public static void main(String[] args) {
    
    int[] contador = new int[11]; 

    int[] primer = new int[20]; 
    
    for (int i = 0;i < 20;i++) {
      primer[i] = (int)(Math.random()*10+1);
    }

    System.out.print("Array original:");
    for (int n : primer) {
      System.out.print(" " + n);
    }
    
    for (int i = 0;i < 20;i++) {
      switch (primer[i]) {
          case 1:
          contador[1]++;
          break;
          case 2:
          contador[2]++;
          break;
          case 3:
          contador[3]++;
          break;
          case 4:
          contador[4]++;
          break;
          case 5:
          contador[5]++;
          break;
          case 6:
          contador[6]++;
          break;
          case 7:
          contador[7]++;
          break;
          case 8:
          contador[8]++;
          break;
          case 9:
          contador[9]++;
          break;
          case 10:
          contador[10]++;
          break;
    
        default:
          
      }
    }
    
    System.out.println("");
    System.out.println("Repeticiones de cada número");

    if (contador[1] != 0) {
      System.out.print("El numero 1 aparece " + contador[1] + " veces.");
    } else {
      System.out.print("El numero 1 no aparece");
    }
    System.out.println("");

    if (contador[2] != 0) {
      System.out.print("El numero 2 aparece " + contador[2] + " veces.");
    } else {
      System.out.print("El numero 2 no aparece");
    }
    System.out.println("");

    if (contador[3] != 0) {
      System.out.print("El numero 3 aparece " + contador[3] + " veces.");
    } else {
      System.out.print("El numero 3 no aparece");
    }
    System.out.println("");

    if (contador[4] != 0) {
      System.out.print("El numero 4 aparece " + contador[4] + " veces.");
    } else {
      System.out.print("El numero 4 no aparece");
    }
    System.out.println("");

    if (contador[5] != 0) {
      System.out.print("El numero 5 aparece " + contador[5] + " veces.");
    } else {
      System.out.print("El numero 5 no aparece");
    }
    System.out.println("");

    if (contador[6] != 0) {
      System.out.print("El numero 6 aparece " + contador[6] + " veces.");
    } else {
      System.out.print("El numero 6 no aparece");
    }
    System.out.println("");

    if (contador[7] != 0) {
      System.out.print("El numero 7 aparece " + contador[7] + " veces.");
    } else {
      System.out.print("El numero 7 no aparece");
    }
    System.out.println("");

    if (contador[8] != 0) {
      System.out.print("El numero 8 aparece " + contador[8] + " veces.");
    } else {
      System.out.print("El numero 8 no aparece");
    }
    System.out.println("");

    if (contador[9] != 0) {
      System.out.print("El numero 9 aparece " + contador[9] + " veces.");
    } else {
      System.out.print("El numero 9 no aparece");
    }
    System.out.println("");

    if (contador[10] != 0) {
      System.out.print("El numero 10 aparece " + contador[10] + " veces.");
    } else {
      System.out.print("El numero 10 no aparece");
    }
    System.out.println("");

  }
  
}