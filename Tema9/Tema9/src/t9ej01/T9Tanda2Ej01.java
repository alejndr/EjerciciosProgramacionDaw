/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9ej01;

/**
 *
 * @author alejandro
 */
public class T9Tanda2Ej01 {
  public static void main(String[] args) {
    Caballo rocinante = new Caballo("Rocinante");
    Caballo bucefalo = new Caballo("Bucefalo");
    Persona pepe = new Persona("Pepe", "Manchego", 64);
    Caballo flora = new Caballo("Flora");
    
    bucefalo.setSexo("macho");
    flora.setSexo("hembra");
    rocinante.setSexo("macho");
    
    // metodo crear nuevos objetos
    Caballo cria2 = bucefalo.seApareaCon(rocinante, "nose", "seno");
    Caballo cria1 = flora.seApareaCon(rocinante, "haya", "goro");
    
    System.out.println(cria1);
    System.out.println(cria2);
    
    rocinante.setColor("blanco");
    rocinante.setJinete(pepe);
    
	   System.out.println(pepe);
     pepe.espolea("agresivamente");
     System.out.println(rocinante);
     
     rocinante.galopa();
  
  }
}
