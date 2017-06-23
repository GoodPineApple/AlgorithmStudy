package datastructures.array_1d;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by taemi on 2017-05-29.
 * https://www.hackerrank.com/challenges/java-1d-array-introduction
 */
public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] int_arr = new int[n];

        for(int i=0; i<n; i++){
            int_arr[i] = scan.nextInt();
        }
        scan.close();

        for(int i=0; i<int_arr.length; i++){
            System.out.println(int_arr[i]);
        }
    }
}
