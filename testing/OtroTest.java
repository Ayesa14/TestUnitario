import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OtroTest {
    @Test
    public void testComprueboOtroMetodo(){
        Assertions.assertEquals(5, Matematicas.suma(2,3));
    }
}
