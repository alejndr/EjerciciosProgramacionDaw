/*
 * 
 * 
 * @author Alejandro MV
 */
import java.util.Scanner;
import matematicas.manejonumeros;

public class T8Ej1a14 {
  public static void main(String[] args) {
  int numero = 0;
  int numero2 = 0;
  int numero3 = 0;
  Scanner s = new Scanner(System.in);
  // esCapicua ///////////////////////////////////////////////////
    
    System.out.println("Introduce un numero para averiguar si es capicua");
    numero = s.nextInt();
  
    if (matematicas.manejonumeros.esCapicua(numero)) {
      System.out.println("El "+numero+" es capicúa");
    } else {
      System.out.println("El "+numero+" no es capicúa");
    }
    
  // voltea //////////////////////////////////////////////////////
  
  System.out.println("Introduce un numero para darle la vuelta");
  numero = s.nextInt();
  System.out.println("El "+numero+" volteado es " + manejonumeros.voltea(numero));
  
  // esPrimo /////////////////////////////////////////////////////
     
    System.out.println("Introduce un numero para saber si es primo");
    numero = s.nextInt();
  
    if (matematicas.manejonumeros.esPrimo(numero)) {
      System.out.println("El "+numero+" es primo");
    } else {
      System.out.println("El "+numero+" no es primo");
    }
  
  // siguientePrimo //////////////////////////////////////////////

    System.out.println("El siguiente primo mayor a 23 es " + matematicas.manejonumeros.siguientePrimo(23));
    System.out.println("El siguiente primo mayor a 100 es " + matematicas.manejonumeros.siguientePrimo(100));
   
  // potencia ////////////////////////////////////////////////////
  
    System.out.println("Introduce un numero para calcular una potencia");
    numero = s.nextInt();
    System.out.println("Introduce una potencia");
    numero2 = s.nextInt();

    System.out.println(numero+"^"+numero2+" = " + matematicas.manejonumeros.potencia(numero, numero2));
  
  // digitos /////////////////////////////////////////////////////
    System.out.println("Introduce un numero para saber sus digitos");
    numero = s.nextInt();
  
    System.out.println("El número "+numero+" tiene " + matematicas.manejonumeros.digitos(numero) + " dígito/s.");
   
   // digitoN /////////////////////////////////////////////////////
    System.out.println("Introduce un numero para encontrar la posición de uno de sus digitos");
    numero = s.nextInt();
    System.out.println("Introduce la posicion en la que quieras saber que digito hay");
    numero2 = s.nextInt();
    System.out.println("En la posición "+numero2+" del "+numero+" está el " + matematicas.manejonumeros.digitoN(numero, numero2));
    
    // posicionDeDigito ////////////////////////////////////////////
    System.out.println("Introduce un numero para encontrar la posición de uno de sus digitos");
    numero = s.nextInt();
    System.out.println("Introduce el digito del que quieras saber la posición");
    numero2 = s.nextInt();
    System.out.println("En el "+numero+", el dígito "+numero2+" está en la posición " + matematicas.manejonumeros.posicionDeDigito(numero, numero2));
    
    // quitaPorDetras //////////////////////////////////////////////
    System.out.println("Introduce un numero para quitarle digitos por detras");
    numero = s.nextInt();
    System.out.println("Introduce cuantos digitos quieres quitarle");
    numero2 = s.nextInt();
    System.out.println("Si al "+numero+" se le quitan por detrás "+numero2+" dígitos, se queda como " + matematicas.manejonumeros.quitaPorDetras(numero, numero2));
    
    // quitaPorDelante /////////////////////////////////////////////
    System.out.println("Introduce un numero para quitarle digitos por delante");
    numero = s.nextInt();
    System.out.println("Introduce cuantos digitos quieres quitarle");
    numero2 = s.nextInt();
    System.out.println("Si al "+numero+" se le quitan por delante "+numero2+" dígitos, se queda como " + matematicas.manejonumeros.quitaPorDelante(numero, numero2));
    
    // pegaPorDetras ///////////////////////////////////////////////
    System.out.println("Introduce un numero para pegarle digitos por detras");
    numero = s.nextInt();
    System.out.println("Introduce que digitos quieres pegarle");
    numero2 = s.nextInt();
    System.out.println("Si al "+numero+" se le pega por detrás el "+numero2+" da el " + matematicas.manejonumeros.pegaPorDetras(numero, numero2));
    
    // pegaPorDelante //////////////////////////////////////////////
    System.out.println("Introduce un numero para pegarle digitos por delante");
    numero = s.nextInt();
    System.out.println("Introduce que digitos quieres pegarle");
    numero2 = s.nextInt();
    System.out.println("Si al "+numero+" se le pega por delate el "+numero2+" da el " + matematicas.manejonumeros.pegaPorDelante(numero, numero2));
    
    // trozoDeNumero ///////////////////////////////////////////////
    System.out.println("Introduce un numero para cortarle un trozo");
    numero = s.nextInt();
    System.out.println("Introduce la posicion por la que empezar a cortar");
    numero2 = s.nextInt();
    System.out.println("Introduce la posicion por la que terminar de cortar");
    numero3 = s.nextInt();
    System.out.println("Al "+numero+" le cojo el trozo que va de la posición "+numero2+" a la "+numero3+": " + matematicas.manejonumeros.trozoDeNumero(numero, numero2, numero3));
    
    // juntaNumeros ////////////////////////////////////////////////
    System.out.println("Introduce un numero para pegarle otro");
    numero = s.nextInt();
    System.out.println("Introduce el numero para pegarle");
    numero2 = s.nextInt();
    System.out.println("Juntando el "+numero+" y el "+numero2+" da el " + matematicas.manejonumeros.juntaNumeros(numero, numero2));
  }
}