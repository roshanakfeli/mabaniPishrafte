package io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {

    public static final String FILE_NAME = "test.txt";
    public static final String SENTENCE = "Hello World";

    @Test
    void should_write_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             FileInputStream fileInputStream = new FileInputStream(FILE_NAME)) {
            fileOutputStream.write(SENTENCE.getBytes(StandardCharsets.UTF_8));

            int read;
            StringBuilder helloWorld = new StringBuilder();
            while ((read = fileInputStream.read()) != -1){
                helloWorld.append((char) read);
            }

            Assertions.assertThat(helloWorld.toString()).isEqualTo(SENTENCE);
        } catch (IOException e) {
            System.out.println("there is a problem with test.txt file ");
            e.printStackTrace();
        }
    }
}
