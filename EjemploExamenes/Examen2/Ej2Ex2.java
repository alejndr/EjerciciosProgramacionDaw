/*
 * Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas
 * máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos
 * absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté soleado o
 * nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima deberá
 * ser menor o igual que la temperatura máxima.
 * 
 * @author Alejandro MV
 */


public class Ej2Ex2 {
  public static void main(String[] args) {
    
    int primaveraMinima = (int)(Math.random()*15+15);
    int primaveraMaxima = (int)(Math.random()*15+15);
    while (primaveraMaxima < primaveraMinima) {
      primaveraMaxima = (int)(Math.random()*15+15);
    }
    int cielo = (int)(Math.random()*10);

    int veranoMinima = (int)(Math.random()*20+25);
    int veranoMaxima = (int)(Math.random()*20+25);
    while (veranoMaxima < veranoMinima) {
      veranoMaxima = (int)(Math.random()*15+15);
    }

    int otoñoMinima = (int)(Math.random()*10+20);
    int otoñoMaxima = (int)(Math.random()*10+20);
    while (otoñoMaxima < otoñoMinima) {
      otoñoMaxima = (int)(Math.random()*15+15);
    }

    int inviernoMinima = (int)(Math.random()*25);
    int inviernoMaxima = (int)(Math.random()*25);
    while (inviernoMaxima < inviernoMinima) {
      inviernoMaxima = (int)(Math.random()*15+15);
    }

    int estacion = 0;
    int tempmin = 0;
    int tempmax = 0;
    String nubes = "";

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.println("Seleccione la estación del año(1-4): ");
    estacion = Integer.parseInt( System.console().readLine() );

    switch (estacion) {
      case 1:
      tempmin = primaveraMinima;
      tempmax = primaveraMaxima;
        if (cielo < 6) {
          nubes = "Nublado";
        } else {
          nubes = "Soleado";
        }

        break;
      case 2:
      tempmin = veranoMinima;
      tempmax = veranoMaxima;
      if (cielo < 8) {
        nubes = "Nublado";
      } else {
        nubes = "Soleado";
      }
        break;
      case 3:
      tempmin = otoñoMinima;
      tempmax = otoñoMaxima;
      if (cielo > 6) {
        nubes = "Nublado";
      } else {
        nubes = "Soleado";
      }
        break;
      case 4:
      tempmin = inviernoMinima;
      tempmax = inviernoMaxima;
      if (cielo > 8) {
        nubes = "Nublado";
      } else {
        nubes = "Soleado";
      }
        break;
      default:
    }

    System.out.println("Previsión del tiempo para mañana: ");
    System.out.println("----------------------------------");
    System.out.println("Temperatura mínima: " + tempmin);
    System.out.println("Temperatura máxima: " + tempmax);
    System.out.println(nubes);



  }
  
}