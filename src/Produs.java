public class Produs {
    String nume;
    int pret;

    public Produs(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return nume;
    }
}
