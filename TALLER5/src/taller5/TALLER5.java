/*
Hacer un algoritmo que llene una matriz de 7 * 7. Calcular la suma de cada renglón y 
almacenarla en un vector, la suma de cada columna y almacenarla en otro vector.

*/

package taller5;

import java.util.Scanner;

public class TALLER5 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    
      int matriz[][] = new int[7][7];
      int sumaFila;
      int sumaColumna;
      
        System.out.println("\nDigite su matriz\n");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt();
            }
            
        }
        
        System.out.println("\nSuma de las filas y las columnas:\n");
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            int sumaFilas=0;
            for (int j = 0; j < matriz.length; j++) {
            sumaFilas+=matriz[i][j];   
                
            }
            System.out.println("La suma de las filas es:["+i+"]:"+sumaFilas);
        }
        System.out.println("");
        
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumnas=0;
            for (int i = 0; i < matriz.length; i++) {
            sumaColumnas+=matriz[i][j];   
             
            
            }
    
            System.out.println("La suma de las columnas es:["+j+"]:"+sumaColumnas); 
        }
        System.out.println("");
      
    }
    
}
