package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ArrayListTest {
    @Test
    void Should_Be_Empty_When_Created() {
        List<String> strings = new ArrayList<>();

        Assertions.assertThat(strings).isEmpty();
    }

    @Test
    void Convert_Array_To_ArrayList() {
        // Given
        int[] arrayNumbers = {1, 2, 3};

        // When
        Converter converter = new Converter();
        List<Integer> arrayListNumbers = converter.converterToArrayList(arrayNumbers);

        // Then
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        Assertions.assertThat(arrayListNumbers).isEqualTo(expectedList);
    }

    @Test
    void Should_Sort_List() {
        List<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Collections.sort(animals);

        List<String> sortedAnimals = new LinkedList<>();
        sortedAnimals.add("Cat");
        sortedAnimals.add("Cat");
        sortedAnimals.add("Dog");
        sortedAnimals.add("Rabbit");

        Assertions.assertThat(animals).isEqualTo(sortedAnimals);
    }

    class Converter{

        public List<Integer> converterToArrayList(int[] arrayNumbers) {
            List<Integer> ListNumbers = new ArrayList<>();
            for (int arrayNumber : arrayNumbers) {
                ListNumbers.add(arrayNumber);
            }
            return ListNumbers;
        }
    }
}
