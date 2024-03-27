package Vehicle;

import java.util.Objects;

public class Mashin extends Vehicle implements SandoghDar, GearBox, Comparable<Mashin> {

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
        return gonjayeshSandogh;
    }

    @Override
    public String toString() {
        return "Mashin{" +
                "ayaDarBazAst=" + this.isOpen +
                ", mark='" + this.mark + '\'' +
                ", gonjayeshSandogh=" + this.gonjayeshSandogh +
                ", noeDande='" + this.typeDande + '\'' +
                ", ranande=" + this.ranande +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mashin mashin = (Mashin) o;
        return gonjayeshSandogh == mashin.gonjayeshSandogh && Objects.equals(mark, mashin.mark) && typeDande == mashin.typeDande;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, gonjayeshSandogh, typeDande);
    }

    @Override
    public int compareTo(Mashin mashinDigar) {
        int moghayeseBarMabnayeGonjayeshSandogh =
                Integer.compare(this.gonjayeshSandogh, mashinDigar.gonjayeshSandogh);
        if(moghayeseBarMabnayeGonjayeshSandogh == 0){
            if(Objects.equals(this.typeDande, Dande.MANUAL)){
                return -1;
            } else {
                return 1;
            }
        }
        return moghayeseBarMabnayeGonjayeshSandogh;
    }
}
