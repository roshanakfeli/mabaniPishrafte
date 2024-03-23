import Vehicle.Mashin;
import foroshande.Foroshande;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {

    @Test
    void Tedad_MashinHaye_Forokhte_Shode(){
        Foroshande ali = new Foroshande();
        Math.abs(-1.5);

        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();
        ali.foroshMashin();

        Assertions.assertEquals(4, Mashin.tedadeForosh);
    }
}
