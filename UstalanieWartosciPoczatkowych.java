package KolkoKrzyrzyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UstalanieWartosciPoczatkowych {

	public static void Plansza() {
		System.out.println("  0 | 1 | 2 ");
		System.out.println("-------------");
		System.out.println("  3 | 4 | 5 ");
		System.out.println("-------------");
		System.out.println("  6 | 7 | 8 ");
		System.out.println();
	}
	
	public static void wartoscpocz() {
		RysowaniePlanszy.Inicjalizacja();
		char[] znaki2 = RysowaniePlanszy.getZnaki2();
		System.out.println("  " + znaki2[0] + " | " + znaki2[1] + " | " + znaki2[2] + " ");
		System.out.println("-------------");
		System.out.println("  " + znaki2[3] + " | " + znaki2[4] + " | " + znaki2[5] + " ");
		System.out.println("-------------");
		System.out.println("  " + znaki2[6] + " | " + znaki2[7] + " | " + znaki2[8] + " ");
		System.out.println();
	}
	
	static boolean ktopierwszy() throws IOException {
		System.out.println("Kto bedzie zaczynal ruch? (Ja)-1 (Komputer)-2");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		if(a == 1) {
			System.out.println("Zaczynaj :)");
			return true;
		}
		else {
			System.out.println("Ja zaczyma :p");
			return false;
		}
	}
}
