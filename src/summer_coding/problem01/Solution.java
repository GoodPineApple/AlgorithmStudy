package summer_coding.problem01;

import java.util.ArrayList;
import java.util.Scanner;

//�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.
//
//���ѻ���
//nums�� ����ִ� ������ ������ 3�� �̻� 50�� �����Դϴ�.
//nums�� �� ���Ҵ� 1 �̻� 1000 ������ �ڿ����̸�, �ߺ��� ���ڰ� ������� �ʽ��ϴ�.
//����� ��
//nums	result
//[1,2,3,4]	1
//[1,2,7,6,4]	4
//����� �� ����
//����� �� #1
//[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
//
//����� �� #2
//[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
//[1,4,6]�� �̿��ؼ� 11�� ���� �� �ֽ��ϴ�.
//[2,4,7]�� �̿��ؼ� 13�� ���� �� �ֽ��ϴ�.
//[4,6,7]�� �̿��ؼ� 17�� ���� �� �ֽ��ϴ�.
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {1,2,3,4};
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) {
		// �Ҽ� : ���θ� ���� �� �ִ� ��. 
	   
	   ArrayList<Integer> sumList = new ArrayList<>();
	   
	   int index = 1;
	   for(int i=0; i<nums.length; i++){
		   int temp = nums[i];
		   
		   for(;index<nums.length; index++){
			   if(i == 1){
				   System.out.println(index);
				   System.out.println(temp);
				   System.out.println(nums[index]);
			   }
			   temp += nums[index];
			   
			   if(!sumList.contains(temp)){
				   sumList.add(temp);
			   }
		   }
		   index = 1+i;
	   }
	   System.out.println(sumList);
	   for(int i=0; i<nums.length; i++){
		   System.out.println(nums[i]);
		   if(sumList.contains(nums[i])){
			   sumList.remove(i);
		   }
	   }
	   System.out.println(sumList);
	   
	   for(int i=2; i<=2; i++){
		   for(int j=0; j<sumList.size(); j++){
			   // i�� �Ҽ��� ���ϰ� j�� sumList�� �ε����� �����´�.
			   if(sumList.get(j) % i == 0){
				   System.out.println(sumList.get(j));
				   sumList.remove(j);
			   }
			   
		   }
	   }
	   
	    return sumList.size();
	  }
}
