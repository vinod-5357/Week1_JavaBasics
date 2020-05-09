package week1.day2.classroom;

import java.util.*;

public class MissingElementArray
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        final int n = sc.nextInt();
        final int[] inpuArray = new int[n];
        System.out.println("Enter (n-1) numbers: ");
        for (int i = 0; i <= n - 2; ++i) {
            inpuArray[i] = sc.nextInt();
        }
        final int sumOfAll = n * (n + 1) / 2;
        int sumOfArray = 0;
        for (int j = 0; j <= n - 2; ++j) {
            sumOfArray += inpuArray[j];
        }
        final int missingNumber = sumOfAll - sumOfArray;
        System.out.println("Missing number is: " + missingNumber);
    }
}