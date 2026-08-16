import java.util.Arrays;


public class anagram {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        if (Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray())) {
            return true;
        } else {
            return false;
        }
        

    }
}