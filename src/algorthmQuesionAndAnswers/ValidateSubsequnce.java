package algorthmQuesionAndAnswers;

import java.util.*;
//      Validate Subsequence
//
//        Given two non-empty arrays of integers, write a function that determines
//        whether the second array is a subsequence of the first one.
//
//        A subsequence of an array is a set of numbers that aren't necessarily adjacent
//        in the array but that are in the same order as they appear in the array. For
//        instance, the numbers [1, 3, 4]  form a subsequence of the array [1, 2, 3, 4]
//        , and so do the numbers <span>[2, 4]</span>
//        . Note
//        that a single number in an array and the array itself are both valid
//        subsequences of the array.
//
//        Sample Input
//        array = [5, 1, 22, 25, 6, -1, 8, 10]
//        sequence= = [1, 6, -1, 10]

public class ValidateSubsequnce {

    public static boolean isValidSubSequence(List<Integer> array, List<Integer> sequence) {
        int point = 0;
        for (int i = 0; i < array.size(); i++) {
            if (sequence.get(point).equals(array.get(i))) {
                point++;
            }
        }
        if (point == sequence.size()) return true;
        return false;
    }

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);
        sequence.add(9);
        System.out.println(isValidSubSequence(array, sequence));

    }
}




