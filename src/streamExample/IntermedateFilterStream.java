package streamExample;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermedateFilterStream {

    public static void main(String[] args) {

        Stream<String> s1=Stream.of("ahmet","ali","mhum","dsfd","dsfdf");

        Predicate<String> p1=(String str)->str.startsWith("m");
        s1.filter(x->x.startsWith("a")).forEach(System.out::println);

        //------
        System.out.println("***********");
        IntStream.rangeClosed(0,10).filter(i->i%2==0).forEach(System.out::println);

        }
}
