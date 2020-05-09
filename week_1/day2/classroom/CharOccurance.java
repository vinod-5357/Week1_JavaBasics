package week1.day2.classroom;

public class CharOccurance
{
    public static void main(final String[] args) {
        final String str = "Independence";
        final char[] charArray = str.toCharArray();
        final int sz = charArray.length;
        int i = 0;
        int j = 0;
        int count = 0;
        for (i = 0; i < sz; ++i) {
            count = 0;
            for (j = 0; j < sz && (j >= i || charArray[i] != charArray[j]); ++j) {
                if (charArray[i] == charArray[j]) {
                    ++count;
                }
                if (j == sz - 1) {
                    System.out.println("the charcter " + charArray[i] + " " + "is present" + " " + count + " " + "times");
                }
            }
        }
    }
}