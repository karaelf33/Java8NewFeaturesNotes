package streamExample;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterTest01 {

    public static void main(String[] args) {
        Stream<String> s1=Stream.of("ahmet","ali","yuusf","ayse","çağla");
        s1.filter(x->x.startsWith("y")).forEach(System.out::println);

        Predicate<String> predicate=(x)->x.startsWith("ç");
        System.out.println(predicate.toString());
    }
}
