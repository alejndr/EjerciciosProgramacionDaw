/**
*  El tiempo
*
*  @author Luis José Sánchez
**/

public class NumAleatorioTiempo {
  public static void main(String[] args) {

    System.out.println("Pronostico del tiempo");
    
    int temperatura = (int)(Math.random()*21 + 5);
    boolean llovera = (int)(Math.random()*2) == 0;
    
    System.out.println("Mañana hara: " + temperatura + "º");
    
    if (llovera) {
    System.out.println("Y se espera lluvia ");
      
    } else {
      System.out.println("Y no se espera lluvia ");
      }
    
    
  }
}
