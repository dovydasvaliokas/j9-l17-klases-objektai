import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Sukursiu prekės objektą
        Preke preke1 = new Preke("Kėdė", 15.99, 6, "Medinė kėdė");
        System.out.println("preke1.getPavadinimas() = " + preke1.getPavadinimas());
        System.out.println("preke1.getKaina() = " + preke1.getKaina());
        System.out.println("preke1.getAprasymas() = " + preke1.getAprasymas());
        System.out.println("preke1.getKiekis() = " + preke1.getKiekis());
        preke1.setKaina(21.99);
        System.out.println("preke1.getKaina() = " + preke1.getKaina());
        System.out.println("preke1 = " + preke1);
        preke1.sumazintiKaina(0.1);
        System.out.println("preke1 = " + preke1);

        Preke preke2 = nuskaitytiPrekeIsKonsoles();
        System.out.println("preke2 = " + preke2);

        Preke preke3 = nuskaitytiPrekeSuSetteriaisIsKonsoles();
        System.out.println("preke3 = " + preke3);

        if (preke2.getKaina() > preke3.getKaina()) {
            System.out.println("Antra prekė yra brangesnė");
        }
    }

    public static Preke nuskaitytiPrekeIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite prekės pavadinimą: ");
        String pavadinimas = skaitytuvas.nextLine();
        System.out.println("Įveskite prekės kainą:");
        double kaina = skaitytuvas.nextDouble();
        System.out.println("Įveskite prekės kiekį:");
        int kiekis = skaitytuvas.nextInt();
        System.out.println("Įveskite aprašymą:");
        skaitytuvas.nextLine();             // jeigu šios eilutės nebus, tai neleis įvesti aprašymo, kadangi scanneris atsiliks viena eilute
        String aprasymas = skaitytuvas.nextLine();

        Preke preke = new Preke(pavadinimas, kaina, kiekis, aprasymas);
        return preke;
    }

    public static Preke nuskaitytiPrekeSuSetteriaisIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        Preke preke = new Preke();
        System.out.println("Įveskite prekės pavadinimą:");
        preke.setPavadinimas(skaitytuvas.nextLine());
        System.out.println("Įveskite prekės kainą:");
        preke.setKaina(skaitytuvas.nextDouble());
        System.out.println("Įveskite prekės kiekį:");
        preke.setKiekis(skaitytuvas.nextInt());
        System.out.println("Įveskite aprašymą:");
        skaitytuvas.nextLine();
        preke.setAprasymas(skaitytuvas.nextLine());
        return preke;
    }
}