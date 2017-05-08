package string_tokens;

import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.hackerrank.com/challenges/java-anagrams
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//	    s = s.replace(" ", ",");
//	    s = s.replace("'", ",");
//	    s = s.replace(";", ",");
//	    s = s.replace("!", ",");
//	    s = s.replace("?", ",");
//	    s = s.replace(".", ",");
//	    s = s.replace("_", ",");
//	    s = s.replace("@", ",");
	    
//	    String[] arr = s.split(",");
        // split으로 나눠진 배열을 사용할 경우 빈칸 사이의 공간도 배열로 들어감. a ,b => [a],[],[b]
        String delims = "[ .,?!]+";
	    StringTokenizer arr = new StringTokenizer(s, delims);
	    System.out.println(arr.countTokens());
        while(arr.hasMoreTokens()){
        	System.out.println(arr.nextToken());
        }
        scan.close();
    }
}
