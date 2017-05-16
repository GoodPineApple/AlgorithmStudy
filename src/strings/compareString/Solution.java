package strings.compareString;

import java.util.HashSet;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-compare
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("insert your sentence");
		String s = in.nextLine();
		System.out.println("insert output length");
		int k = in.nextInt();
		
		String max = s.substring(0, k);
		String min = s.substring(0, k);
		for(int i = 0; i < s.length()-k+1; i++){
			if(max.compareTo(s.substring(i,i+k)) > 0){
				max = s.substring(i, i+k);
			}
			if(min.compareTo(s.substring(i, i+k)) < 0){
				min = s.substring(i, i+k);
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
