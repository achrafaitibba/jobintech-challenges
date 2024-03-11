import java.io.FilterOutputStream;

public class LetterChanges {
    public static boolean isVowel(char c) {
        boolean is = false;
        String vowels = "aeiou";
        for (char ch : vowels.toCharArray()) {
            if (c == ch) is = true;
        }
        return is;
    }



    public static String letterChange(String str) {
        String newStr = "";
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'z' || c == 'Z') {
                    newStr += 'A';
                } else {
                    int asciiOrder = c + 1;
                    if (isVowel((char) asciiOrder)) {
                        newStr += (char) Character.toUpperCase(asciiOrder);
                    } else newStr += (char) asciiOrder;
                }
            } else {
                newStr += c;
            }
        }
        return newStr;
    }

    public static String letterChanges(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'z' || str.charAt(i) == 'Z') {
                    newStr += 'A';
                } else {
                    if (isVowel((char) (str.charAt(i) + 1))) {
                        newStr += Character.toUpperCase((char) (str.charAt(i) + 1));
                    } else newStr += (char) (str.charAt(i) + 1);
                }
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }


    public static void main(String[] args) {
        String test = "fun times!";
        System.out.println(letterChange(test));
        System.out.println(letterChanges(test));
        System.out.println(isVowel('s'));
    }

}
