package VideoJuego;

public class Vehiculo {
    private String capacidadCarga;
    private String capacidadPersonas;
    private int cantidadMunicion1;
    private int cantidadMunicion2;

    public Vehiculo(String capacidadCarga, String capacidadPersonas, int cantidadMunicion1, int cantidadMunicion2) {
        this.capacidadCarga = capacidadCarga;
        this.capacidadPersonas = capacidadPersonas;
        this.cantidadMunicion1 = cantidadMunicion1;
        this.cantidadMunicion2 = cantidadMunicion2;
    }
}
