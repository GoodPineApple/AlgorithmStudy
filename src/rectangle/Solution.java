package rectangle;

// 직사각형의 3점의 좌표만 주어졌을 때, 나머지 한 점을 추론하라
public class Solution {
	public static void main(String[] args) {
		int[][] test = {{1,4},{3,4},{3,10}};
		
		
		int[] result = solution(test);
		System.out.println(result[0] + "," + result[1]);
	}
	
	public static int[] solution(int[][] v) {
        int[] arrX = new int[3];
        int[] arrY = new int[3];
        
        for(int i = 0; i < 3; i++){
        	arrX[i] = v[i][0];
        	arrY[i] = v[i][1];
//        	System.out.println("arrX["+i+"] : "+arrX[i]);
//        	System.out.println("arrY["+i+"] : "+arrY[i]);
        }
        int resultX = 0;
        if(arrX[0]==arrX[1]){
        	resultX = arrX[2];
        } else if(arrX[0]==arrX[2]){
        	resultX = arrX[1];
        } else if(arrX[1]==arrX[2]){
        	resultX = arrX[0];
        }
        
        int resultY = 0;
        if(arrY[0]==arrY[1]){
        	resultY = arrY[2];
        } else if(arrY[0]==arrY[2]){
        	resultY = arrY[1];
        } else if(arrY[1]==arrY[2]){
        	resultY = arrY[0];
        }
        
        
		int[] answer = {resultX,resultY};
        return answer;
    }

}
