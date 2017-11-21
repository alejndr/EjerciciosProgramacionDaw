/**
* Realiza un programa que pinte por pantalla diez líneas formadas por carac-
* teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
* entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
* aleatoria entre 1 y 40 caracteres.
*
*  @author Alejandro MV
**/

public class T6e10 {
  public static void main(String[] args) {
    
  String relleno = "";
  int eleccionDeCaracter = 0;
  int numeroDeCaracteres = 0;
    
    for (int i = 1;i < 11; i++) {
      /*Generador de caracteres aleatorios*/
      eleccionDeCaracter = (int)(Math.random()*6+1);
      
      switch (eleccionDeCaracter) {
      case 1:
        relleno = "*";
        break;
      case 2:
        relleno = "-";
        break;
      case 3:
        relleno = "=";
        break;
      case 4:
        relleno = ".";
        break;
      case 5:
        relleno = "|";
        break;
      case 6:
        relleno = "@";
        break;

      default:
        
      }
      
      
      /*Cuenta en que linea estamos*/
      System.out.print("linea nº " + i + ": ");
      
      
      /*Pintar lineas*/
      numeroDeCaracteres = (int)(Math.random()*39+2);
      
      for (int b = 1;b < numeroDeCaracteres; b++){
      System.out.print(relleno);
      
      /*Salto de linea*/
      if (b == (numeroDeCaracteres-1)) {
      System.out.println("");
      }
      }
    }
  }
}

