package algoexpert;


/// Two number Sum
//Write a function that takes in a non-empty array of distinct integers and an
//  integer representing a target sum. If any two numbers in the input array sum
//up to the target sum, the function should return them in an array, in any
// order. If no two numbers sum up to the target sum, the function should return
//an empty array.

// Note that the target sum has to be obtained by summing two different integers
//in the array; you can't add a single integer to itself in order to obtain the
//target sum.

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println(array[i]);
                    System.out.println(array[j]);
                    return new int[]{array[i], array[j]};
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 11, 1, -1, 6, 8, 7};
        int target = 10;
        twoNumberSum(array, target);
    }
}

