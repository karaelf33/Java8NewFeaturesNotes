package bubbleSort;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int[] array = {1,111,12,78,99,15,999,3,5,95};
        booubleSorty(array);

        for (int i: array
             ) {
            System.out.println(i);
        }
    }

    public static int[] booubleSorty(int[] arraylist){
        boolean isSorted = true;
        for (int i=0;i<arraylist.length-1;i++){
            if (arraylist[i]>arraylist[i+1]){
                int temp=arraylist[i];
                arraylist[i]=arraylist[i+1];
                arraylist[i+1] =temp;
                isSorted=false;
            }
        }
        return isSorted? arraylist : booubleSorty(arraylist);
    }
}
