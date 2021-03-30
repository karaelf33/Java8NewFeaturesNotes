package streamExample;

import java.util.stream.Stream;

public class IntermediateDistinctTest {

    public static void main(String[] args) {
        Stream<String> s1=Stream.of("e1","e2","e3","e1","e3","e5");
        s1.distinct().forEach(System.out::println);

        System.out.println("----------");
        Stream.of(1,2,3,4,5,12,6,67,7).map(i->i*i).forEach(System.out::println);
    }
}
