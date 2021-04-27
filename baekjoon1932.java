import java.util.Scanner;

public class Main {
	
	static int ar[][] = new int [501][501];
	static int res[][] = new int [501][501];

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for (int j =0; j<=i; j++) {
				ar[i][j] = sc.nextInt(); 
			}
		}
		res[0][0] = ar[0][0];
		for(int i = 1; i<=n; i++) {
			for(int j = 0; j<=i; j++) {
				if ( j == 0) {
					res[i][j] = ar[i][j] + res[i-1][j];
				}
				else if ( j== i) {
					res[i][j] = ar[i][j] + res[i-1][j-1];
				} 
				else {
					res[i][j] = ar[i][j] + Math.max(res[i-1][j-1], res[i-1][j]);
				}
			}
		}
		
		int maxres =0;
		for(int i = 0; i< n-1; i++) {
			if(res[n-1][i] > res[n-1][i+1]) {
				maxres = res[n-1][i];
				res[n-1][i+1] = maxres;
				// 맨 밑에 열은 최대값으로 계속 갱신해줌.
			}
		}
		System.out.println(res[n-1][n-1]);
	
	}

}
