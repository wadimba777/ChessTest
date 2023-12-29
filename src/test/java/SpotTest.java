import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SpotTest {
    @Test
    public void validSpotTest (){
        Spot spot = new Spot("a", 1);
        Assertions.assertNotNull(spot);
        Assertions.assertEquals("a", spot.getX());
        Assertions.assertEquals(1, spot.getY());
    }

    @Test
    public void invalidXValueTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Spot spot = new Spot("i", 1);
        });
    }
    @Test
    public void invalidYValueTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Spot spot = new Spot("h", 9);
        });
    }
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 100})
    public void invalidYValueParamsTest(int y) {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Spot spot = new Spot("i", y);
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"q", "r", "t", "z", "k", "l", "m"})
    public void invalidXValueParamsTest(String x) {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Spot spot = new Spot(x, 3);
        });
    }
}
