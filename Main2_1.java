import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		static int zero [] = new int [41];
		// 0 출력개수에 대한 정보를 담을 배열.
		static int one [] = new int [41];
		// 1 출력개수에 대한 정보를 담을 배열.
	public static void main(String[] args) throws  IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//  스캐너보다 버퍼리더가 속도가 훨씬 빠름.( 스캐너는 입력데이터를 구문분석_엔터,스페이스도포함 하고 버퍼리더는 단순히 문자를 읽기 때문에 빠름)
		int t = Integer.parseInt(bf.readLine());
		// t는 테스트케이스의 입력수.
		
		
		for(int i=0; i<t; i++) {
			int N = Integer.parseInt(bf.readLine());
			// N은 fibo(N) 어떤수에 대해 출력할것인가에 대한 변수.
			System.out.println(fibozero(N) +" "+fiboone(N));
		}

	}
	public static int fibozero(int a) {
		zero[0] = 1;
		zero[1] = 0;
		// 0과 1의 인덱스에는 변수 저장.
		for(int i=2; i<=a; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			// 전행과 전전행 더한값을 거기에 저장. 바로 리턴해줌. -> 피보나치 함수를 재귀적 호출이 아닌 입력받은(N)위치까지의 값을 다 저장하고 그 위치(N)만 호출.
		}
		return zero[a];
	}
	public static int fiboone(int a) {
		one[0] = 0;
		one[1] = 1;
		for(int i=2; i<=a; i++) {
			one[i] = one[i-1] + one[i-2];
		}
		return one[a];
	}
	
}
	