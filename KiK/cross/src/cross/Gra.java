package cross;

import java.util.Scanner;

public class Gra {
	private Plansza plansza;
    private Walidator walidator;
    private Gracz obecny;
    private Gracz kolejny;


    public Gra()
    {
        plansza = new Plansza();
        walidator = new Walidator(plansza);
        plansza.ustawWalidator(walidator);
        
    	Scanner user_input = new Scanner( System.in );
        System.out.println("Podaj nazwe pierwszego gracza");
        String first_name;
        first_name = user_input.next( );
        System.out.println("Podaj nazwe drugiego gracza");
        String secound_name;
        secound_name = user_input.next( );
       
        obecny = new Gracz(new Znak('X'),first_name);
        kolejny = new Gracz(new Znak('O'),secound_name);
     }

    
    public void Graj()
    {
    	//game ends when winner or grid full
        boolean koniecGry = false;  //game starting so not ended
        //repeat until end of game
        while (!koniecGry)
        {
            //mwykonaj ruch
        	obecny.WykonajRuch( plansza);
            //wyœwietl plansze
            plansza.wypiszSiatke();  
            //sprawdz czy koniec gry
            boolean czyWygrana = walidator.czyWygrana();
            boolean czyWolnePola = !plansza.czyWolnePola();
            if (czyWygrana) //czy wygrana
            {
                System.out.println("Gracz " + obecny.pobierzNazwe() + " ze znakiem " + obecny.pobierzZnak()+" wygrywa");  
                koniecGry = true;
            }
            else if (czyWolnePola)  //koniec wolnych pól
            {
                System.out.println("Plasza pe³na - remis");
                koniecGry = true;
            }
            else //kolejny gracz
            {
                this.zmianaGraczy();
            }
        }
    }  

    //zamiana graczy
    private void zmianaGraczy()
    {
        Gracz tempPlayer = obecny;
        obecny = kolejny;
        kolejny = tempPlayer;
    }

}
