package streamExample;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionByTest {

    public static void main(String[] args) {
        Stream<String> s1=Stream.of("lions","tigers","bears","bird","horse","turtle","cat","cat","dog");
        Predicate<String> p1=s->s.length()<5;
        Map<Boolean, List<String>> map=s1.collect(Collectors.partitioningBy(p1));
        System.out.println(map);

    }
}
