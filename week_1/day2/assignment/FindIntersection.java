package week1.day2.assignment;

public class FindIntersection
{
    public static void main(final String[] args) {
        final int[] A1 = { 1, 2, 8, 4, 9, 7 };
        final int[] A2 = { 3, 2, 11, 4, 6, 7 };
        System.out.println("Intersection of two arrays is :");
        for (int i = 0; i < A1.length; ++i) {
            for (int j = 0; j < A2.length; ++j) {
                if (A1[i] == A2[j]) {
                    System.out.println(A2[j]);
                }
            }
        }
    }
}