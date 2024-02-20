
package App_Fitnes;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        
        
        int c=0;
        Dietas dietas = new Dietas();
        Rutinas rutinas = new Rutinas();
        Estiramientos estirar = new Estiramientos();
        Calentamientos calentar = new Calentamientos();
        int numero=0;
        
        String nombre;
        String apellido;
        int edad;
        int peso;
        double estatura;
        String sexo;
        
        System.out.println("\nHola, Bienvenido(a) a nuestra aplicacion fitnes,"
        + " por favor sea tan amable de diligenciar los datos que le pediermos a continuacion:\n");
        
        System.out.print("Digite su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Digite su apellido: ");
        apellido= entrada.nextLine();
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
        
        if (edad<12) {
        System.out.print("\nQuerido usuario, su edad no aplica para realizar nuestras dietas y rutinas de ejercicio, vuelva cuando cumpla con la edad minima requerida, es decir [12 años]");
        
            while (edad<12) {
            System.out.println("\n");
            System. exit(0);
                
             
            }
        
           
        }
        
        
        System.out.print("Digite su peso: ");
        peso = entrada.nextInt();
        System.out.print("Digite su estatura: ");
        estatura = entrada.nextFloat();
        System.out.print("Digite su sexo (Masculino/Femenino):");
        sexo=entrada.next();
        
        if (sexo.equalsIgnoreCase("Femenino") ||sexo.equalsIgnoreCase("femenino")) {
            
               System.out.println("\nQuerida usuaria, su sexo no aplica para realizar nuestras dietas y rutinas,"
                    + "ya que la aplicacion fue diseñada solamente para personas de sexo masulino");
               
            System.out.println("\n");
            System. exit(0);
            
        }
       
         
        System.out.println("                ");
        System.out.println("                ");
        
        System.out.println("Querido usuario que desea realizar");
        System.out.println("\n\t MENU ");
        System.out.println("1. Ejercicios\n2.Dietas");
        System.out.print("\nDigite la opcion:");
        c=entrada.nextInt();
        System.out.println("              ");
        System.out.println("              ");
        
        dietas.setApellido(apellido);
        dietas.setEdad(edad);
        dietas.setEstatura(estatura);
        dietas.setNombre(nombre);
        dietas.setPeso(peso);
       
        
        rutinas.setApellido(apellido);
        rutinas.setEdad(edad);
        rutinas.setEstatura(estatura);
        rutinas.setNombre(nombre);
        rutinas.setPeso(peso);
        
        if(c==1){
            
            int x=0;
            System.out.println("Gracias por elegir Ejercicios");
            System.out.println("Ahora, que tipo de ejercicios quiere realizar");
            System.out.println("\n\t MENU ");
            System.out.println("1. Ejercicios para adelgazar\n2. Ejercicios para ganar definir musculo\n3. Ejercicios para ganar musculo\n4. Ejercicios para mantener musculo");
            System.out.print("\nDigite la opcion:");
            x=entrada.nextInt();
         
            switch (x){
                
                case 1:
                    
                    estirar.descripcion();
                    calentar.descripcion();
                    estirar.Estiramientos();
                    calentar.Calentamientos();
                    rutinas.descripcion();
                    rutinas.Rutinas_Para_Adelgazar();
                    break;
                    
                     case 2:
                         
                    estirar.descripcion();
                    calentar.descripcion();
                    estirar.Estiramientos();
                    calentar.Calentamientos();
                    rutinas.descripcion();
                    rutinas.Rutinas_Para_Definir_Musculo();
                    break;
                    
                     case 3:
                         
                    estirar.descripcion();
                    calentar.descripcion();
                    estirar.Estiramientos();
                    calentar.Calentamientos();
                    rutinas.descripcion();
                    rutinas.Rutinas_Para_Ganar_Musculo();
                    break;
                    
                     case 4:
                    
                    estirar.descripcion();
                    calentar.descripcion();
                    estirar.Estiramientos();
                    calentar.Calentamientos();
                    rutinas.descripcion();
                    rutinas.Rutinas_Para_Mantener_Musculo();
                    break;
                    
                     default:
                         break;
            }
    
}
        if(c==2){
           
            int x=0;
            System.out.println("Gracias por elegir Dietas");
            System.out.println("           ");
            System.out.println("Ahora que tipo de Dietas quiere realizar");
            System.out.println("\n\t MENU ");
            System.out.println("1. Dieta para adelgazar\n 2. Dieta para ganar masa muscular\n 3. Dietas para ganar peso\n 4. Dietas para mantener peso");
            System.out.print("\nDigite la opcion:");
            x=entrada.nextInt();
          
          
         switch (x){
             
            case 1:
            dietas.descripcion();
            dietas.Dietas_Bajar_PesoM();
            break;  
            
            case 2: 
            dietas.descripcion();
            dietas.Dietas_Ganar_Masa_MuscularM();
            break;
            
            case 3: 
              dietas.descripcion();
              dietas.Dietas_Ganar_PesoM();
              break;

            case 4:
            dietas.descripcion();
            dietas.Dietas_Mantener_Masa_MuscularM();
            break;



         }
}
    }
}
   
    