package ders05;

import java.awt.Color;

enum Gunler{   //Color.RED
	PAZARTESÝ,  
	SALI,
	ÇARÞAMBA,
	PERÞEMBE,
	CUMA,
	CUMARTESÝ,
	PAZAR
}

public class enumGiris {

	public static void main(String[] args) {
		Gunler g = Gunler.PAZARTESÝ;
		System.out.println(g);
		System.out.println(g.compareTo(Gunler.ÇARÞAMBA));
		System.out.println(g.ordinal());
		System.out.println(Gunler.CUMA.ordinal());

	}

}
