
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String resultStr = baseValue + valueToBeAdded;
        return resultStr;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String s = "";
        for (int i = valueToBeReversed.length() - 1; i >= 0; i--) {
            s += valueToBeReversed.charAt(i);
        }
        return s;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char c;
        if (word.length() % 2 == 0) {
            c = word.charAt((word.length()/2 - 1));
        } else {
            c = word.charAt((word.length()-1)/2);
        }
        return c;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == charToRemove) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] newString = sentence.split(" ");
        return newString[newString.length - 1];
    }
}
