package ders07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setkavrami {
    public static void main(String[] args) {
        Set<Integer> kume = new HashSet<>();
        kume.add(3);
        kume.add(0);
        kume.add(2);
        kume.add(4);
        kume.add(3);
        kume.add(0);

        System.out.println(kume);

        Set<String> ks = new HashSet<>(Arrays.asList("langir","lingir","fati","arabaesat","dýrkata emre"));
        System.out.println(ks);


        TreeSet<Float> fs = new TreeSet<>(Arrays.asList(1.1f,2.4f,4.2f,3.1f));
        System.out.println(fs);

        HashSet<Integer> A = new HashSet<>(Arrays.asList(2,5,6,8,0));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(3,5,6,1,0));
        A.addAll(B);         // A BÝRLEÞÝM B KOMUTU UYGULAR
        //A.retainAll(B);   // A KESÝÞÝM B ÝÞLEMÝ UYGULAR
         //A.removeAll(B);  // A FARK B ÝÞLEMÝ UYGULAR

        System.out.println(A);

        System.out.println(A.spliterator().getExactSizeIfKnown()); // küme eleman sayýsý


    }


}
