package Vehicle;

public class Mashin {

    boolean isOn; // false
    boolean isOpen; // false
    String mark;
    Ranande ranande;

    public Mashin() {
    }
    public Mashin(String mark) {
        this.mark = mark;
    }

    public void roshan() {
        isOn = true;
    }

    void khamoosh() {
        isOn = false;
    }

    void darBazAst() {
        isOpen = true;
    }

    void darBasteAst() {
        isOpen = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        if(isOn && !isOpen){
            return true;
        }else {
            return false;
        }
    }
}
