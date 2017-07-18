package datastructures.map;

import java.util.HashMap;
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

        HashMap<String,String> phoneBook = new HashMap<String,String>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            String phone=in.nextLine();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String query =in.nextLine().trim();
            System.out.println(phoneBook.containsKey(query) ? query+"="+phoneBook.get(query) : "Not Found");
        }
    }
}
