
package SpeedStorm;

import java.util.Scanner;


public class Carro {
    
     private String nombre;
    private int posicion;

    public Carro(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    // Método para mover el carro hacia adelante
    public void acelerar() {
        posicion += (int) (Math.random() * 6) + 1;  // Movimiento aleatorio entre 1 y 6
    }
    
    
}

    

