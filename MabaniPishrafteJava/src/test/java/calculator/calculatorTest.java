package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {

    @Test
    void Bayad_Do_Adad_Ra_Jam_Konad() {
        Calculator calculator = new Calculator();

        String result = calculator.add("3.3", "2");

        assertEquals("5.3", result);
    }

    @Test
    void Bayad_NumberFormat1exception_Ijad_Konid_Agar_Adad_Sahih_nist() {
        Calculator calculator = new Calculator();

        Assertions.assertThatExceptionOfType(NumberFormatException.class)
                .isThrownBy(() -> calculator.add("5.....3", "-2"));
    }
}
