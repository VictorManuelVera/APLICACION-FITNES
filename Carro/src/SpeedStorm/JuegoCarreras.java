
package SpeedStorm;

import java.util.Scanner;

public class JuegoCarreras {
    
     private Carro carro1;
    private Carro carro2;
    private int meta;

    public JuegoCarreras(String nombreCarro1, String nombreCarro2, int meta) {
        carro1 = new Carro(nombreCarro1);
        carro2 = new Carro(nombreCarro2);
        this.meta = meta;
    }

    // Método para mostrar el estado actual de la carrera
    public void mostrarEstado() throws InterruptedException {
        
        
        System.out.println(carro1.getNombre() + ": " + carro1.getPosicion());
        System.out.println(carro2.getNombre() + ": " + carro2.getPosicion());
        System.out.println("-----");
        Thread.sleep(800);
    }

    // Método para verificar si hay un ganador
    public boolean hayGanador() {
        return carro1.getPosicion() >= meta || carro2.getPosicion() >= meta;
    }

    // Método para determinar al ganador
    public String obtenerGanador() {
        if (carro1.getPosicion() >= meta && carro2.getPosicion() >= meta) {
            return "Es un empate";
        } else if (carro1.getPosicion() >= meta) {
            return carro1.getNombre() + " ha ganado la carrera";
        } else {
            return carro2.getNombre() + " ha ganado la carrera";
        }
    }

    // Método para ejecutar un turno de la carrera
    public void turno() {
        carro1.acelerar();
        carro2.acelerar();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Carreras!");
        System.out.print("Ingresa el nombre del primer carro: ");
        String nombreCarro1 = scanner.nextLine();

        System.out.print("Ingresa el nombre del segundo carro: ");
        String nombreCarro2 = scanner.nextLine();

        System.out.print("Ingresa la distancia de la carrera (meta): ");
        int meta = scanner.nextInt();

        JuegoCarreras juego = new JuegoCarreras(nombreCarro1, nombreCarro2, meta);
        System.out.println("-----");
        System.out.println("Empieza en...");
        System.out.println("-----");
         Thread.sleep(800);
        System.out.println("3");
        System.out.println("-----");
        Thread.sleep(800);
        System.out.println("2");
        System.out.println("-----");
        Thread.sleep(800);
        System.out.println("1");
        System.out.println("-----");
        Thread.sleep(800);
        System.out.println("YA!");
        System.out.println("-----");
        Thread.sleep(800);
        
        while (!juego.hayGanador()) {
            juego.turno();
            
            juego.mostrarEstado();
        }

        System.out.println(juego.obtenerGanador());
    }
}
