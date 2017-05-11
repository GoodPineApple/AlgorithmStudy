package big_integer;

import java.util.Scanner;
import java.math.*;

// https://www.hackerrank.com/challenges/java-biginteger?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class BigInteger {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	// Ÿ���� int�� ó���Ͽ��� ���.
    	// 123456789123456789 �� 100000000000000000�� ���� �ذ��� �� ����.
    	
    	
        java.math.BigInteger a = sc.nextBigInteger();
        java.math.BigInteger b = sc.nextBigInteger();
        java.math.BigInteger sum = a.add(b);
        java.math.BigInteger mul = a.multiply(b);
    	System.out.println(sum);
    	System.out.println(mul);
    	sc.close();
    }
}
