/*
 * Igancio Alejandro de la Maza villalba, 14 de noviembre de 2017, turno 1
 * 
 * Realiza un programa que lea 10 números por teclado y que muestre la media de los números primos
 * introducidos. Los números que no son primos se ignoran. Si el usuario no ha introducido ningún
 * número primo, se mostrará el mensaje: “No ha introducido ningún número primo, no puedo calcular la
 * media”.
 * 
 * @author Alejandro MV
 */



public class Ex13iamv2 {
  public static void main(String[] args) {
  System.out.println("Introduce diez números y te mostrare la media de los que sean primos.");
  System.out.println("Por favor, introduzca diez números enteros positivos:");
  boolean primo = true;
  double contador = 0;
  double divi = 1;
  double media = 0;
  double numero = 0;
  
  while (contador < 10) {
  primo = true;
  numero = Integer.parseInt( System.console().readLine() );
  
    for (int i = 2;i < numero;i++) {
    if ((numero%i) == 0) {
      primo = false;
    }
    
    }

    if (primo) {
    media = media + numero;
    
    divi ++;  
    }

  contador++;
  }
  
  double printMedia = (media/(divi-1));
  
  if (media == 0) {
    
    System.out.print("No ha introducido ningún número primo, no puedo calcular la media");
  } else {
    
    System.out.printf("La media de los primos es: %.1f", printMedia);
  }
  
  
  
  
  }
  
}
