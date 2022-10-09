package ders06;

import java.util.HashMap;
import java.util.Scanner;

public class asdasd {
    public static void main (String[] args) {
        //map romen rakamlarý

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(2, "II");
        hm.put(3, "III");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(6, "VI");
        hm.put(7, "VII");
        hm.put(8, "VIII");
        hm.put(9, "IX");
        hm.put(0,"");

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(1, "X");
        hm2.put(2, "XX");
        hm2.put(3, "XXX");
        hm2.put(4, "XL");
        hm2.put(5, "L");
        hm2.put(6, "LX");
        hm2.put(7, "LXX");
        hm2.put(8, "LXXX");
        hm2.put(9, "XC");
        hm2.put(0, "");

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayý giriniz");
        String s = scan.next();

        int o = Integer.parseInt(Character.toString(s.charAt(0)));
        int b = Integer.parseInt(Character.toString(s.charAt(1)));

        //System.out.println(hm2.get(o)+ "" +hm.get(b)+ "");






    }
}