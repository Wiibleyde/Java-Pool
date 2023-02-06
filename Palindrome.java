public class Palindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            Character curString = s.charAt(i);
            Character lasCharacter = s.charAt(n - i - 1);
            if (curString.toUpperCase(0) != lasCharacter.toUpperCase(0)) {
               return false;
            }
        }
        return true;
    }
}