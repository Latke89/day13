package tiy.pink;

/**
 * Created by Brett on 8/24/16.
 */
public class StringReverser {
	public String reverseString(String stringToReverse) {
		char[] stringChar = stringToReverse.toCharArray();
		String reversedString = "";
		for (int charIndex = stringChar.length - 1; charIndex >= 0; charIndex--) {
			System.out.print(stringChar[charIndex]);
			reversedString += stringChar[charIndex];
		}
		return reversedString;
	}

}
