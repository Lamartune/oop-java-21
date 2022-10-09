package ders03;

import java.util.Timer;
import java.util.TimerTask;

public class timerOrnek2 {
	static int sayac = 0;
	static TimerTask g1,g2;

	public static void main(String[] args) {

		Timer t = new Timer();

		TimerTask g1 = new TimerTask() {

			@Override
			public void run() {
				sayac++;
				System.out.print("G1");
				if (sayac==10) t.cancel();
			}
		};

		TimerTask g2 = new TimerTask() {

			@Override
			public void run() {
				System.out.print("G2");
				if(sayac==5) System.out.print("G2");
			}
		};
		
		t.schedule(g1,0,100);
		t.schedule(g2,500,500);
		

	}

}
