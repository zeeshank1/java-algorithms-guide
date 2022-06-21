package algorithms.pattern_searching;

import java.util.Arrays;

public class NaivePatternSearchingAdvance {

    private static int[] naivePatternSearch(String textString, String pattern) {

        int textStringLength = textString.length();
        int patternLength = pattern.length();
        int[] resultIndexes = new int[textStringLength];
        int indexCounter = 0;

        for (int i = 0; i <= textStringLength - patternLength; i++) {

            if (textString.charAt(i) == pattern.charAt(0)) {
                for (int j = 0; j < patternLength; j++) {
                    if (textString.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                    if (j == patternLength - 1) {
                        resultIndexes[indexCounter] = i;
                        indexCounter++;
                    }
                }
            }
        }

        return resultIndexes;
    }

    public static void main(String[] args) {
        String textString = "AABACCBBAAFF";
        String pattern = "AA";
        int[] resultIndexes = naivePatternSearch(textString, pattern);
        Arrays.stream(resultIndexes).forEach(value -> {
                System.out.println(value);
        });
    }
}
