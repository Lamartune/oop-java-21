package ders01;

public class sifrele {
	String alfabe = "abcçdefgðhýijklmnoöprsþtuüvyz";

	String sezar(String s,int k) {
		int i,j,indis;
		indis = 0;
		char harf=' ';
		String sifrelenmis="";

		for(j=0;j<s.length();j++) {
			for(i=0;i<alfabe.length();i++) {
				if(s.charAt(j)==alfabe.charAt(i)) {
					indis = i;
					harf = alfabe.charAt((i+k)%29);
				}
			}
			sifrelenmis += harf;
		}

		return sifrelenmis;
	}

}
