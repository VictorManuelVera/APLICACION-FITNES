/*
 Almacenar 500 números en un vector, elevar al cuadrado cada valor almacenado en el 
valor, almacenar el resultado en otro vector. Imprimir el vector original y el vector 
resultante
*/

package taller4;


public class Taller4 {

   
    public static void main(String[] args) {
        
      int numero [] = new int[500];
      
      
        System.out.println("\nImprimiendo vector:\n");
        
        for (int i = 0; i < 1; i++) {
            
       numero[i]=0;
        
        while(numero[i]<=500){
            System.out.println(numero[i]++);   
            
            }
        }
        
        System.out.println("\nVector elevado al cuadrado:\n");
        
        for (int i = 0; i < 1; i++) {
            
       numero[i]=0;
        
        while(numero[i]<=500){
            System.out.println(numero[i]*numero[i]++);   
            
            }
        }
        
        
    }
    
}
