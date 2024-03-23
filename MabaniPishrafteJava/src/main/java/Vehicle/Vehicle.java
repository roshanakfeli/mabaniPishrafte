package Vehicle;

public abstract class Vehicle {
    boolean isOn;

    public void roshan() {
        isOn = true;
    }

    void khamoosh() {
        isOn = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();

}
