package ders06;

//
@FunctionalInterface
interface lmbd{
	void yaz();
}

public class lambdaInterface {
	

	public static void main(String[] args) {
		lmbd l = new lmbd() {
			
			@Override
			public void yaz() {
				System.out.println("araba esat");
				
			}
		};
		
		l.yaz();
		
		lmbd l2 = ()->System.out.println("Merhaba");
		l2.yaz();
		

	}

}
