package summer_coding.problem01;

import java.util.ArrayList;
import java.util.Scanner;

//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
//nums의 각 원소는 1 이상 1000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
//입출력 예
//nums	result
//[1,2,3,4]	1
//[1,2,7,6,4]	4
//입출력 예 설명
//입출력 예 #1
//[1,2,4]를 이용해서 7을 만들 수 있습니다.
//
//입출력 예 #2
//[1,2,4]를 이용해서 7을 만들 수 있습니다.
//[1,4,6]을 이용해서 11을 만들 수 있습니다.
//[2,4,7]을 이용해서 13을 만들 수 있습니다.
//[4,6,7]을 이용해서 17을 만들 수 있습니다.
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {1,2,3,4};
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) {
		// 소수 : 나로만 나눌 수 있는 수. 
	   
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
			   // i는 소수를 구하고 j는 sumList의 인덱스를 꺼내온다.
			   if(sumList.get(j) % i == 0){
				   System.out.println(sumList.get(j));
				   sumList.remove(j);
			   }
			   
		   }
	   }
	   
	    return sumList.size();
	  }
}
