import java.util.Scanner;

public class Main {
	
	static int price[][] = new int [1001][3];
	// 가격담는 배열.
	static int res[][] = new int [1001][3];
	// 최소한의 가격을 누적해가는 배열.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			for(int j =0; j<3; j++) {
				price[i][j] = sc.nextInt();
			}
		}				
		
		// 초기값 설정.
		res[0][0] = price[0][0];
		res[0][1] = price[0][1];
		res[0][2] = price[0][2];
				
		for(int i = 1; i< N; i++) {
			for(int j = 0; j<3; j++) {
				res[i][0] =  price[i][0] + Math.min(res[i-1][1],res[i-1][2]);
				// i가 1일때 price[1][0] = 49를 기준으로 중복도 안되면서 그전에 최소값들을 더해서 res에 저장.
				res[i][1] =  price[i][1] + Math.min(res[i-1][0],res[i-1][2]);
				res[i][2] =  price[i][2] + Math.min(res[i-1][0],res[i-1][1]);
			}
		}
		System.out.println(Math.min(Math.min(res[N-1][0], res[N-1][1]),res[N-1][2]));
	}
}