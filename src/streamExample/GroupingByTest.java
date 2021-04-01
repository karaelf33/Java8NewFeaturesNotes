package streamExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    public static void main(String[] args) {
        Stream<String> s1=Stream.of("lions","tigers","bears","bird","horse","turtle","cat","cat","dog");
        Map<Integer, List<String>> map=s1.collect(Collectors.groupingBy(String::length));

        System.out.println(map);

    }
}
