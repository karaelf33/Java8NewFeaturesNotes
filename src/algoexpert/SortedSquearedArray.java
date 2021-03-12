package algoexpert;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SortedSquearedArray {

    public static int[] sortedSquaredArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = -array[i];
            array[i] = (int) Math.pow(array[i], 2);
        }
         return  bubbleSortFun(array);
    }
    public static int[] bubbleSortFun(int[] array1){
        boolean isSorted = true;
        for (int y = 0; y < array1.length - 1; y++) {
            if (array1[y]>array1[y+1]){
                int temp = array1[y];
                array1[y] = array1[y + 1];
                array1[y + 1] = temp;
                isSorted = false;
            }
        }
        return isSorted ? array1 : sortedSquaredArray(array1);
    }
    public static void main(String[] args) {
        int[] array = {8, 7,3,2};
           sortedSquaredArray(array);
        for (int i: array
        ) {
            System.out.println(i);
        }
    }
}
//
//Sorted Squared Array
//
//        Write a function that takes in a non-empty array of integers that are sorted
//        in ascending order and returns a new array of the same length with the squares
//        of the original integers also sorted in ascending order.
//Sample Input
//
//array=[1, 4, 9, 25, 36, 64, 81]
//Sample Output
//        [1, 4, 9, 25, 36, 64, 81]