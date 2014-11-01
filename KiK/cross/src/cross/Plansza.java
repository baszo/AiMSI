package cross;

public class Plansza {
	private Walidator walidator;
	char wolne = '_';
	static final int rozmiar = 3;
	Znak[][] mojaPlansza = new Znak[rozmiar][rozmiar];
	Znak znakPoczatkowy = new Znak(wolne);
	
	//nie wiem czy o to chodzi³o
	
	public Plansza(){
		for (int i = 0; i < rozmiar; i++) {
			for (int j = 0; j < rozmiar; j++) {
				mojaPlansza[i][j]=znakPoczatkowy;
			}
		}
		
	}
	
	void ustawWalidator(Walidator walidator) {
	this.walidator = walidator;
	}
	
	void wypiszSiatke() {
	//wypisuje aktualn¹ siatkê
	for (int i = 0; i < rozmiar; i++) {
	for (int j = 0; j < rozmiar; j++) {
	System.out.print(mojaPlansza[i][j].pobierzZnak());
	}
	System.out.println();
	}
	}
	char pobierzZnakZPlanszy(int kolumna, int wiersz) {
		kolumna--;wiersz--;
	return mojaPlansza[kolumna][wiersz].pobierzZnak();
	}
	boolean czyWolnePola() {//zwraca true jak s¹ dostêpne jakieœ wolne pola
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
	//sprawdza czy mo¿e umieœciæ, jak mo¿e to umieszcza i zwraca true, jak nie mo¿e to false
		if(kolumna >= rozmiar || wiersz >= rozmiar){
			return false;
		}
	
		if (mojaPlansza[kolumna][wiersz].pobierzZnak() == znakPoczatkowy.pobierzZnak()) {
		mojaPlansza[kolumna][wiersz] = znak;
		return true;
		} 
		else 
		{
			return false;
		}
	}
	//boolean wolnePole(int kolumna, int wiersz) - to ustaliliœmy, ¿e ma byæ w klasie Znak, tak?
	//pobiera aktualny rozmiar
	int pobierzRozmiar() {
	return rozmiar;
	}

	public boolean wolnePole(int kolumna, int wiersz) {
		if(mojaPlansza[kolumna][wiersz].pobierzZnak() == '_')
			return true;
		else
			return false;
	}
	}
