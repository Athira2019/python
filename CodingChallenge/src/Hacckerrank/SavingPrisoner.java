package Hacckerrank;
import java.util.Scanner;

public class SavingPrisoner {
	static int saveThePrisoner(int n, int m, int s) {
		int r = m % n;
		if ((r + s - 1) % n == 0) {
			return n;
		} else {
			return ((r + s - 1) % n);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int S = sc.nextInt();
			System.out.println(saveThePrisoner(N, M, S));
		}
		sc.close();
	}

}