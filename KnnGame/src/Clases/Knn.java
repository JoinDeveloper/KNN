package Clases;
import java.util.ArrayList;
/**
 *
 * @author Daniel Xicohténcatl Ocotitla
 */
public class Knn {
  public void ordenar(ArrayList<Contenedor> arreglo,ArrayList<Contenedor>arregloOrdenado){
    int puntoDeParo = arreglo.size();
    for(int i = 0 ; i < puntoDeParo ; i++){
      Contenedor temp1 = new Contenedor();
      temp1 = menor(arreglo);
      arregloOrdenado.add(temp1);
      arreglo.remove(temp1);
    }//end fro
  }//end Ordenar 
    
  private Contenedor menor(ArrayList<Contenedor> arreglo){
    Contenedor temp = new Contenedor();
    temp.setClase("");
    temp.setDistancia(100.0);
    for(int i = 0 ; i < arreglo.size() ; i++){
      if(arreglo.get(i).getDistancia() < temp.getDistancia()){
        temp = arreglo.get(i);
      }//end  if
    }//end for
    return temp;
  }//end menor
}//end class Knn
