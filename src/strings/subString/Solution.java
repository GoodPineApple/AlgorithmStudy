package strings.subString;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-substring
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.print(S.substring(start,end)); // String.substring(����index,������index) ����index���� ��index������ String�� ����϶�
    }
}
