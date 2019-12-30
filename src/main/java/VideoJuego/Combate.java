package VideoJuego;

public class Combate {


    private Camion cam;
    private Jeep je;
    private Motocicleta mot;
    private SpeedFighter speed;

    public Combate(Camion cam, Jeep je, Motocicleta mot, SpeedFighter speed) {
        this.cam = cam;
        this.je = je;
        this.mot = mot;
        this.speed = speed;
    }

    public Combate() {
    }

    public void ataqueAmetralladora(Camion cam, Jeep je, Motocicleta mot, SpeedFighter speed){
        cam.ametralladora();
        je.ametralladora();
        mot.ametralladora();
        speed.ametralladora();


    }

    @Override
    public String toString() {
        return
                "cam=" + cam +
                ", je=" + je +
                ", mot=" + mot +
                ", speed=" + speed
                ;
    }
}
