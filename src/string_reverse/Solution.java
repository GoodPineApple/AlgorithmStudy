package string_reverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String revA = new StringBuilder(A).reverse().toString();  // String���� �Ųٷ� �ϴ� �޼ҵ�!!!
        System.out.println(((A.compareTo(revA) == 0)) ? "Yes" : "No");
    }
}
