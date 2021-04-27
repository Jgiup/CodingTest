
public class Solution {

	public static void main(String[] args) {
		int[][] arr = new int[n][n];
		int max = (n *(n + 1)) / 2; 
		int k = 1;
		int count = 0;
		int one =1;
		int[] answer = new int [max];
		
		for(int i =0; i< n; i++) {
			for(int j =0; j<=i; j++) {
				arr[i][j] = 0;
			}
		}

		if(n%3 != 1) {
			//최대치 넘기면 그만.
				while (k < max) {
				//int x = 0;
				//1반째 (아래로 내려갈 때) 숫자 채우기
					for(int i=0; i<n-(count*3)-1; i++ ) {
						arr[i+ 2*count][count] = k;
						k++;
					}
					//2번째 (오른쪽으로 갈 때) 숫자 채우기.
					for(int i=0; i<n-(count*3)-1; i++) {
						arr[n-one][i+count]= k;
						k++;
					}
					//3=번째 (대각선 위로) 숫자 채우기
					for(int i=0; i<n-(count*3)-1; i++) {
						arr[n-i-one][n-i-one-count] = k;
						k++;
					}
					count++;
					one++;
				}
			}
			else {
				count =0;
				one =1;
				int two =2;
				while (k <= max) {
					for(int i=0; i<n-(count*3); i++ ) {
						arr[i+ 2*count][count] = k;
						k++;
					}
					if(k >= max) {
						break;
					}
					for(int i=0; i<n-(count*3)-1; i++) {
						arr[n-one][i+one]= k;
						k++;
					}
					if(k >= max) {
						break;
					}
					for(int i=0; i<n-(count*3)-2; i++) {
						arr[n-i-two][n-i-two-count] = k;
						k++;
					}
					count++;
					one++;
					two++;
				}
			}
		
		
		
		int z =0;
		for(int i =0; i< n; i++) {
			for(int j =0; j<n; j++) {
				if(arr[i][j] !=0) {
					answer[z] = arr[i][j];
					z++;
				}
				
			}
		}
		
		return answer;
	}

	}

}
