/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
 *
 * @author Alejandro mv
 */

public class T4e12 {
  public static void main(String[] args) {   
    
    
    
    System.out.println("Cuestionario del curso DAW 17/18: ");
    System.out.println("Programación: En salida formateada, que usamos para representar números enteros?");
    System.out.println("A)%d  B)%ñ  C)%98765.76f");
    String preg1 = (System.console().readLine().toLowerCase());
    
    System.out.println("Sistemas: Traduce 1001 a decimal");
    System.out.println("A)21  B)9  C)1001");
    String preg2 = (System.console().readLine().toLowerCase());
    
    System.out.println("Lenguaje de marcas: ¿Que hace la etiqueta <br>?");
    System.out.println("A)Hace que el texto brille en la oscuridad  B)Colorea el texto  C)Salto de linea");
    String preg3 = (System.console().readLine().toLowerCase());
    
    System.out.println("Sistemas: Traduce 1111 a decimal");
    System.out.println("A)15  B)9  C)1111");
    String preg4 = (System.console().readLine().toLowerCase());
    
    System.out.println("General: A que hora se sale de clase?");
    System.out.println("A)Segun el profesor  B)14:00  C)14:30");
    String preg5 = (System.console().readLine().toLowerCase());
    
    System.out.println("Programación: Como se declara en Java que un numero tiene decimales?");
    System.out.println("A)Con float  B)Con double  C)Las dos respuestas son correctas");
    String preg6 = (System.console().readLine().toLowerCase());
    
    System.out.println("Sistemas: Cual es la pass para matricularse en la asignatura?");
    System.out.println("A)anakin  B)darthvader  C)gollum");
    String preg7 = (System.console().readLine().toLowerCase());
    
    System.out.println("Bases de datos: Que es una entidad?");
    System.out.println("A)Un fantasma  B)Un programa  C)Una tabla");
    String preg8 = (System.console().readLine().toLowerCase());
    
    System.out.println("Lenguaje de marcas: Que hace la etiqueta <strong>?");
    System.out.println("A)Hace mas fuerte el html  B)Pone el texto en negrita  C)X q kieres saber eso jaja salu2");
    String preg9 = (System.console().readLine().toLowerCase());
    
    System.out.println("Programación: Que es un string?");
    System.out.println("A)Una cadena de texto  B)Un tipo de archivo  C)yoquese dehame ya vieo");
    String preg10 = (System.console().readLine().toLowerCase());
  
  int resultado = 0;  
  
  if("a".equals(preg1)){
   resultado ++;
  } 
  if("b".equals(preg2)){
   resultado ++;
  } 
  if("c".equals(preg3)){
   resultado ++;
  } 
  if("a".equals(preg4)){
   resultado ++;
  } 
  if("a".equals(preg5)){
   resultado ++;
  } 
  if("c".equals(preg6)){
   resultado ++;
  } 
  if("b".equals(preg7)){
   resultado ++;
  } 
  if("c".equals(preg8)){
   resultado ++;
  } 
  if("b".equals(preg9)){
   resultado ++;
  } 
  if("a".equals(preg10)){
   resultado ++;
  } 


 if (resultado < 5) {
    System.out.println("Tu calificación es insuficiente");
    } else {
        if (resultado == 5) {
        System.out.println("Tu calificación es suficiente");
    }     else {
            if (resultado == 6) {
            System.out.println("Tu calificación es bien");
    }         else {
                if (resultado == 7 || resultado == 9 || resultado == 8 ) {
                System.out.println("Tu calificación es notable");
    }             else { 
                    if (resultado == 10) {
                      System.out.println("Tu calificación es sobresaliente");


  }
}
}
}
}
}
}
