package VideoJuego;
import Ataques.Ataque3;
import Ataques.Ataque1;

public class Portavion extends Vehiculo implements Ataque1,Ataque3{
    public Portavion(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void bomba() {

    }

    public void misil() {

    }
}
