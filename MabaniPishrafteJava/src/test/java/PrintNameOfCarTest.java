import Vehicle.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintNameOfCarTest {
    @Test
    void print_name(){
        // Given
        Vehicle benz = new Mashin("Benz", 120, "Automtic");
        Vehicle bmw = new Mashin("BMW", 80, "Automtic");
        Vehicle motor = new Motor();
        Vehicle[] cars = {benz, bmw, motor};

        PrintNameOfCar printNameOfCar = new PrintNameOfCar(cars);

        // When
        String listOfNames = printNameOfCar.execute();

        // Then
        Assertions.assertEquals("Benz-BMW-Motor", listOfNames);
    }
}
