package ders00;

import java.util.Scanner;

public class ana {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("A sayýsýný giriniz:");
		a = scan.nextInt();
		System.out.println("B sayýsýný giriniz:");
		b = scan.nextInt();
		
		hesapla h = new hesapla();//constructer burada çalýþýr
		//hesapla h = new hesapla(5,8); overload edilen constructer çalýþýr

		System.out.println(h.topla(8,6,7));
		int sonuc = h.topla(a, b);
		System.out.println(sonuc);
		System.out.println(h.topla(3,5));
		h.topla(4, 9, 13); //overload edilen topla() çalýþýr


		hesaplayeni hy = new hesaplayeni();
		System.out.println(hy.topla(3, 5));
		
		
	}

}
