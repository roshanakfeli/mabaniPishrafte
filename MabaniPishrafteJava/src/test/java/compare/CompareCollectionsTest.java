package compare;

import Vehicle.Dande;
import Vehicle.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareCollectionsTest {

    @Test
    void should_compare_non_hash_collections() {
        List<Mashin> mashinha_1 = new ArrayList<>();
        mashinha_1.add(new Mashin("Benz", 15, Dande.MANUAL));

        List<Mashin> mashinha_2 = new ArrayList<>();
        mashinha_2.add(new Mashin("Benz", 15, Dande.MANUAL));

        Assertions.assertThat(mashinha_1.equals(mashinha_2)).isTrue();

    }

    @Test
    void should_compare_hash_collections() {
        Set<Mashin> mashinha_1 = new HashSet<>();
        mashinha_1.add(new Mashin("Benz", 15, Dande.MANUAL));

        Set<Mashin> mashinha_2 = new HashSet<>();
        mashinha_2.add(new Mashin("Benz", 15, Dande.MANUAL));

        Assertions.assertThat(mashinha_1.equals(mashinha_2)).isTrue();
    }
}
