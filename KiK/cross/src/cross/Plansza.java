/**
 *
 * @author Andolinka
 */
public class Plansza {

    // static final char wolne = '_'; 
    static final int rozmiar = 3;
    Znak[][] mojaPlansza = new Znak[rozmiar - 1][rozmiar - 1];

    Znak znak = new Znak();

    Znak znakPoczatkowy = znak.wolnePole();//tu ma być przypisany nasz ustalony znak poczatkowy tj. ten wolny

//nie wiem czy o to chodziło
    void ustawWalidator(Walidator walidator) {
        walidator = new Walidator();
    }

    /*
     void inicjalizujSiatkePoczatkowa(){
     for (int i = 0; i < rozmiar; i++) {
     for (int j = 0; j < rozmiar; j++) {
     mojaPlansza[i][j]=znakPoczatkowy;
     }
     }
     }
     */
     
    void wypiszSiatke() {
        //wypisuje aktualną siatkę
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                System.out.print(mojaPlansza[i][j]);
            }
            System.out.println();
        }
    }

    Znak pobierzZnakZPlanszy(int kolumna, int wiersz) {
        return mojaPlansza[kolumna][wiersz];
    }

    boolean czyWolnePola() {//zwraca true jak są dostępne jakieś wolne pola
        int zliczPolaUzupelnione = 0;

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (mojaPlansza[i][j] != znakPoczatkowy) {
                    zliczPolaUzupelnione++;
                }
            }
        }
        return zliczPolaUzupelnione != rozmiar * rozmiar;
    }

    boolean umiescZnak(int kolumna, int wiersz, Znak znak) {
//sprawdza czy może umieścić, jak może to umieszcza i zwraca true, jak nie może to false
        if (mojaPlansza[kolumna][wiersz] == znakPoczatkowy) {
            mojaPlansza[kolumna][wiersz] = znak;
            return true;
        } else {
            return true;
        }
    }

//boolean wolnePole(int kolumna, int wiersz)  - to ustaliliśmy, że ma być w klasie Znak, tak?
//pobiera aktualny rozmiar    
    int pobierzRozmiar() {
        return rozmiar;
    }
}
