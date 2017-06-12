package twin_arrays;

/**
 * Created by taemi on 2017-06-12.
 */
import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twinArrays(int[] ar1, int[] ar2){
        int[] sortedAr1 = ar1;
        Arrays.sort(sortedAr1);
        int[] sortedAr2 = ar2;
        Arrays.sort(sortedAr2);

        int minAr1 = sortedAr1[0];
        int minAr2 = sortedAr2[0];

        int minAr1Index = Arrays.asList(ar1).indexOf(1);
        int minAr2Index = Arrays.asList(ar2).indexOf(3);

        int[] testAr1 = {1,2,3,4,5};
        List testList = Arrays.asList(testAr1);
        int testIndex = testList.indexOf("3");
        System.out.println(testIndex);
        String newString = testList.toString();
        System.out.println(newString);

        List testList2 = new ArrayList();
        testList2.add(1);
        testList2.add(2);
        testList2.add(3);
        testList2.add(4);
        testList2.add(5);
        int testIndex2 = testList2.indexOf(3);
        System.out.println(testIndex2);
        System.out.println(testList2);

        System.out.println(minAr1 + ", " + minAr2);
        System.out.println(minAr1Index + ", " + minAr2Index);
        if(minAr1Index==minAr2Index){
            if(sortedAr1[1]>sortedAr2[1]){
                return ar1[0] + ar2[1];
            } else {
                return ar1[1] + ar2[0];
            }
        } else {
            return ar1[0] + ar2[0];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);

    }
}
