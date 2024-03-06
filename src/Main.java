import esercizio1.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 7);


        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();


        System.out.println("Rettangolo 2:");
        rettangolo2.stampaRettangolo();


        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
    }
