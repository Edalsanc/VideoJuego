package VideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CombateTest {
    Camion cam =new Camion(1,2,3,4);
    Jeep je = new Jeep(1,2,3,4);
    Motocicleta mot = new Motocicleta(1,2,3,4);
    SpeedFighter speed = new SpeedFighter(1,2,3,4);
    Bombardero bom = new Bombardero(1,2,3,4);
    Portavion por = new Portavion(1,2,3,4);
    Tanque tan = new Tanque(1,2,3,4);
    Crucero cru = new Crucero(1,2,3,4);

    Combate c1 ;
    Combate c2 ;
    Combate c3 ;
    Combate c4 ;

    @Before
    public void setUp() throws Exception {



        c1 = new Combate();
        c2 = new Combate();
        c3 = new Combate();
        c4 = new Combate();

    }

    @Test
    public void ataqueAmetralladora() {



    }

    @Test
    public void ataqueBombarderos() {

    }

    @Test
    public void ataquePersonalizado() {
    }

    @Test
    public void ataqueAmetralladoraBomba() {
    }
}