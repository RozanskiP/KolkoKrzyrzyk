package KolkoKrzyrzyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class WyborRuchu {
	
	static void ruchkomputer() {
		Random obj = new Random();
		int los;
		do{
			los = obj.nextInt(9);
		}while(RysowaniePlanszy.getZnaki(los) != RysowaniePlanszy.getPuste());
		
		RysowaniePlanszy.Rysowaniekolek(los);
	}
	
	static void ruchgracz() throws IOException {
		System.out.println("Jaki chcesz wykonac ruch?:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		while(RysowaniePlanszy.getZnaki(a) != RysowaniePlanszy.getPuste()) {
			System.out.println("Podaj inna licze: ");
		 	a = Integer.parseInt(br.readLine());
		}
		RysowaniePlanszy.Rysowaniekrzyrzyk(a);
	}
}
