import java.util.Arrays;

public class LongestWord {

    public static String longestWord(String sen) {
        String onlyLetters = "";
        for (char c : sen.toCharArray()) {
            if (Character.isLetter(c) || c == ' ') {
                onlyLetters += c;
            }
        }
        String[] words = onlyLetters.split("\s");
        String longest = words[0];
        for (String s : words) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }


    public static String longestWord1(String sen) {
        String longest = "";
        String[] words = sen.replaceAll("[^a-zA-Z]"," ").split(" ");
        for(String s: words){
            if (s.length() > longest.length()) longest = s;
        }
        return longest;
    }
    public static void main(String[] args) {
        String test = "fun&! !  time";
        String test1 = "I love dogs";
        System.out.println(longestWord1(test));
    }

}
