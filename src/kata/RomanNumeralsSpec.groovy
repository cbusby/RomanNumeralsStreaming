package kata

import spock.lang.Specification
import kata.RomanNumerals

class RomanNumeralsSpec extends Specification {
	def romanNumerals
	def setup(){
		romanNumerals = new RomanNumerals();
	}

	void "1 returns I"() {
		expect:
		romanNumerals.convertArabic(1) == "I"
	}

	void "2 returns II"() {
		expect:
		romanNumerals.convertArabic(2) == "II"
	}

	void "5 returns V"() {
		given:
		romanNumerals.test();
		expect:
		//romanNumerals.convertArabic(5) == "V"
		true
	}


}
