import Vehicle.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void MotorBayadHarekatKonad() {
        // Given
        Motor motor = new Motor();

        // When
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();

        // Then
        Assertions.assertFalse(ayaHarekatMikonad);

    }
}
