package kata;

import java.util.*;
import java.util.stream.Collectors;

public class RomanNumerals {

	public String convertArabic(int arabicVal) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(arabicVal);

		List<String> ones =
				numbers.stream()
						.filter(n -> {
							return n < 4;
						})
						.map(n -> {

								return "I";

						})
						.collect(Collectors.toList());

		List<String> fives =
				numbers.stream()
						.filter(n -> {
							return n % 5 == 0;
						})
						.map(n -> {
							return "V";
						})
						.collect(Collectors.toList());

		List<String> romans = new ArrayList<String>();
		romans.addAll(fives);
		romans.addAll(ones);


		return ListToString.listToString(romans);
	}

	public void test() {
		Map<Integer, String> romanConvert = new HashMap<>();

		for (int i = 1; i < 1000; i++) {
			String temp = "";
			int v = 111111;
			if (i > 4){
				temp += "V";

				v = i - 5;
			}
			romanConvert.put(i, temp);
			if (i < 4 || v < 4){

				for (int z = 1; z <= i; z++) {
					temp += "I";
				}
				romanConvert.put(i, temp);
			}
		}
		System.out.println(romanConvert.get(3).toString());
		System.out.println(romanConvert.get(5).toString());
		System.out.println(romanConvert.get(6).toString());
	}
}

