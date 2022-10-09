package ders06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class sorusýnav {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> liste = new ArrayList<>();

        for(int i=0; i<5; i++) liste.add(r.nextInt(9999)+1000);
        System.out.println("ham liste"+liste);
        List<Integer> cift = liste.stream().filter(p->p%2==1).collect(Collectors.toList());
        System.out.println("cift liste"+cift);


    }



}
