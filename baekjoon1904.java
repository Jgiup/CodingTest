import java.util.Scanner;

public class Main {
	
	static int ar[];

	public static void main(String[] args) {
		
		ar = new int [1000001];
		ar[0] = 0;
		ar[1] = 1;
		ar[2] = 2;
		// ar[3]부터 피초나치수열이 적용이 됨.
		
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		
		System.out.println(fibo(a));
	}
	
	public static int fibo(int N) {
		if ( N==1 ) {
			return ar[N];
		}
		else if ( N==2 ) {
			return ar[N];
		}
		// ar[3]부터 피초나치수열이 적용이 됨. ar[3]부터 적용되도록 함수설정.
		else if(N>=3 && N<=1000000)
		for(int i =3; i<=N; i++ )
			ar[i] = (ar[i-1] + ar[i-2]) % 15746;
		// ar[46]행부터 int형이 제공하는 숫자를 초과해서 음수값이 반한됨. 그래서 바로바로 나눠줌.
			return ar[N];
					
	}
		
}	