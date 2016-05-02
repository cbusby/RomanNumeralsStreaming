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
}

