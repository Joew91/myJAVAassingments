public class CountVowels {
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
