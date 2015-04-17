package Clases;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Daniel Xicohténcatl Ocotitla
 */
public class ManejadorMatriz {
  private double SOLEADO = 1.0;
  private double NUBLADO  = 2.0;
  private double LLUVIOSO = 3.0;
  private double CALUROSO = 1.0;
  private double TEMPLADO = 2.0;
  private double FRESCO = 3.0;
  private double ALTO = 1.0;
  private double NORMAL = 2.0;
  private double FALSO = 1.0;
  private double VERDADERO = 2.0;

  public void cargaMatrizDesdeArchivo(String rutaArchivo, double panorama, double temperatura, double humedad, double viento, ArrayList<Contenedor> arreglo) throws IOException {
    double primerDato = 0.0;
    double segundoDato = 0.0;
    double tercerDato = 0.0;
    double cuartoDato = 0.0;
    
    String linea = "";
    BufferedReader in = new BufferedReader(new FileReader(rutaArchivo));
    while (((linea = in.readLine()) != null)) {
      String[] partes = linea.split("#");
      
      Contenedor contenedor = new Contenedor();
      contenedor.setClase(partes[4]);
      
      if(partes[0].equals("SOLEADO")){
        primerDato = SOLEADO;
      }//end if
      else{
        if(partes[0].equals("NUBLADO")){
          primerDato = NUBLADO;
        }//end if
        else{
          primerDato = LLUVIOSO;
        }//end else
      }//end else
      
      if(partes[0].equals("CALUROSO")){
        segundoDato = CALUROSO;
      }//end id
      else{
        if(partes[0].equals("TEMPLADO")){
          segundoDato = TEMPLADO;
        }//end if
        else{
          segundoDato = FRESCO;
        }//end else
      }//end else
      
      if(partes[2].equals("ALTO")){
        tercerDato = ALTO;
      }//end if
      else{
        tercerDato = NORMAL;
      }//end else
      
      if(partes[3].equals("FALSO")){
        cuartoDato = FALSO;
      }//end if
      else{
        cuartoDato = VERDADERO;
      }//end else
      
      double distancia = Math.sqrt((Math.pow((panorama-primerDato),2))+(Math.pow((temperatura-segundoDato), 2))+(Math.pow((humedad-tercerDato), 2))+(Math.pow((viento-cuartoDato), 2)));
      System.out.println(panorama+" - "+primerDato+" + "+temperatura+" - "+segundoDato+" + "+humedad+" - "+tercerDato +" + "+viento+" - "+cuartoDato+" = "+distancia);
      //System.out.println("Edad:"+edad+"  Presc"+prescripcion+"  Astigma"+astigmatismo+"  Lagrima"+lagrimas);
      contenedor.setDistancia(distancia);
      arreglo.add(contenedor);
    }//end of while
  }//end of cargaMatrizDesdeArchivo
}//end class ManejadorMatriz