package Vehicle;

public enum Dande {
    MANUAL("Dasti"),
    AUTOMATIC("Otomatik");

    private final String toPersian;

    Dande(String toPersian) {
        this.toPersian = toPersian;
    }

    public static void print() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++){
            System.out.println(values[index]);
        }
    }

    public static void printInPersain() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++){
            Dande value = values[index];
            System.out.println(value.toPersian);
        }
    }

    public String getToPersian() {
        return toPersian;
    }
}
