package VideoJuego;
import Ataques.Ataque4;
import Ataques.Ataque2;

public class Motocicleta extends Vehiculo implements Ataque2,Ataque4 {
    public Motocicleta(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void ametralladora() {
        System.out.println("Disparando rafaga tipo motocicleta harley");
    }

    public void laser() {

    }
}
