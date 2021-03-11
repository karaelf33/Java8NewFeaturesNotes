package PrimitivePredicate;

import java.util.stream.IntStream;

public class PrimitivePredicate {
    public static void main(String[] args) {
        IntStream.range(1,21).filter(i->(i%2==0)).forEach(System.out::println);


    }
}
