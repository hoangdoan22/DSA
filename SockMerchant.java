package HomeworkDSday2;

import java.util.HashMap;

public class SockMerchant {
	public static void main(String[] args) {
		int n = 9;
		int[] array = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("The number of pairs : " + sockMerchant(array));

	}

	public static int sockMerchant(int[] array) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i : array) {
			if (hashmap.containsKey(i) == false) {
				hashmap.put(i, 1);
			} else {
				int countAppear = hashmap.get(i);
				countAppear++;
				hashmap.put(i, countAppear);
			}
		}
		int count = 0;
		for (int value : hashmap.values()) {
			if (value >= 2) {
				count += value / 2;
			}
		}
		return count;
	}
}
