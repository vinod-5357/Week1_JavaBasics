package week1.day2.assignment;

public class RemoveDuplicates
{
    public static void main(final String[] args) {
        final String input = "SEELLENIUUM";
        String output = "";
        for (int index = 0; index < input.length(); ++index) {
            if (input.charAt(index % input.length()) != input.charAt((index + 1) % input.length())) {
                output = String.valueOf(output) + input.charAt(index);
            }
        }
        System.out.println(output);
    }
}