

public class anagram {
    public static void main(String[] args) {
        String str1 = "silentc";
        String str2 = "litenw";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        int weight=0;
        for (int i = 0; i < str1.length(); i++) {
            weight += str1.charAt(i) - str2.charAt(i);
        }
        if (weight == 0) {
            System.out.println("Anagrams");
        } else {    
            System.out.println("Not anagrams");
        }
    }

}