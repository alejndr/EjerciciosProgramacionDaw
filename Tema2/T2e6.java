/* Ejercicio 6
 * @author Alejandro MV
 * 
 */


public class T2e6 {
	
	public static void main (String[] args) {
		
    float euro = 15;
    int cantidad = 12;
    double precio = 1.23;
    
    double calculo = (cantidad * precio);
    
    
    System.out.println("                 ---Sandias SA---" );
    System.out.printf("Cantidad: %-6d Concepto: %-10s Precio: %.2f€\n", cantidad, "Sandias", precio);
    System.out.println("--------------------------------------------------");
    System.out.printf("Total sin IVA: %.2f €", calculo );
    
    
    
	}
}

