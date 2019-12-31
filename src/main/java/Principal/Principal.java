package Principal;
import VideoJuego.*;
import Ataques.*;
public class Principal {
    public static void main(String[] args) {
        Combate c1 = new Combate();
        Combate c2 = new Combate();
        Combate c3 = new Combate();
        Combate c4 = new Combate();


         Camion cam =new Camion(1,2,3,4);
         Jeep je = new Jeep(1,2,3,4);
         Motocicleta mot = new Motocicleta(1,2,3,4);
         SpeedFighter speed = new SpeedFighter(1,2,3,4);
         Bombardero bom = new Bombardero(1,2,3,4);
         Portavion por = new Portavion(1,2,3,4);
         Tanque tan = new Tanque(1,2,3,4);
         Crucero cru = new Crucero(1,2,3,4);

         c1.ataqueAmetralladora(cam,je,mot,speed);
         System.out.println(c1.toString());
         c2.ataqueBombarderos(bom,cam,je,por,tan);
         System.out.println(c2.toString());
         c3.ataquePersonalizado(cru,mot,speed);
         System.out.println(c3.toString());
         c4.ataqueAmetralladoraBomba(cam,bom,je,mot,por);
         System.out.println(c4);

    }
}
