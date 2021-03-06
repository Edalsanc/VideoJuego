package VideoJuego;

import java.util.Vector;

public class Combate {

    Vector<Object> combatir;
    private Bombardero bom;
    private Camion cam;
    private Crucero cru;
    private Jeep je;
    private Motocicleta mot;
    private Portavion por;
    private SpeedFighter speed;
    private Tanque tan;
    private Carga carga;

    public Combate(Bombardero bom, Camion cam, Crucero cru, Jeep je, Motocicleta mot, Portavion por, SpeedFighter speed, Tanque tan) {
        this.bom = bom;
        this.cam = cam;
        this.cru = cru;
        this.je = je;
        this.mot = mot;
        this.por = por;
        this.speed = speed;
        this.tan = tan;

    }

    public Combate() {
    }

    public void ataqueAmetralladora(Camion cam,Jeep je,Motocicleta mot,SpeedFighter speed){

       while(carga.getElegir()!=null){
           cam.ametralladora();
            je.ametralladora();
            mot.ametralladora();
            speed.ametralladora();

        }


    }

    public void ataqueBombarderos(Bombardero bom, Camion cam, Jeep je, Portavion por, Tanque tan){


            bom.bomba();
            cam.bomba();
            this.je.bomba();
            por.bomba();
            tan.bomba();


    }

    public void ataquePersonalizado(Crucero cru,Motocicleta mot,SpeedFighter speed){

            cru.laser();
            mot.laser();
            speed.laser();


    }

    public void ataqueAmetralladoraBomba(Camion cam,Bombardero bom,Jeep je,Motocicleta mot,Portavion por){

        cam.bomba();
        cam.ametralladora();
        bom.bomba();
        je.bomba();
        je.ametralladora();
        mot.ametralladora();
        por.bomba();

    }

    @Override
    public String toString() {
        return
                "bom=" + bom +
                ", cam=" + cam +
                ", cru=" + cru +
                ", je=" + je +
                ", mot=" + mot +
                ", por=" + por +
                ", speed=" + speed +
                ", tan=" + tan ;
    }
}
