/*
Desarrollar un proyecto con los componentes dados de Clase, Herencia, Polimorfismo,
hasta interfaz comentarlo, utilicen un problema que involucre figuras geométricas.
*/
package taller6;

public class Triangulo {
  
    protected double hipotenusa;
    protected double catetoAdy;
    protected double catetoOpu;
    protected double raizcuadrada;
    
    public void perimetro(double perimetro){
        perimetro+=hipotenusa+catetoAdy+catetoOpu;
        System.out.println(perimetro);
    }
    
    public void area(double area, double altura){
        
     altura+=catetoOpu*catetoOpu-catetoAdy*catetoAdy;
     raizcuadrada=Math.sqrt(altura);
     area=catetoOpu*altura;
     System.out.println(area);
    
    }
}
