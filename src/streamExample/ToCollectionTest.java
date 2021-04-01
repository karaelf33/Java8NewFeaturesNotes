package streamExample;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionTest {

    public static void main(String[] args) {
        Stream<String> s1=Stream.of("lions","tigers","bears");
        TreeSet<String> result=s1.filter(s->s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
        result.forEach(System.out::println);;
    }
}
