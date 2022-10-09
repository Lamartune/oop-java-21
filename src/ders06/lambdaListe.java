package ders06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class lambdaListe {

	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Integer> liste = new ArrayList<>();




		for(int i=0;i<10;i++) liste.add(r.nextInt(10));
		System.out.println(liste);



		liste.forEach(p->System.out.println(p.intValue()+3));
		
	}

}
