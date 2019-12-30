package VideoJuego;
import Ataques.Ataque1;
import Ataques.Ataque2;

public class Camion extends  Vehiculo implements Ataque1,Ataque2 {
    public Camion(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void bomba() {
        System.out.println("Se esta lanzando bomba tipo Camion de suministro HI");
    }

    public void ametralladora() {
        System.out.println("Disparando rafaga tipo Camion de suministro HI");
    }
}
