package kata;
import java.util.List;
/**
 * Created by callie on 4/30/16.
 */
public class ListToString {
	public static final String listToString(List<String> convertToString) {
		String convertedString = "";
		for (String s : convertToString) {
			convertedString += s;
		}
		return convertedString;
	}
}

