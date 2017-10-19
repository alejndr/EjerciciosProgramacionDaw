/**
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 *
 * @author Alejandro mv
 */

public class T4e13 {
  public static void main(String[] args) {   
    
   
    System.out.println("Ordenador de números de mayor a menor");
    System.out.print("Dime un número entero: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Dime un segundo número entero: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Dime un tercer número entero: ");
    int c = Integer.parseInt(System.console().readLine());
    
    
    
    if (a > b && b < c) {
    System.out.println("Tus numero ordenados: " + a + ", " + b + ", " + c);} 
    else if (a > c && c < b) {
    System.out.println("Tus numero ordenados: " + a + ", " + c + ", " + b);} 
    else if (b > a && a < c) {
    System.out.println("Tus numero ordenados: " + b + ", " + a + ", " + c);}
    else if (b > c && c < a) {
    System.out.println("Tus numero ordenados: " + b + ", " + c + ", " + a);}
    else if (c > a && a < b) {
    System.out.println("Tus numero ordenados: " + c + ", " + a + ", " + b);}
    else if (c > b && b < a) {
    System.out.println("Tus numero ordenados: " + c + ", " + b + ", " + a);}
  }
}






