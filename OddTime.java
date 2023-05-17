package HomeworkDSday2;

import java.util.ArrayList;
import java.util.HashMap;

public class OddTime {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 3, 1, 5, 2 };
		System.out.println(findOddTimesAppearNum(array));
	}

	private static ArrayList<Integer> findOddTimesAppearNum(int[] array) {
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		ArrayList<Integer> oddTimes = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (hashmap.containsKey(array[i])) {
				int value = hashmap.get(array[i]);
				hashmap.put(array[i], value + 1);
			} else
				hashmap.put(array[i], 1);
		}

		for (int key : hashmap.keySet()) {

			if (hashmap.get(key) % 2 != 0) {
				oddTimes.add(key);
			}
		}
		return oddTimes;

	}
}
