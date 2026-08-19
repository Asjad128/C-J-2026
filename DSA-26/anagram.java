

public class anagram {

    static boolean are_anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] frequency = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i) - 'a']++;
            frequency[str2.charAt(i) - 'a']--;
        }
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str1 = "silentc";
        String str2 = "litenw";

        if (are_anagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

}