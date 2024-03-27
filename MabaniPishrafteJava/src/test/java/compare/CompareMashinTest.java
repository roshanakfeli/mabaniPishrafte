package compare;

import Vehicle.Dande;
import Vehicle.Mashin;
import Vehicle.MashinComparator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CompareMashinTest {
    @Test
    void should_compare_mashin() {
        Mashin mashin1 = new Mashin("BMW",150, Dande.AUTOMATIC);
        Mashin mashin2 = new Mashin("BMW",150, Dande.AUTOMATIC);

        Assertions.assertThat(Objects.equals(mashin1, mashin2)).isTrue();
    }

    @Test
    void should_sort_mashins() {
        Mashin mashin1 = new Mashin("BMW",150, Dande.MANUAL);
        Mashin mashin2 = new Mashin("BMW",100, Dande.AUTOMATIC);
        Mashin mashin3 = new Mashin("BMW",50, Dande.MANUAL);
        Mashin mashin4 = new Mashin("BMW",50, Dande.AUTOMATIC);

        List<Mashin> mashins = new ArrayList<>();
        mashins.add(mashin1);
        mashins.add(mashin2);
        mashins.add(mashin3);
        mashins.add(mashin4);

        Collections.sort(mashins);

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(mashin3);
        expectedMashins.add(mashin4);
        expectedMashins.add(mashin2);
        expectedMashins.add(mashin1);
        Assertions.assertThat(mashins).isEqualTo(expectedMashins);
    }

    @Test
    void should_sort_mashins_by_mark() {
        Mashin mashin1 = new Mashin("BMW",150, Dande.MANUAL);
        Mashin mashin2 = new Mashin("Mercedes",100, Dande.AUTOMATIC);
        Mashin mashin3 = new Mashin("Audi",50, Dande.MANUAL);
        Mashin mashin4 = new Mashin("Hyundai",50, Dande.AUTOMATIC);

        List<Mashin> mashins = new ArrayList<>();
        mashins.add(mashin1);
        mashins.add(mashin2);
        mashins.add(mashin3);
        mashins.add(mashin4);

        Collections.sort(mashins, new MashinComparator());

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(mashin3);
        expectedMashins.add(mashin1);
        expectedMashins.add(mashin4);
        expectedMashins.add(mashin2);
        Assertions.assertThat(mashins).isEqualTo(expectedMashins);
    }
}
