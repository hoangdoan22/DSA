package HomeworkDSday2;

import java.util.ArrayList;

public class Candles {
	public static void main(String[] args) {
		ArrayList<Integer> candles = new ArrayList<Integer>();
		candles.add(4);
		candles.add(4);
		candles.add(1);
		candles.add(3);
		candles.add(4);
		System.out.println("The number of tallest candles: " + birthdayCakeCandles(candles));
	}

	public static int birthdayCakeCandles(ArrayList<Integer> candles) {
		int size = candles.size();
		int tallest = candles.get(0);
		int count = 1;

		for (int i = 1; i < size; i++) {
			int height = candles.get(i);
			if (height > tallest) {
				tallest = height;
			} else if (height == tallest) {
				count++;
			}
		}
		return count;
	}
}
