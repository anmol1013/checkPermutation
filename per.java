public class S {

	public static String removeConsecutiveDuplicates(String str) {
        String output = "";
        int startIndex = 0;
        while (startIndex < str.length()) {
            char uniqueCharacter = str.charAt(startIndex);
            int uniqCharNextIndex = startIndex + 1;
            while (uniqCharNextIndex < str.length() && str.charAt(uniqCharNextIndex) == uniqueCharacter) {
                uniqCharNextIndex++;
            }
            output += uniqueCharacter;
            startIndex = uniqCharNextIndex;
        }
        return output;
    }

}
