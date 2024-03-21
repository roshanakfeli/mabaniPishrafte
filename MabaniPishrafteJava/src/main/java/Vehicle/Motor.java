package Vehicle;

public class Motor extends Vehicle {
    public boolean ayaDarHaleHarekatAst() {
        return isOn;
    }

    @Override
    public String getMark() {
        return "Motor";
    }
}
