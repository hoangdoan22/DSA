package HomeworkDSday2;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input number of test cases : ");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("input n : ");
			int n = sc.nextInt();
			System.out.println("input k : ");
			int k = sc.nextInt();
			System.out.println("Output : " + kthFactor(n, k));
		}
	}

	public static int kthFactor(int n, int k) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
			if (count == k) {
				return i;
			}
		}
		return -1;
	}
}
