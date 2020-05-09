package week1.day2.classroom;

import java.util.*;

public class FindSecondLargest
{
    public static void main(final String[] args) {
        final int[] num = { 3, 2, 11, 4, 6, 7 };
        Arrays.sort(num);
        System.out.println("The second largest number is :" + num[num.length - 2]);
    }
}