package Vehicle;

public class Mashin extends Vehicle implements SandoghDar, GearBox {

    public static int tedadeForosh;
    boolean isOpen; // false
    String mark;
    Ranande ranande;
    int gonjayeshSandogh;
    Dande typeDande;


    public Mashin() {
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    public Mashin(String mark, int gonjayeshSandogh, Dande typeDande) {
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
    public Dande typeDande() {
        return typeDande;
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
