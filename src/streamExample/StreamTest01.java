package streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {

    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,16);
        System.out.println(intStream);

        IntStream.iterate(1,i->i+1).limit(100);

        List<String> list= Arrays.asList("a","b","c");
        Stream<String> stringStream=list.stream();
        Stream<String> stringStream1=list.parallelStream();
        stringStream.collect(Collectors.joining());
        stringStream1.collect(Collectors.joining());

        //-----

        new Random().ints().limit(5).forEach(System.out::println);
        System.out.println("**********");
        Stream<String> stream= Pattern.compile(" ").splitAsStream("java 8 stream test");
        stream.forEach(System.out::println);

        System.out.println("-----------------");
        Stream.of(1,2,3,4,5).peek(i-> System.out.println(i+" ")).count() ;


    }
}


//Stream source ->Examples: IntStream.range(),Arrays.Stream()
//Intermedate opertaions->Examples :map(),filter(),distinct(),sorted(),
//Terminal opertaion ->Examples:sum(),collect(),forEach(),reduce()