import java.util.Arrays;


public class anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if (Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray()) && str1.length() == str2.length()) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

}