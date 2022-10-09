package ders06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class lambdaReduce {

	public static void main(String[] args) {
		List<Integer> liste = Arrays.asList(0, 2, 3, 5, 0, 2,6,8);
		System.out.println(liste);
		
		//Optional<Integer>
		Optional<Integer> toplam = liste.stream().reduce((p1,p2)->p1+p2);
		System.out.println(toplam);
		
		Optional<Integer> fark = liste.stream().reduce((p1,p2)->p2-p1);
		System.out.println(fark);
		
		Optional<Integer> sart = liste.stream().reduce((p1,p2)->p1>p2?p1-p2:p2-p1);
		System.out.println(sart);
		
		Optional<Integer> sart2 = liste.stream().reduce((p1,p2)->p1>p2?p1:p2);
		System.out.println(sart2);
		
		//map þart ifadesi
		List<Integer> l = liste.stream().map(p->p%2==0?p/2:p+1).collect(Collectors.toList());
		System.out.println(l);
		
	}

}
