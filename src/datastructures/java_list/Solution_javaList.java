package datastructures.java_list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by taemi on 2017-06-20.
 * https://www.hackerrank.com/challenges/java-list?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
 */
public class Solution_javaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        ArrayList array = new ArrayList();
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        while(true){
            String text = scan.next();
            if(text=="Insert"){
                int index = scan.nextInt();
                int num = scan.nextInt();
                array.
            }
            if(text=="Delete"){
                int index = scan.nextInt();
            }
        }
    }
}
