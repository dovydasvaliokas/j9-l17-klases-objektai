public class Preke {
    // Klasės kintamieji / savybės (properties)
    private String pavadinimas;
    private double kaina;
    private int kiekis;
    private String aprasymas;

    // Klasės konstruktoriai
    // Tuščias konstruktorius
    public Preke() {
    }
    // Pilnas
    public Preke(String pavadinimas, double kaina, int kiekis, String aprasymas) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kiekis = kiekis;
        this.aprasymas = aprasymas;
    }

    // Papildomos funkcijos (klasės funkcijos)

    /**
     * Sumažina prekės kainą pagal nurodytą nuolaidą.
     * @param nuolaida procentai parašyti dešimtaine trupmena (0.15 yra 15% nuolaida)
     */
    public void sumazintiKaina(double nuolaida) {
        kaina -= kaina * nuolaida;
        //kaina = kaina - kaina * nuolaida;
    }

    // Getteriai setteriai
    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    // toString()
    @Override
    public String toString() {
        return "Preke{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                ", kiekis=" + kiekis +
                ", aprasymas='" + aprasymas + '\'' +
                '}';
    }
}
