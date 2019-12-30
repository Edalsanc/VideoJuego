package VideoJuego;

public class Vehiculo {
    private int capacidadCarga;
    private int capacidadPersonas;
    private int cantidadMunicion1;
    private int cantidadMunicion2;

    public Vehiculo(int capacidadCarga, int capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        this.capacidadCarga = capacidadCarga;
        this.capacidadPersonas = capacidadPersonas;
        this.cantidadMunicion1 = cantidadMunicion1;
        this.cantidadMunicion2 = cantidadMunicion2;
    }



    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

   /* public int getCantidadMunicion1() {
        return cantidadMunicion1;
    }

    */
/*    public int getCantidadMunicion2() {
        return cantidadMunicion2;
    }

 */
}


