package ders08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexx {
    public static void main(String[] args) {

        String s = "Bugun $gunlerden pazar ve hava çok guzel.";

        Pattern p = Pattern.compile("\\D");
        Matcher d = p.matcher(s);

        int sayac = 0;
        while(d.find()) sayac++;

        System.out.println(sayac);

    }
}
