package streamExample;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("horse", "dog", "bird", "monkey", "cat");
        Stream<String> s2 = Stream.of("horse", "dog", "bird", "monkey", "cat", "cat", "horse");
        System.out.println(s1.toString());
        List<String> stringList = s1.collect(Collectors.toList());
        Set<String> stringSet = s2.collect(Collectors.toSet());
        System.out.println(stringList);
        System.out.println("-------");
        System.out.println(stringSet);
        // ------------------

        Stream<String> s3=Stream.of("ehm","dfs","sfd","dsdf","wep");
        s3.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

    }
}
