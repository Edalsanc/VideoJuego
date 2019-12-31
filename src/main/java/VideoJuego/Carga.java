package VideoJuego;

import java.util.Vector;

public class Carga {

    Vector<Vehiculo> elegir;

    private Bombardero bom;
    private Camion cam;
    private Crucero cru;
    private Jeep je;
    private Motocicleta mot;
    private Portavion por;
    private SpeedFighter speed;
    private Tanque tan;

    public Carga(Vector<Vehiculo> elegir, Bombardero bom, Camion cam, Crucero cru, Jeep je, Motocicleta mot, Portavion por, SpeedFighter speed, Tanque tan) {
        this.elegir = new Vector<Vehiculo>();
        this.bom = bom;
        this.cam = cam;
        this.cru = cru;
        this.je = je;
        this.mot = mot;
        this.por = por;
        this.speed = speed;
        this.tan = tan;

    }

    public Carga() {
    }

    public Vector<Vehiculo> getElegir() {
        return elegir;
    }

    public void asignarVehiculo(Bombardero bombardero) {

        elegir.add(bombardero);

    }

    public void asignarVehiculo(Camion camion) {

        elegir.add(camion);

    }

    public void asignarVehiculo(Crucero crucero) {

        elegir.add(crucero);

    }

    public void asignarVehiculo(Jeep jeep) {

        elegir.add(jeep);

    }

    public void asignarVehiculo(Motocicleta motocicleta) {

        elegir.add(motocicleta);

    }

    public void asignarVehiculo(Portavion portavion) {

        elegir.add(portavion);

    }

    public void asignarVehiculo(SpeedFighter speedFighter) {

        elegir.add(speedFighter);

    }

    public void asignarVehiculo(Tanque tanque) {

        elegir.add(tanque);

    }

    public int totalPersonasCombinado() {
        int total = 0;
        for(Vehiculo vehiculo:elegir){
            total += vehiculo.getCapacidadPersonas();
        }
        return total;

    }

    public int totalCargaCombinado() {
        int total = 0;

        for(Vehiculo vehiculo:elegir){
            total += vehiculo.getCapacidadCarga();
        }

        return total;
    }
}
