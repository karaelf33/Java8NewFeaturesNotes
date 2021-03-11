package Predicate;

import java.util.Arrays;
import java.util.stream.Stream;

public class PredicatesTest01 {

    public static void main(String[] args) {
        Stream.of("hello", "word", "hey", "mamav")
                .filter(str -> str.startsWith("h"))
                .forEach(System.out::println);

        ///-------------
        int[] arrays = {2, 3, 4, 53, 63, 4, 645};
        Arrays.stream(arrays).filter(i -> i % 10 == 3).forEach(System.out::println);
        System.out.println(Arrays.stream(arrays).count());

    }

}
