package streamExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<String> zero= Arrays.asList();
        List<String> one=Arrays.asList("me");
        List<String> two=Arrays.asList("we");
        Stream<List<String>> person=Stream.of(zero,one,two);

        person.flatMap(Collection::stream).forEach(System.out::print);

        System.out.println("------");

        List<Integer[]> listArray=Arrays.asList(new Integer[]{1,2,3,4},new Integer[]{5,6});
        listArray.stream().flatMap(array->Arrays.stream(array)).map(i->i*i+",").forEach(System.out::print);


        // sorted--------
        System.out.println("sorted");

        Stream<String> stream=Stream.of("brown","bear","asdads","aaaaabbcc","-aaaabbbb");
        stream.sorted().forEach(System.out::println);


    }
}
