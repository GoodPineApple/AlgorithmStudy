package datastructures.java_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by taemi on 2017-06-25.
 * https://www.hackerrank.com/challenges/phone-book?h_r=next-challenge&h_v=zen
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();

            int phoneNum = 0;
            try {
                phoneNum = phoneBook.get(s);
                System.out.println(s+"="+phoneNum);
            } catch (Exception e) {
                System.out.println("Not found");
            }
        }
    }
}
