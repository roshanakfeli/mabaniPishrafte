import Vehicle.Dande;
import org.junit.jupiter.api.Test;

public class DandeTest {
    @Test
    void print_all_dande_values() {
        Dande.print();
    }

    @Test
    void print_all_in_persian() {
        System.out.println("In Persian: ");
        Dande.printInPersain();
    }
}
