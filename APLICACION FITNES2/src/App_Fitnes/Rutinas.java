
package App_Fitnes;


public class Rutinas extends Registro implements Descripcion {

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
   public void Rutinas_Para_Ganar_Musculo(){
       
       System.out.println("\nLa siguiente rutina te ayudara a ganar masa muscular:\n");
       
       System.out.println("- Realiza ejercicios de fuerza como levantamiento de pesas o entrenamiento con m�quinas.\n" +
"- Haz de 8 a 12 repeticiones por serie con un peso que te desaf�e.\n" +
"- Descansa entre series y aseg�rate de tener una buena t�cnica.\n");
       
    }
   
    public void Rutinas_Para_Definir_Musculo(){
    
        System.out.println("\nLa siguiente rutina te ayudara a definir el musculo:\n");
        
        System.out.println("- Incorpora ejercicios de resistencia como entrenamiento con pesas o ejercicios de peso corporal.\n" +
"- Realiza de 12 a 15 repeticiones por serie con un peso moderado.\n" +
"- Agrega ejercicios cardiovasculares para quemar grasa y resaltar los m�sculos.\n");
        
    }
      
     public void Rutinas_Para_Mantener_Musculo(){
    
         System.out.println("\nLa siguiente rutina te ayudara a mantener el mismo nivel de masa muscular:\n");
         
         System.out.println("- Contin�a realizando ejercicios de fuerza regularmente.\n" +
"- Mant�n un equilibrio entre el entrenamiento de fuerza y el cardio.\n" +
"- Aseg�rate de consumir suficiente prote�na para mantener la masa muscular.\n");
         
    }
     
      public void Rutinas_Para_Adelgazar(){
    
          System.out.println("\nLa siguiente rutina te ayudara mucho si tu meta es bajar de peso:\n");
  
          System.out.println("- Combina ejercicios cardiovasculares como correr, nadar o hacer ciclismo.\n" +
"- Realiza entrenamiento de fuerza para mantener la masa muscular mientras pierdes grasa.\n" +
"- Sigue una alimentaci�n saludable y equilibrada para apoyar la p�rdida�de�peso.\n");
          
      }
      
      
    @Override
    public void descripcion() {
        System.out.println("\nTeniendo claro los conceptos de estiramiento y calentamiento,"
                + "procedere a explicarte lo que son las rutinas:\n");
        System.out.println("\nLas rutinas de ejercicio (o entrenamiento) son un conjunto");
        System.out.println("de actividades f�sicas que ayudan a cumplir objetivos determinados como bajar");
        System.out.println("de peso, ganar masa muscular, tonificar regiones corporales, reducir los niveles de");
        System.out.println("estr�s, mejorar la condici�n f�sica, entre otras. Las rutinas de ejercicio var�an en");
        System.out.println("funci�n de la condici�n f�sica, necesidades y h�bitos de cada persona, as� como del");
        System.out.println("tiempo e intensidad que deseen�en�su�rutina.\n");
    }
    
}
