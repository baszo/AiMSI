package cross;

public class Walidator {
	
	private Plansza plansza;
	
	public Walidator(Plansza plansza){
		this.plansza=plansza;
	}
	
	public boolean sprawdzRuch(int r, int c){
	return plansza.wolnePole(r,c);
	}
	public boolean czyWygrana(){
	for ( int i=1; i<=3; i++){
	if ((plansza.pobierzZnakZPlanszy(i,1)==plansza.pobierzZnakZPlanszy(i,2)) && (plansza.pobierzZnakZPlanszy(i,1)==plansza.pobierzZnakZPlanszy(i,3)) && (plansza.pobierzZnakZPlanszy(i,1)!='_')){
	return true;
	}
	}
	for ( int i=1; i<=3; i++){
	if ((plansza.pobierzZnakZPlanszy(1,i)==plansza.pobierzZnakZPlanszy(2,i)) && (plansza.pobierzZnakZPlanszy(1,i)==plansza.pobierzZnakZPlanszy(3,i)) && (plansza.pobierzZnakZPlanszy(1,i)!='_')){
	return true;
	}
	}
	if ((plansza.pobierzZnakZPlanszy(1,1)==plansza.pobierzZnakZPlanszy(2,2)) && (plansza.pobierzZnakZPlanszy(1,1)==plansza.pobierzZnakZPlanszy(3,3)) && (plansza.pobierzZnakZPlanszy(2,2)!='_')){
	return true;
	}
	if ((plansza.pobierzZnakZPlanszy(3,1)==plansza.pobierzZnakZPlanszy(2,2)) && (plansza.pobierzZnakZPlanszy(3,1)==plansza.pobierzZnakZPlanszy(1,3)) && (plansza.pobierzZnakZPlanszy(2,2)!='_')){
	return true;
	}
	return false;
	}
}

