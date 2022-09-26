public class EBook extends Publikacja {
    private TypyEbook typ;
    public static int licznikObiektow;

    public EBook(String tytul, double cena, TypyEbook typ) {
        super(tytul, cena);
        this.typ = typ;
        licznikObiektow++;
    }

    public TypyEbook getTyp() {
        return typ;
    }

    public void setTyp(TypyEbook typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "tytuł: "+getTytul()+
                "cena: "+getCena()+
                "typ=" + typ +
                '}';
    }
}
