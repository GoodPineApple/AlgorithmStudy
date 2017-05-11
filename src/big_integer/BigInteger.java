package big_integer;

import java.util.Scanner;
import java.math.*;

// https://www.hackerrank.com/challenges/java-biginteger?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class BigInteger {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	// 타입을 int로 처리하였을 경우.
    	// 123456789123456789 와 100000000000000000의 곱을 해결할 수 없다.
    	
    	
        java.math.BigInteger a = sc.nextBigInteger();
        java.math.BigInteger b = sc.nextBigInteger();
        java.math.BigInteger sum = a.add(b);
        java.math.BigInteger mul = a.multiply(b);
    	System.out.println(sum);
    	System.out.println(mul);
    	sc.close();
    }
}
