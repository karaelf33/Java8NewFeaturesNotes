package streamExample;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntTest {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);

        IntStream intStream = s1.mapToInt(t -> t * t);
        intStream.forEach(System.out::println);
        System.out.println("************");
        Stream<String> s2=Stream.of("1","2","3","4","5","6");
        IntStream stream=s2.mapToInt(Integer::parseInt);
        stream.forEach(System.out::println);
    }
}
