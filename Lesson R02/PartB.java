public class PartB {

    public static void main(String[] args) {
        String input1 = "Madam, Im Adam";
        String input2 = "Kayak";

        System.out.println("\"" + input1 + "\" is palindrome? " + isPalindrome(cleanString(input1)));
        System.out.println("\"" + input2 + "\" is palindrome? " + isPalindrome(cleanString(input2)));
    }

    public static String cleanString(String str) {
        return str.toLowerCase().replaceAll("[^a-z]", "");
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
