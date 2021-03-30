package streamExample;

import java.util.stream.Stream;

public class StreamMapTeest {

    public static void main(String[] args) {
        Stream.of(1,23,4,5,6,7,8,9,12).map(i->i*2).forEach(System.out::println);
        System.out.println("***********     ");
        Stream<Integer> s=Stream.iterate(1,n->n+1);
        s.skip(5).limit(19).forEach(System.out::println);

    }
}