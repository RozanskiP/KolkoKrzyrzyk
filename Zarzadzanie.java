package KolkoKrzyrzyk;

import java.io.IOException;

public class Zarzadzanie {
	
	void zarzadca() throws IOException {
		UstalanieWartosciPoczatkowych.Plansza();
		UstalanieWartosciPoczatkowych.wartoscpocz();
		
		if(UstalanieWartosciPoczatkowych.ktopierwszy()) {
			WyborRuchu.ruchgracz();
			RysowaniePlanszy.Rysowanie();
		}
		
		while(!(SystemWygranej.Wygrana())) {
			WyborRuchu.ruchkomputer();
			RysowaniePlanszy.Rysowanie();
			if(SystemWygranej.Wygrana())
				break;
			WyborRuchu.ruchgracz();
			RysowaniePlanszy.Rysowanie();
		}
		System.out.println("Dzieki za gre :D");
		
	}
}
