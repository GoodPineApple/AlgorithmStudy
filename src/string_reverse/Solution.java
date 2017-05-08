package string_reverse;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-tokens
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String revA = new StringBuilder(A).reverse().toString();  // String값을 거꾸로 하는 메소드!!!
        System.out.println(((A.compareTo(revA) == 0)) ? "Yes" : "No");
    }
}
