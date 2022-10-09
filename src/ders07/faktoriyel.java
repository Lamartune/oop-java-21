package ders07;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayý Girin:");

        int num = reader.nextInt();
        int sayac=num;
        long faktoriyel = 1;
        while(sayac>1)
        {
            faktoriyel*=sayac;
            sayac--;
        }
       /* for(int i = 1; i <= num; ++i)
        {
            faktoriyel *= i;
        }*/
        System.out.printf("%d Sayýsýnýn Faktöriyeli = %d \n", num, faktoriyel);
    }
}

