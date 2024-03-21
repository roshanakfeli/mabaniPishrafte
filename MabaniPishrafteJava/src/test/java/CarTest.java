import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void MashinBayadHarekatKonad() {
        //Given

        //When

        //Then


        Mashin mashin = new Mashin();
        mashin.darBazAst();
        mashin.roshan();

        System.out.println("Aya dar mashin baz ast?" + mashin.isOpen);

        Mashin pride = new Mashin("Pride");
        pride.roshan();

    }

    class Mashin{
        boolean isOn; // false
        boolean isOpen; // false
        String mark;

        Mashin() {
            System.out.println("Yek Mashin bedone dade sakhte shod.");
        }
        Mashin(String mark) {
            this.mark = mark;
        }

        void roshan() {
            System.out.println("Mashin roshan ast.");
            isOn = true;
        }

        void khamoosh() {
            System.out.println("Mashin khamoosh ast.");
            isOn = false;
        }

        void darBazAst() {
            System.out.println("dar baz ast.");
            isOpen = true;
        }

        void darBasteAst() {
            System.out.println("dar baste ast.");
            isOpen = false;
        }
    }
}
