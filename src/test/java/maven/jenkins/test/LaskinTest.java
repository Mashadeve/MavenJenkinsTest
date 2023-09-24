package maven.jenkins.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LaskinTest {

    private static double DELTA = 0.01;
    private Laskin laskin = new Laskin();

    @Test
    public void testLaskeEtaisyys() {
        assertEquals("Pituuden testaus", 4.24, laskin.laskeEtaisyys(2, 2, 5, 5), DELTA);
    }
}
