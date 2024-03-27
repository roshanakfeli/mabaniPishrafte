package compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class CompareObjectTest {
    @Test
    void should_compare_primitives_objects() {
        Assertions.assertThat(1 == 1).isTrue();
        Assertions.assertThat(1 != 2).isTrue();
    }

    @Test
    void should_compare_non_primitive_objects() {
        String s1 = new String("Roshanak");
        String s2 = new String("Roshanak");

        System.out.println(s1);
        System.out.println(s2);

        Assertions.assertThat(s1 == s2).isFalse();
        Assertions.assertThat(s1.equals(s2)).isTrue();

        String s3 = new String("ROSHANAK");

        Assertions.assertThat(s3.equalsIgnoreCase(s2)).isTrue();
    }

    @Test
    void should_handle_null_objects() {
        String s1 = null;
        String s2 = "Roshanak";

        Assertions.assertThat(Objects.equals(s1, s2)).isFalse();
    }
}
