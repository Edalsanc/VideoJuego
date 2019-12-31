package VideoJuego;

public class Validar extends Exception {
    public Validar(String Municion1,String Municion2){
        super("Se a quedado si municion1"+Municion1+"Se a quedado sin municion2"+Municion2);

    }

}
