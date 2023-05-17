package HomeworkDSday2;

import java.util.HashMap;

public class OddTime {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 3, 1 };
		System.out.println(findOddTimesAppearNum(array));
	}

	private static int findOddTimesAppearNum(int[] array) {
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (hashmap.containsKey(array[i])) {
				int value = hashmap.get(array[i]);
				hashmap.put(array[i], value + 1);
			} else
				hashmap.put(array[i], 1);
		}
		int count = 0;
		for (int key : hashmap.keySet()) {

			if (hashmap.get(key) % 2 != 0) {
				count++;
			}
		}
		return count;

	}
}
