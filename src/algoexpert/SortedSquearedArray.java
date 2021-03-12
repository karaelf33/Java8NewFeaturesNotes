package algoexpert;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SortedSquearedArray {

    public static int[] sortedSquaredArray(int[] array){
        for (int i=0;i<array.length;i++){
            if (array[i]<0) array[i]=-array[i];
             array[i]= (int) Math.pow(array[i],2);
        }
       for (int y=0;y<array.length;y++){

       }
        return array;

    }
    public static void main(String[] args) {
        int[] array = {0,3, 5, -4, 11, 1, -1, 6, 8, 7};
        sortedSquaredArray(array);
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