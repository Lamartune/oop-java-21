package ders07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setKavram {

	public static void main(String[] args) {
		// Set 
		
		Set<Integer> kume = new HashSet<Integer>();
		kume.add(3);
		kume.add(0);
		kume.add(1);
		kume.add(5);
		kume.add(3);
		kume.add(0);
	
		System.out.println(kume);
		
		HashSet<String> k2 = new HashSet<>(Arrays.asList("ali","veli","ayþe","betül"));
		
		System.out.println(k2);
		
		TreeSet<Float> k3 = new TreeSet<>();
		k3.add((float) 3.23);
		k3.add(2.0f);
		k3.add(2.23f);
		k3.add(1.05f);
		System.out.println(k3);
		
		//küme iþlemleri
		HashSet<Integer> A = new HashSet<>(Arrays.asList(0,2,3,5,8));
		HashSet<Integer> B = new HashSet<>(Arrays.asList(1,2,4,5,7));
		
		//Birleþim 
		//A.addAll(B);
		//System.out.println(A);
		
		//Kesiþim
		//A.retainAll(B);
		//System.out.println(A);
		
		//Fark
		A.removeAll(B);
		System.out.println(A);
		
		

	}

}
