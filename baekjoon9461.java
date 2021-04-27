import java.util.Scanner;

public class Main {
	
	static Long ar[] = new Long [101];
	// 숫자가 커지면 int형이 감당 못해서 Long 타입 배열 선언.

	public static void main(String[] args) {
		ar[1] = 1L;
		ar[2] = 1L;
		ar[3] = 1L;
		ar[4] = 2L;
		ar[5] = 2L;
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int N = sc.nextInt();
			System.out.println(f(N));
		}
		
	}
	
	public static Long f(int N) {
		if (N>=1 && N<=5) {
			return  ar[N];
			// 1부터 5는 지정해둠.
		}
		else
		{
			for(int i=6;i<=N;i++) {
				ar[i]= ar[i-1] + ar[i-5];
				// 6부터는 일정한 규칙에 따라.
			}
			return ar[N];	
		}
		
		
	}
}
