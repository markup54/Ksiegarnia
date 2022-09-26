public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Publikacja p1 =new Publikacja();
        System.out.println("Mam książek "+Ksiazka.licznikObiektow);
        Ksiazka ksiazka1 = new Ksiazka("Metro",20,400);
        System.out.println(ksiazka1);
        System.out.println("Mam książek "+Ksiazka.licznikObiektow);
        Ksiazka ksiazka2 = new Ksiazka("Wiedźmin",30,300);
        System.out.println("Mam książek "+Ksiazka.licznikObiektow);
        EBook ebook1 = new EBook("Polly Anna",15,TypyEbook.pdf);
        System.out.println(ebook1);
        System.out.println("Mam ebooki "+EBook.licznikObiektow);
    }
}