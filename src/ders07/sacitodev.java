package ders07;

import java.util.ArrayList;
import java.util.Scanner;

public class sacitodev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> liste = new ArrayList<>();

        System.out.println("L�TFEN B�R SAYI G�R�N�Z");
        int a = scan.nextInt();
        System.out.println("girilen say� �zerinde yapmak istedi�iniz i�lemi se�in");
        System.out.println("(1) = faktoriyel hesab�");
        System.out.println("(2) = girilen say�ya kadar isim yazd�rma ");
        System.out.println("(3) = girilen say�ya kadar ka� �ift var ");
        System.out.println("(4) = girilen say�ya kadar ka� tek var");
        System.out.println("(5) = PROGRAMDAN �IKI� ");
        System.out.println("-----L�tfen yapmak istedi�iniz i�lemin numaras�n� girin-----");


        int faktoriyel = 1;
        int cases = scan.nextInt();

        switch (cases){
            case 1:
                int langir = a;
                do {
                   faktoriyel*=langir;
                   langir--;
                } while (langir>1); System.out.println(faktoriyel);
                break;
            case 2:
                int sayac =0;
                while (sayac<a) {
                    System.out.println(sayac + " " + "langir");
                    sayac++;
                }
                break;
            case 3:
                    for (int j = 0; j <= a; j++) {
                        if (j % 2 == 0) liste.add(j);
                    } System.out.println("girilen say�ya kadar olan �iftlerin say�s� = " + liste.toArray().length);
                    break;

            case 4:
                for (int j = 1; j <= a; j++) {
                    if (j % 2 == 1) liste.add(j);
                } System.out.println("girilen say�ya kadar olan teklerin say�s� = " + liste.toArray().length);
            case 5:
                System.out.println("programdan ��k�� yap�l�yor...");
                break;
            default:
                System.out.println("Hatal� se�im l�tfen istedi�iniz i�lemin kar��s�ndaki rakamlar� girin '1,2,3,4' ");

            }
        }



    }

