package collection.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapTest {
    @Test
    void Should_Have_Unique_Keys_And_Values() {
        Map<String, String> geometrics = new HashMap();     // Key : String, Value : String
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("SheshZelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");
        geometrics.put("Moraba", "Ghermez");    // Duplicated key

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key is : " + key + " , Value is : " + value);
        }
    }
}
