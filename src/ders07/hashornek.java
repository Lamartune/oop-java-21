package ders07;

import java.util.HashMap;
import java.util.Scanner;

public class hashornek {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"bir");
        hm.put(2,"iki");
        hm.put(3,"��");
        hm.put(4,"d�rt");
        hm.put(5,"be�");
        hm.put(6,"alt�");
        hm.put(7,"yedi");
        hm.put(8,"sekiz");
        hm.put(9,"dokuz");
        hm.put(0,"");
        HashMap<Integer, String> hm2 = new HashMap<>();

        hm2.put(1,"on");
        hm2.put(2,"yirmi");
        hm2.put(3,"otuz");
        hm2.put(4,"k�rk");
        hm2.put(5,"elli");
        hm2.put(6,"altm��");
        hm2.put(7,"yetmi�");
        hm2.put(8,"seksen");
        hm2.put(9,"doksan");
        hm2.put(0,"");



        Scanner scan = new Scanner(System.in);
        System.out.println("bir say� giriniz");
        String s = scan.nextLine();

        int o = Integer.parseInt(Character.toString(s.charAt(0)));
        int b = Integer.parseInt(Character.toString(s.charAt(1)));

        System.out.println(hm2.get(o)+" "+hm.get(b));


    }
}
