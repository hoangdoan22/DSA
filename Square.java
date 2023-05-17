package HomeworkDSday2;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of test cases : ");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Input a : ");
			int a = sc.nextInt();
			System.out.println("Input b : ");
			int b = sc.nextInt();
			System.out.println("The number of square integers : " + countSquareIntegers(a, b));
		}
	}

	public static int countSquareIntegers(int a, int b) {
		int count = 0;
		for (int i = (int) Math.sqrt(a); i <= (int) Math.sqrt(b); i++) {
			if (i * i >= a && i * i <= b) {
				count++;
			}
		}
		return count;

	}
}
