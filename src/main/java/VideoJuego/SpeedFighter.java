package VideoJuego;
import Ataques.Ataque2;
import Ataques.Ataque4;
public class SpeedFighter extends Vehiculo implements Ataque2,Ataque4 {
    public SpeedFighter(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        super(capacidadCarga, capacidadPersonas, cantidadMunicion1, cantidadMunicion2);
    }

    public void laser() {

    }

    public void ametralladora() {
        System.out.println("Disparando rafaga tipo Speed Figther");
    }
}
