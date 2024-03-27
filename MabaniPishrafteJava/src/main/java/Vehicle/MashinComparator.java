package Vehicle;

import java.util.Comparator;

public class MashinComparator implements Comparator<Mashin> {
    @Override
    public int compare(Mashin mashin1, Mashin mashin2) {
        return mashin1.getMark().compareTo(mashin2.getMark());
    }
}
