
package javaapplication26;

import java.util.Scanner;


public class JavaApplication26 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner (System.in);
            //Organizar los numeros de un arreglo de menor a mayor
            int numero;
            System.out.print("\nDigite el tamaño del arreglo:");
            numero=entrada.nextInt();
            System.out.println("");
    int numeros []= new int [numero];
    System.out.println("Introduzca los elementos del arreglo\n");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("el elemento "+i+" es:");
        numeros [i]=entrada.nextInt();
        
    }
    System.out.println("\nLos elementos del arreglo organizados de menor a mayor son:\n");
    for (int i = 0; i < numeros.length-1; i++) {
        for (int j = 0; j < numeros.length-1; j++) {
            if (numeros [j]>numeros [j+1]) {
                int aux;
                aux= numeros [j];
              numeros [j]=numeros [j+1]; 
              numeros [j+1]= aux;
            }
        }}
        for (int j = 0; j < numeros.length; j++) {
        System.out.println(numeros [j]);}        
        
    
    System.out.println("\nLos elementos del arreglo organizados de mayor a menor son:\n");
    for (int i = numeros.length-1; i >=0; i--) {
        System.out.println(numeros [i]);
    }
            System.out.println("");
        }
    
}