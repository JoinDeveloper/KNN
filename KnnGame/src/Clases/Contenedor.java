package Clases;
/**
 *
 * @author Daniel Xicohténcatl Ocotitla
 */
public class Contenedor implements Comparable<Contenedor>{
  private String clase;
  private double distancia;

  public String getClase() {
    return clase;
  }//end getClase

  public void setClase(String clase) {
    this.clase = clase;
  }//end setClase

  public double getDistancia() {
    return distancia;
  }//end getDistancia

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }//end setDistancia
  
  @Override
  public String toString(){
   return ("Nombre: "+clase+" Cantidad: "+distancia);
  }//end toString 
  
  @Override
  public int compareTo(Contenedor c){
    String a=new String(String.valueOf(this.getDistancia())+this.getClase());
    String b=new String(String.valueOf(c.getDistancia())+c.getClase());
    return a.compareTo(b);
  }//end compareTo
}//end class Contenedor
