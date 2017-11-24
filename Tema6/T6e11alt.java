/*
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * 
 * @author Alejandro MV
 */



public class T6e11alt {
  public static void main(String[] args) {
  System.out.println("Este programa va a generar 20 notas escolares al azar y nos va a contar cuantas hay de cada tipo: ");
  System.out.println("");
  
  int generadorNotas = 0;
  String nota = "";
  int contadorSuspenso = 0;
  int contadorSuficiente = 0;
  int contadorBien = 0;
  int contadorNotable = 0;
  int contadorSobresaliente = 0;
  
  
  for (int i = 0;i < 21;i++) {
    
    generadorNotas = (int)(Math.random()*5+1);
    switch (generadorNotas) {
      case 1:
      nota = "Suspenso";
      contadorSuspenso++;
        break;
      case 2:
      nota = "Suficiente";
      contadorSuficiente++;
        break;
      case 3:
      nota = "Bien";
      contadorBien++;
        break;
      case 4:
      nota = "Notable";
      contadorNotable++;
        break;
      case 5:
      nota = "Sobresaliente";
      contadorSobresaliente++;
        break;

      default:
    }
  System.out.println(nota);
  
  }
  /*Contadores*/
  System.out.println("");
  System.out.println("Numero de suspensos: " + contadorSuspenso );
  System.out.println("Numero de suficientes: " + contadorSuficiente);
  System.out.println("Numero de bienes: " + contadorBien);
  System.out.println("Numero de notables: " + contadorNotable);
  System.out.println("Numero de sobresalientes: " + contadorSobresaliente);
  
  }
  
}