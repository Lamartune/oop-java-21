package ders06;

@FunctionalInterface
interface lmbd2{
	int topla(int a,int b);
}

public class lambdaIntParametreli {

	public static void main(String[] args) {
		lmbd2 l = (a,b)-> a+b;
		
		System.out.println(l.topla(8, 13));
		

	}

}
