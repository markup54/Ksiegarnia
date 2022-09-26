public class Ksiazka extends Publikacja{
    private int liczbaStron;
    public static int licznikObiektow;

    public Ksiazka(String tytul, double cena, int liczbaStron) {
        super(tytul, cena);
        this.liczbaStron = liczbaStron;
        licznikObiektow++;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytuł:"+getTytul()+
                "cena:"+getCena()+
                "liczbaStron=" + liczbaStron +
                '}';
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
}
