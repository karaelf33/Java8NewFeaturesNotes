package algorthmQuesionAndAnswers;

public class MaxIntInArray {
    public static int maxIntInArray(int[] array){
      int max=array[0];
      for (int i=1;i<array.length;i++){
          if (array[i]>max){
              max=array[i];
          }
      }
      return max;
    }
    public static void main(String[] args) {
        int[] array={123,2,3,4,5,6,7,89,1,2};
        System.out.println(maxIntInArray(array));;
    }
}
