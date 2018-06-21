package co.simplon.camelcase;

public class CamelCase {

	public static String camelCase(String str) {
		String camelCaseString = "";
		if(str != null && str.length() > 0) {
			String[] words = str.split(" ");
			for (String word : words) {
				camelCaseString += upperCaseWordOnFirstLetter(word);
			}
		}
		return camelCaseString;
	}
	
	private static String upperCaseWordOnFirstLetter(String word) {
		if (word != null && word.length() > 0)
			return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return "";
	}
}