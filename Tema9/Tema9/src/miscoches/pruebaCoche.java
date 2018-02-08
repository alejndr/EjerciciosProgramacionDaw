package miscoches;

public class pruebaCoche {
  public static void main(String[] args) {
    Coche coche1 = new Coche("VW", "jaja");
    Coche coche2 = new Coche("VW", "jaja");
    
    coche1.recorre(20);
    coche1.recorre(25);
    coche2.recorre(20);
    
    System.out.println(coche1);
    System.out.println(coche2);
    
    System.out.println("El kilometraje total de todos los coches creados es: " + Coche.getKilometrajeTotal());
   
  }
}
