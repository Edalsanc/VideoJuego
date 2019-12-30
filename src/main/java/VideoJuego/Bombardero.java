package VideoJuego;
import Ataques.Ataque1;
import Ataques.Ataque3;

public class Bombardero extends Vehiculo implements Ataque1,Ataque3  {
    public Bombardero(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void bomba() {

    }

    public void misil() {

    }
}
