package algorithms.pattern_searching;

public class NaivePatternSearching {

    private static int naivePatternSearch(String textString, String pattern) {

        int textStringLength = textString.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textStringLength - patternLength; i++) {

            if (textString.charAt(i) == pattern.charAt(0)) {
                for (int j = 0; j < patternLength; j++) {
                    if (textString.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                    if (j == patternLength - 1) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String textString = "AABACCBBAAFF";
        String pattern = "FF";
        System.out.println("Pattern Found at index : " + naivePatternSearch(textString, pattern));
    }
}
