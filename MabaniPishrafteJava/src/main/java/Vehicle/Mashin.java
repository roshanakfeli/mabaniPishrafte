package Vehicle;

public class Mashin extends Vehicle implements SandoghDar, GearBox {

    boolean isOpen; // false
    String mark;
    Ranande ranande;
    int gonjayeshSandogh;
    String typeDande;


    public Mashin() {
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    public Mashin(String mark, int gonjayeshSandogh, String typeDande) {
        this.mark = mark;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.typeDande = typeDande;
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

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
