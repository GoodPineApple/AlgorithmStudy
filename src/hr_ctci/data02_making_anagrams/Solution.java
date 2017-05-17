package hr_ctci.data02_making_anagrams;

import java.nio.charset.Charset;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/ctci-making-anagrams
public class Solution {
	public static int numberNeeded(String first, String second) {
		char[] firstSet = first.toCharArray();
		char[] secondSet = second.toCharArray();
		
		int result = 0;  
		return result;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
