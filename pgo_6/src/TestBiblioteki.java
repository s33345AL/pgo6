import java.util.ArrayList;

public class TestBiblioteki {
    public static void main(String[] args) {
    Ksiazka ksiazka1 = new Ksiazka("Pusta butelka", 2017, "Andrzej Kamiennicki", 356);
    Ksiazka ksiazka2 = new Ksiazka("Pełna butelka", 2019, "Joanna Kamiennicka", 897);

    Film film1 = new Film("Pusta butelka: odrodzenie", 2021, "Tomasz Kwiatkowski", 99);
    Film film2 = new Film("Pełna butelka: powrót wody", 2024, "Maciej Kwiatkowski", 141);

    MediaBiblioteczne[] mediatablica = new MediaBiblioteczne[4];
    mediatablica[0] = ksiazka1;
    mediatablica[1] = ksiazka2;
    mediatablica[2] = film1;
    mediatablica[3] = film2;
        System.out.println("Informacje o mediach");
    for(MediaBiblioteczne media : mediatablica) {
        media.wyswietlInformacje();
    }
    ksiazka1.wypozycz();
    ksiazka1.wypozycz();
    ksiazka1.zwroc();

    ksiazka1.sprawdzLiczbeStron();
    film1.sprawdzCzasTrwania();

    for (MediaBiblioteczne media : mediatablica) {
        if(media instanceof Film) {
            Film film = (Film) media;
            film.sprawdzCzasTrwania();
        } else if (media instanceof Ksiazka) {
            Ksiazka ksiazka = (Ksiazka) media;
            ksiazka.sprawdzLiczbeStron();
        }
    }
    }
}