package hr_ctci.data01_left_rotation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation
public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int[] result = new int[n];
		for(int i=0; i<n; i++){
			if(k+i<n){
				result[i] = a[k+i];
			} else {
				result[i] = a[(k+i)-n];
			}
		}
    	return result;
      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // �ԷµǴ� ������ ����
        int k = in.nextInt();  // �������� ȸ���ϴ� Ƚ��. (k < n)
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
