public class VowelCounter {
    public static void main(String[] args) {
        String testPhrase = "hello how are you";
        System.out.println("the amount of volumes is: " + CountVowels(testPhrase));

    }

    public static boolean IsVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';

    }

    public static int CountVowels(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (IsVowel(phrase.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
