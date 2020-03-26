package KolkoKrzyrzyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RysowaniePlanszy {
	private static char krzyrzyk = 'x';
	private static char kolko = 'o';
	private static char puste = ' ';
	private static char znaki[];
	
	public static char getZnaki(int i) {
		char zn = znaki[i];
		return zn;
	}
	
	public static char[] getZnaki2() {
		return znaki;
	}
	
	public static void Inicjalizacja() {
		znaki = new char[9];
		for(int i=0;i<9;i++) {
			znaki[i]=puste;
		}
	}
	
	public static void Rysowanie() {
		System.out.println("  " + znaki[0] + " | " + znaki[1] + " | " + znaki[2] + " ");
		System.out.println("-------------");
		System.out.println("  " + znaki[3] + " | " + znaki[4] + " | " + znaki[5] + " ");
		System.out.println("-------------");
		System.out.println("  " + znaki[6] + " | " + znaki[7] + " | " + znaki[8] + " ");
		System.out.println();
	}
	
	public static void Rysowaniekrzyrzyk(int i) {
		if(znaki[i] == puste)
			znaki[i] = krzyrzyk;
	}
	
	public static void Rysowaniekolek(int i) {
		if(znaki[i] == puste) {
			znaki[i] = kolko;
		}
	}

	public static char getKrzyrzyk() {
		return krzyrzyk;
	}

	public void setKrzyrzyk(char krzyrzyk) {
		this.krzyrzyk = krzyrzyk;
	}

	public static char getKolko() {
		return kolko;
	}

	public void setKolko(char kolko) {
		this.kolko = kolko;
	}

	public static char getPuste() {
		return puste;
	}

	public void setPuste(char puste) {
		this.puste = puste;
	}
}
