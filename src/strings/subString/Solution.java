package strings.subString;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-substring
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.print(S.substring(start,end)); // String.substring(시작index,끝나는index) 시작index부터 끝index까지의 String을 출력하라
    }
}
