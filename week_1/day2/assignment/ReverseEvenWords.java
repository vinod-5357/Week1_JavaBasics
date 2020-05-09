package week1.day2.assignment;

public class ReverseEvenWords
{
    public static void main(final String[] args) {
        final String sentence = "I am a software tester";
        System.out.println(specialReverse(sentence));
    }
    
    public static String specialReverse(final String sentence) {
        String result = "";
        final String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; ++i) {
            if (i % 2 == 1) {
                result = String.valueOf(result) + " " + reverse(words[i]);
            }
            else {
                result = String.valueOf(result) + " " + words[i];
            }
        }
        return result;
    }
    
    public static String reverse(final String word) {
        return new StringBuilder(word).reverse().toString();
    }
}