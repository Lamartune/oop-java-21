package ders00;

public class hesapla {
	int a,b;
	
	hesapla(){ //constructer method
		a = 5;
		this.a = 5;
		this.b = 5;
	}
	
	hesapla(int a,int b){//constructerı overload ettik
		a = a*2;
		b = b*2;
	}

	int topla(int a, int b) {
		return a + b;
	}
	
	int topla(int a,int b, int c) { //overload method
		return a + b + c;
	}

	public static void main(String[] args) {

		hesapla h = new hesapla();







	}
	
}
