
package taller6;

public class Cuadrado {
   
   protected double lado; 
   
   
   public void perimetro(double perimetro){
      perimetro= lado*4;
       System.out.println(perimetro);
   }
   
   public void area(double area){
       area= lado*lado;
   }
   
}
