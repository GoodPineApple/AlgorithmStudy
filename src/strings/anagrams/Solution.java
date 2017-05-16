package strings.anagrams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-anagrams
public class Solution {
	
	static boolean isAnagram(String A, String B){
		char a[] = A.toLowerCase().toCharArray();
		char b[] = B.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
	
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
