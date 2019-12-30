package VideoJuego;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CargarTest {
    private Bombardero bom;
    private Camion cam;
    private Crucero cru;
    private Jeep je;
    private Motocicleta mot;
    private Portavion por;
    private SpeedFighter speed;
    private Tanque tan;
    private Cargar c;




    @Before
    public void setUp() throws Exception {
    bom = new Bombardero (3,2,3,4);
    cam = new Camion(3,2,3,4);
    cru = new Crucero(3,2,3,4);
    je = new Jeep(3,2,3,4);
    mot = new Motocicleta(3,2,3,4);
    por = new Portavion(3,2,3,4);
    speed = new SpeedFighter(3,2,3,4);
    tan = new Tanque(3,2,3,4);
    c = new Cargar();
    }

    @Test
    public void asignarVehiculo() {
        Assert.assertNotNull("Esta vacio",bom);
    }

    @Test
    public void testAsignarVehiculo() {
        Assert.assertNotNull("Esta vacio",cam);
    }

    @Test
    public void testAsignarVehiculo1() {
        Assert.assertNotNull("Esta vacio",cru);
    }

    @Test
    public void testAsignarVehiculo2() {
        Assert.assertNotNull("Esta vacio",je);
    }

    @Test
    public void testAsignarVehiculo3() {
        Assert.assertNotNull("Esta vacio",mot);
    }

    @Test
    public void testAsignarVehiculo4() {
        Assert.assertNotNull("Esta vacio",por);
    }

    @Test
    public void testAsignarVehiculo5() {
        Assert.assertNotNull("Esta vacio",speed);
    }

    @Test
    public void testAsignarVehiculo6() {
        Assert.assertNotNull("Esta vacio",tan);
    }

    @Test
    public void totalPersonasCombinado() {
        Assert.assertEquals("no es correcto",16,c.totalPersonasCombinado(bom,cam,cru,je,mot,por,speed,tan));
    }

    @Test
    public void totalCargaCombinado() {
        Assert.assertEquals("no es correcto",24,c.totalCargaCombinado(bom,cam,cru,je,mot,por,speed,tan));
    }
}