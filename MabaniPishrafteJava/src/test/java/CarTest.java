import Vehicle.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void MashinBayadHarekatKonad() {
        //Given
        Mashin benz = new Mashin("Benz");
        Mashin bmw = new Mashin("BMW");

        //When
        boolean ayaHarekatMikonad = benz.ayaDarHaleHarekatAst();
        bmw.roshan();
        boolean ayaBMWHarekatMikonad = bmw.ayaDarHaleHarekatAst();

        //Then
        Assertions.assertFalse(ayaHarekatMikonad);
        Assertions.assertTrue(ayaBMWHarekatMikonad);

    }
}
