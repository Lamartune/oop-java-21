package ders08;

import java.util.regex.Pattern;

public class regex2 {

	public static void main(String[] args) {
		// regex pattern örnekler
		
		/*
		 [abc]	a, b, or c (simple class)
		 [abc]? once
		 [abc]+ one or more
		 [abc]* zero or more 
		 [^abc]	Any character except a, b, or c (negation)
		 [a-zA-Z]	a through z or A through Z, inclusive (range)
        [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
        [a-z&&[def]]	d, e, or f (intersection)
        [a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
        [a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
		 */
		
		System.out.println(Pattern.matches("\\d", "1"));//true
		System.out.println(Pattern.matches("\\d", "123"));//false
	}

}
