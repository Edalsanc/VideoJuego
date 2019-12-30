package VideoJuego;
import Ataques.Ataque1;
import Ataques.Ataque3;

public class Tanque extends Vehiculo implements Ataque1,Ataque3 {

    public Tanque(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void bomba() {
        System.out.println("Se esta lanzando bomba tipo Tanque Sherman M4");
    }

    public void misil() {

    }
}
