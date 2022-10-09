package ders08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexGiris {

	public static void main(String[] args) {
		// Regex
		// Regular Expressions
		//  - //d rakam kontrol
		//  - //s boþluk kontrol

		String s = "kartal kalkar dal sarkar dal sarkar kartal kalkar";
		
		Pattern p = Pattern.compile("[d][a-z]{3}");  // = [k][a-z]{5}
		Matcher m = p.matcher(s);

		int sayac=0;
		while(m.find()) sayac++;
		System.out.println(Pattern.matches("[azn]+","afc"));
		
		System.out.println(sayac);


	}

}
