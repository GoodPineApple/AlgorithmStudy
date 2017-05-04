package hackkerrankStringIntroduction;
//Given two strings of lowercase English letters,  and , perform the following operations:
//
//Sum the lengths of  and .
//Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.
//Input Format
//
//The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//Output Format
//
//There are three lines of output: 
//For the first line, sum the lengths of  and . 
//For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
//For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // �Է¹��� 2���� ��Ʈ�� ������ �հ� A�� B���� ��Ʈ���� ���̰� �� ª����, ��ĭ�� �������� ����� �� ��Ʈ���� ù���ڸ� �빮�ڷ� ��ȯ�ؼ� ��ġ��
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        int A_length = A.length();
        int B_length = B.length();
        
        System.out.println(A_length+B_length);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
