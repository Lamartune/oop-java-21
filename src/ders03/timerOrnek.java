package ders03;

import java.util.Timer;
import java.util.TimerTask;


public class timerOrnek {
	static int sayac = 0;
	static TimerTask g1,g2;
	
	public static void main(String[] args) {
		Timer t = new Timer();
		
		g1 = new TimerTask() {
			
			@Override
			public void run() {
				sayac++;
				System.out.print("G1");
				if(sayac==15) {

					g1.cancel();
					
				}
			}
		};
		t.schedule(g1,0,300);
		g2 = new TimerTask() {
			
			@Override
			public void run() {
				sayac++;
				System.out.print("G2");
				if(sayac==25) g2.cancel();
			}
		};


		t.schedule(g2,0,100);

	}

}
