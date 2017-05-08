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
        // split���� ������ �迭�� ����� ��� ��ĭ ������ ������ �迭�� ��. a ,b => [a],[],[b]
        String delims = "[ .,?!]+";
	    StringTokenizer arr = new StringTokenizer(s, delims);
	    System.out.println(arr.countTokens());
        while(arr.hasMoreTokens()){
        	System.out.println(arr.nextToken());
        }
        scan.close();
    }
}
