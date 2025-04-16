public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        dostepny = true;
    }

    public void  wypozycz(){
        if(dostepny == true){
            dostepny = false;
            System.out.println("Medium zostało wypożyczone");
        }else{
            System.out.println("Medium nie jest dostęne do wypożyczenia");
        }
    }

    public void zwroc(){
        if(dostepny == false){
            dostepny = true;
            System.out.println("Medium zostało zwrócone");
        }else{
            System.out.println("Medium nie było wypożyczone");
        }
    }

    public void wyswietlInformacje(){
        System.out.println("Tytuł: " + tytul );
        System.out.println("Rok Wydania: " + rokWydania);
        System.out.println(dostepny ? "Dostępne" : "Wypożyczone");
    }
}
