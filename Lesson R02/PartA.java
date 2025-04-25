public class PartA {

    public static void main(String[] args) {
        String input1 = "Madam, I’m Adam";
        String input2 = "Kayak";

        System.out.println("\"" + input1 + "\" is palindrome? " + isPalindrome(cleanString(input1)));
        System.out.println("\"" + input2 + "\" is palindrome? " + isPalindrome(cleanString(input2)));
    }

    public static String cleanString(String str) {
        return str.toLowerCase().replaceAll("[^a-z]", "");
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
