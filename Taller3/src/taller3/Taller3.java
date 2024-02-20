/*
Desarrolle un algoritmo que permita determinar a partir de un número de días, ingresado 
por pantalla, ¿Cuántos años, meses, semanas y días?; constituyen el número de días 
proporcionado utilizando la estructura Mientras 
*/

package taller3;

import java.util.Scanner;

public class Taller3 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int año=0,mes=0,semana=0,dia=0;
        
        System.out.print("Digite el año:");
        año = entrada.nextInt();
        
        System.out.print("Digite el mes:");
        mes = entrada.nextInt();
        
        while(mes<1 || mes>12){
            System.out.print("Mes incorrecto, por favor digitelo nuevamente:");
          mes = entrada.nextInt();  
        }
        
         System.out.print("Digite la semana:");
         semana = entrada.nextInt();
        
         while(semana<1 || semana>5){
            System.out.print("Semana incorrecta, por favor digitela nuevamente:");
            semana = entrada.nextInt();  
        }
         
        System.out.print("Digite el dia:");
        dia = entrada.nextInt();
        
        while(dia<1 || dia>31){
            System.out.print("Dia incorrecto, por favor digitelo nuevamente:");
          dia = entrada.nextInt();  
        }
        
        switch (mes){
            
            case 1:
                System.out.println("La fecha es: "+año+ " del mes de enero, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 2:
                System.out.println("La fecha es: "+año+ " del mes de febrero, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 3:
                System.out.println("La fecha es: "+año+ " del mes de marzo, "
                        + "de la semana "+semana+" del dia"+dia);
                break;
                
                  case 4:
                System.out.println("La fecha es: "+año+ " del mes de abril, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 5:
                System.out.println("La fecha es: "+año+ " del mes de mayo, "
                        + "de la semana "+semana+" del dia"+dia);
                break;
                
                  case 6:
                System.out.println("La fecha es: "+año+ " del mes de junio, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 7:
                System.out.println("La fecha es: "+año+ " del mes de julio, "
                        + "de la semana "+semana+" del dia"+dia);
                break;
                
                  case 8:
                System.out.println("La fecha es: "+año+ " del mes de agosto, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 9:
                System.out.println("La fecha es: "+año+ " del mes de septiembre, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 10:
                System.out.println("La fecha es: "+año+ " del mes de octubre, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 11:
                System.out.println("La fecha es: "+año+ " del mes de noviembre, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
                
                  case 12:
                System.out.println("La fecha es: "+año+ " del mes de diciembre, "
                        + "de la semana "+semana+" del dia "+dia);
                break;
        }
    
    }
    
}