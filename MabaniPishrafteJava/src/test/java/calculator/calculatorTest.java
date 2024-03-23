package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    void Bayad_Do_Adad_Ra_Jam_Konad() {
        Calculator calculator = new Calculator();

        String result = calculator.add("3.3", "2");

        Assertions.assertEquals("5.3", result);
    }
}
