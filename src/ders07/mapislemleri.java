package ders07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class mapislemleri {

	public static void main(String[] args) {
		//map  
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "bir");
		hm.put(2, "iki");
		hm.put(3, "üç");
		hm.put(4, "dört");
		hm.put(5, "beþ");
		hm.put(6, "altý");
		hm.put(7, "yedi");
		hm.put(8, "sekiz");
		hm.put(9, "dokuz");
		hm.put(0, "");
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "on");
		hm2.put(2, "yirmi");
		hm2.put(3, "otuz");
		hm2.put(4, "kýrk");
		hm2.put(5, "elli");
		hm2.put(6, "altmýþ");
		hm2.put(7, "yetmiþ");
		hm2.put(8, "seksen");
		hm2.put(9, "doksan");
		hm2.put(0, "");
		
		//System.out.println(hm);
		
		//System.out.println(hm.get(3));
		System.out.println(hm.containsValue("yedi"));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sda");
		System.out.println("Bir sayý giriniz:");
		System.out.println("sda");
		String s = scan.next();
		
		int o =  Integer.parseInt(Character.toString(s.charAt(0)));
		int b =  Integer.parseInt(Character.toString(s.charAt(1)));
		
		System.out.println(hm2.get(o)+" "+hm.get(b));
		
		
		//Treemap
		
		TreeMap<String , String> tm = new TreeMap<>();
		
		tm.put("ad", "Ali");
		tm.put("soyad", "Can");
		
		System.out.println(tm);

		
		
		
		
		

	}

}
