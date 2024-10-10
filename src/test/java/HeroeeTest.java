
import com.mycompany.heroee.Heroee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroeeTest {

    @Test
    public void testAvanzar() {
        int valorEsperado = 1;
        Heroee heroeeTest = new Heroee("Mario", 0);
        heroeeTest.avanzar();
        int valorObtenido = heroeeTest.getX();
        assertEquals(valorEsperado, valorObtenido);

    }

    @Test
    public void testSaltar() {
        boolean valorEsperado = false;
        Heroee heroeeTest = new Heroee("Mario", 0);
        heroeeTest.isSaltando();
        boolean valorObtenido = heroeeTest.isSaltando();
        assertEquals(valorEsperado,valorObtenido);

    }

    @Test
    public void testPerderVidas() {
        int valorEsperado= 2;
        Heroee heroeeTest = new Heroee("Mario", 9);
        heroeeTest.avanzar();
        int valorObtenido = heroeeTest.getVidas();
        assertEquals(valorEsperado,valorObtenido);

    }

}
