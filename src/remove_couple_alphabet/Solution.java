package remove_couple_alphabet;

//¦���� �����ϱ��, ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ �����մϴ�. ���� ���ڿ����� ���� ���ĺ��� 2�� �پ� �ִ� ¦�� ã���ϴ�. �״���, �� ���� ������ ��, �յڷ� ���ڿ��� �̾� ���Դϴ�. �� ������ �ݺ��ؼ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ����˴ϴ�. ���ڿ� S�� �־����� ��, ¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���. ���������� ������ �� ������ 1��, �ƴ� ��� 0�� �������ָ� �˴ϴ�.
//
//���� ���, ���ڿ� S = baabaa ���
//
//b aa baa �� bb aa �� aa ��
//
//�� ������ ���ڿ��� ��� ������ �� �����Ƿ� 1�� ��ȯ�մϴ�.
//
//���ѻ���
//���ڿ��� ���� : 1,000,000������ �ڿ���
//���ڿ��� ��� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//�ð����� : 1412ms
//����� ��
//s	result
//baabaa	1
//cdcd	0
//����� �� ����
//����� �� #1
//���� ���ÿ� �����ϴ�.
//����� �� #2
//���ڿ��� ���������� ¦���� ������ �� �ִ� ���ڿ��� �� �̻� �������� �ʱ� ������ 0�� ��ȯ�մϴ�.

public class Solution {
	public static void main(String[] args) {
		String str = "ABCDabcd";
		String str2 = "dd";
		String[] split = str.split("");
		System.out.println("split: " + split[1] + split[2]);
		System.out.println(str.length());
		System.out.println(str.equals(str2));
		System.out.println(str.charAt(1));
		
	}
	
	class Solve1
	{
	    // string�� ���ڿ��� �پ� ������ ����, ��� �����ؼ� ���ڿ��� ""�̶�� return 1, else return 0.;
	    public int solution(String s)
	    {
	        int answer = 0;
	        // string�� ������ ���տ� �ִ� �۾�.
	        String[] arr = s.split("");
	        for(int i=1;i<s.length();i++){
	            // i��°�� i-1��° �۾��� ������ ����� s�� arr�� ���ġ
	            // if((s.charAt(i)).equals(s.charAt(i-1))){  
	            if((s.charAt(i))==s.charAt(i-1)){
	                arr[i] = "";
	                arr[i-1] = "";
	                for(int j=0; j<s.length(); j++){
	                    s = "";
	                    s += arr[j];
	                }
	                arr  = s.split("");
	                i = 1;
	            }
	        }
	        if(!s.equals("")){
	            answer = 1;
	        } 
	        return answer;
	    }
	}

}
