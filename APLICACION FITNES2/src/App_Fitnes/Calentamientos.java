
package App_Fitnes;

public class Calentamientos implements Descripcion {
    
    
    
    public void Calentamientos(){
        
        System.out.println("\n\tCALENTAMIENTOS:"); 
        System.out.println("1. Saltos de cuerda:\n" +
"   - Sostén una cuerda de saltar con las manos y colócala detrás de ti.\n" +
"   - Salta suavemente levantando los pies del suelo y girando la cuerda por debajo de ti.\n" +
"   - Continúa saltando durante 1-2 minutos para elevar la frecuencia cardíaca y calentar todo el cuerpo.\n" +
"\n" +
"2. Rotación de brazos:\n" +
"   - Párate con los pies separados al ancho de los hombros.\n" +
"   - Extiende los brazos hacia los lados, paralelos al suelo.\n" +
"   - Gira los brazos en círculos grandes hacia adelante durante 10-15 segundos.\n" +
"   - Luego, gira los brazos en círculos grandes hacia atrás durante otros 10-15 segundos.\n" +
"\n" +
"3. Sentadillas:\n" +
"   - Párate con los pies separados al ancho de los hombros.\n" +
"   - Flexiona las rodillas y baja lentamente el cuerpo como si fueras a sentarte en una silla.\n" +
"   - Mantén la espalda recta y los talones apoyados en el suelo.\n" +
"   - Vuelve a subir lentamente a la posición inicial.\n" +
"   - Realiza 10-15 repeticiones para calentar las piernas y los glúteos.");
    }

    @Override
    public void descripcion() {

        System.out.println("\nEl calentamiento es la movilización suave y progresiva ");
        System.out.println("a nivel muscular y articular para posteriormente realizar esfuerzos intensos");
        System.out.println("evitando lesiones y obteniendo máximo rendimiento.\n");
    }
    
}
