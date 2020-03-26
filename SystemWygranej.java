package KolkoKrzyrzyk;

public class SystemWygranej {
	
	static boolean Mozliwosc(char kogo) {
		char zmienna = kogo;
		char[] znaki2 = RysowaniePlanszy.getZnaki2();
		if(znaki2[0]==zmienna && znaki2[1]==zmienna && znaki2[2]==zmienna)
			return true;
		if(znaki2[3]==zmienna && znaki2[4]==zmienna && znaki2[5]==zmienna)
			return true;
		if(znaki2[6]==zmienna && znaki2[7]==zmienna && znaki2[8]==zmienna)
			return true;
		if(znaki2[0]==zmienna && znaki2[3]==zmienna && znaki2[6]==zmienna)
			return true;
		if(znaki2[1]==zmienna && znaki2[4]==zmienna && znaki2[7]==zmienna)
			return true;
		if(znaki2[2]==zmienna && znaki2[5]==zmienna && znaki2[8]==zmienna)
			return true;
		if(znaki2[0]==zmienna && znaki2[4]==zmienna && znaki2[8]==zmienna)
			return true;
		if(znaki2[2]==zmienna && znaki2[4]==zmienna && znaki2[6]==zmienna)
			return true;
		
		return false;
	}
	
	static boolean WygranaGracz() {
		if(Mozliwosc(RysowaniePlanszy.getKrzyrzyk())) {
			System.out.println("Wygral Gracz");
			return true;
		}
		return false;
	}
	static boolean WygranaKomputer() {
		if(Mozliwosc(RysowaniePlanszy.getKolko())) {
			System.out.println("Wygral Komputer");
			return true;
		}
		return false;
	}
	static boolean Remis() {
		int count = 0;
		char[] znaki2 = RysowaniePlanszy.getZnaki2();
		for(int i=0;i<9;i++) {
			if(znaki2[i] == RysowaniePlanszy.getPuste())
				count++;
		}
		if(count == 0)
			return true;
		else
			return false;
	}
	
	static boolean Wygrana() {
		if(WygranaGracz() || WygranaKomputer() || Remis())
			return true;
		else
			return false;
	}
}
