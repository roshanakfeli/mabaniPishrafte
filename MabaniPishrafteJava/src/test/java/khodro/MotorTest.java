package khodro;

import Vehicle.Motor;
import Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void MotorBayadHarekatKonad() {
        // Given
        Vehicle motor = new Motor();

        // When
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();

        // Then
        Assertions.assertFalse(ayaHarekatMikonad);

    }
}
