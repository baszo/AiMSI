package cross;

import java.util.Scanner;

public class Gracz {
	Znak myZnak;
	String nazwa;
    
    public Gracz(Znak znak, String nazwa)
    {
        myZnak = znak;
        this.nazwa = nazwa;
    }
    
    public char pobierzZnak()
    {
        return myZnak.pobierzZnak();
    }   
    public String pobierzNazwe()
    {
        return this.nazwa;
    }     
    public void WykonajRuch(Plansza plansza) {
    	boolean ok = false;
    	while (!ok) {
        //read row and column from user
    	  System.out.print("Umiesc  " +  myZnak.pobierzZnak() 
               + " - Umiesc kolumne oraz rzad odzielone spacja : ");
    	  Scanner scanner = new Scanner(System.in);
    	  int row = scanner.nextInt();
    	  int col = scanner.nextInt();
    	  scanner.nextLine();

        //place token
    	  ok = plansza.umiescZnak(row, col, myZnak);
    	  if (!ok) {
    		System.out.println("Invalid move - try again");
    	  }
    	}
    }



}
