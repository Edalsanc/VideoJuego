package Principal;
import VideoJuego.*;
import Ataques.*;
public class Principal {
    public static void main(String[] args) {
        Combate c = new Combate();
         Camion cam =new Camion(1,2,3,4);
        Jeep je = new Jeep(1,2,3,4);
         Motocicleta mot = new Motocicleta(1,2,3,4);
         SpeedFighter speed = new SpeedFighter(1,2,3,4);
         c.ataqueAmetralladora(cam,je,mot,speed);
        System.out.println(c.toString());
    }
}
