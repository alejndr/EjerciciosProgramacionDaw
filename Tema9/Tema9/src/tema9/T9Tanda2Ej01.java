/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author alejandro
 */
public class T9Tanda2Ej01 {
  public static void main(String[] args) {
    Caballo rocinante = new Caballo("Rocinante");
    Persona pepe = new Persona("Pepe", "Manchego", 64);
    
    
    rocinante.setColor("blanco");
    rocinante.setJinete(pepe);
    
	   System.out.println(pepe);
     pepe.espolea("cariñosamente");
     System.out.println(rocinante);
  
  }
}
