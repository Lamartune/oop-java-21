package ders08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

public class sad {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1,1,3,6,3,7,0,4,5,6,6);
        List<Integer> a = new ArrayList<>();
        Optional<Integer> toplam = liste.stream().reduce((p1, p2)->p1+p2);
        int yenitoplam = toplam.get();
        var x = yenitoplam - liste.get(10);
        a.add(x);
        System.out.println(x);
        System.out.println();


    }
}
