public abstract class Publikacja {
    //klasa abstrakcyjna nie można tworzyć z niej obiektu
    //służy tylko do dziedziczenia
    private String tytul;
    private  double cena;

    @Override
    public String toString() {
        return "Publikacja{" +
                "tytul='" + tytul + '\'' +
                ", cena=" + cena +
                '}';
    }

    public Publikacja(String tytul, double cena) {
        this.tytul = tytul;
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
