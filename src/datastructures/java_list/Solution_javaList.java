package datastructures.java_list;

import java.util.ArrayList;
import java.util.Iterator;
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
            int temp = scan.nextInt();
            array.add(temp);
        }
        int querySize = scan.nextInt();
        for (int i = 0; i < querySize ; i++){
            String text = scan.next();
            if(text.equals("Insert")){
                int index = scan.nextInt();
                int num = scan.nextInt();
                array.add(index,num);
            }
            if(text.equals("Delete")){
                int index = scan.nextInt();
                array.remove(index);
            }
        }
        Iterator it = array.iterator();
        while(it.hasNext()){
            Integer i = (Integer)it.next();
            System.out.print(i + " ");
        }
    }
}
