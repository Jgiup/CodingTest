import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		static int zero [] = new int [41];
		// 0 ��°����� ���� ������ ���� �迭.
		static int one [] = new int [41];
		// 1 ��°����� ���� ������ ���� �迭.
	public static void main(String[] args) throws  IOException  {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//  ��ĳ�ʺ��� ���۸����� �ӵ��� �ξ� ����.( ��ĳ�ʴ� �Էµ����͸� �����м�_����,�����̽������� �ϰ� ���۸����� �ܼ��� ���ڸ� �б� ������ ����)
		int t = Integer.parseInt(bf.readLine());
		// t�� �׽�Ʈ���̽��� �Է¼�.
		
		
		for(int i=0; i<t; i++) {
			int N = Integer.parseInt(bf.readLine());
			// N�� fibo(N) ����� ���� ����Ұ��ΰ��� ���� ����.
			System.out.println(fibozero(N) +" "+fiboone(N));
		}

	}
	public static int fibozero(int a) {
		zero[0] = 1;
		zero[1] = 0;
		// 0�� 1�� �ε������� ���� ����.
		for(int i=2; i<=a; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			// ����� ������ ���Ѱ��� �ű⿡ ����. �ٷ� ��������. -> �Ǻ���ġ �Լ��� ����� ȣ���� �ƴ� �Է¹���(N)��ġ������ ���� �� �����ϰ� �� ��ġ(N)�� ȣ��.
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
	