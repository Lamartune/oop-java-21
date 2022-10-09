package ders03;

import java.util.Timer;
import java.util.TimerTask;

public class sýnavornektimer {
    static int sayac = 8;
    static int sayac2 = 0;

    public static void main(String[] args) {
        Timer sayý1 = new Timer();
        Timer sayý2 = new Timer();
        TimerTask gorev1 = new TimerTask() {
            @Override
            public void run() {
                System.out.print(sayac+" " +"Araba esat");
                sayac++;
                if(sayac==14) {
                    sayý1.cancel();
                }

            }
        };
        sayý1.schedule(gorev1,0,500);

        TimerTask gorev2 = new TimerTask() {
            @Override
            public void run() {
                sayac2++;
                System.out.print(sayac2+" v"+"motor batu");


                if(sayac2==10); sayý2.cancel();
            }
        };
        sayý1.schedule(gorev2,1000,500);



    }
}
