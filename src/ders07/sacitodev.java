package ders07;

import java.util.ArrayList;
import java.util.Scanner;

public class sacitodev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> liste = new ArrayList<>();

        System.out.println("LÜTFEN BÝR SAYI GÝRÝNÝZ");
        int a = scan.nextInt();
        System.out.println("girilen sayý üzerinde yapmak istediðiniz iþlemi seçin");
        System.out.println("(1) = faktoriyel hesabý");
        System.out.println("(2) = girilen sayýya kadar isim yazdýrma ");
        System.out.println("(3) = girilen sayýya kadar kaç çift var ");
        System.out.println("(4) = girilen sayýya kadar kaç tek var");
        System.out.println("(5) = PROGRAMDAN ÇIKIÞ ");
        System.out.println("-----Lütfen yapmak istediðiniz iþlemin numarasýný girin-----");


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
                    } System.out.println("girilen sayýya kadar olan çiftlerin sayýsý = " + liste.toArray().length);
                    break;

            case 4:
                for (int j = 1; j <= a; j++) {
                    if (j % 2 == 1) liste.add(j);
                } System.out.println("girilen sayýya kadar olan teklerin sayýsý = " + liste.toArray().length);
            case 5:
                System.out.println("programdan çýkýþ yapýlýyor...");
                break;
            default:
                System.out.println("Hatalý seçim lütfen istediðiniz iþlemin karþýsýndaki rakamlarý girin '1,2,3,4' ");

            }
        }



    }

