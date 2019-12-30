package VideoJuego;
import Ataques.Ataque1;
import Ataques.Ataque2;

public class Jeep extends Vehiculo implements Ataque1,Ataque2 {

    public Jeep(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void bomba() {

    }

    public void ametralladora() {
        System.out.println("Disparando rafaga tipo Jeep de reconocimiento");
    }
}
