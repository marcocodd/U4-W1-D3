package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per  il perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo per  area e perimetro
    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }
}
