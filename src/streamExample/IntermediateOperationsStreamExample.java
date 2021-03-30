package streamExample;

import java.util.stream.Stream;

public class IntermediateOperationsStreamExample {
    public static void main(String[] args) {

        //peek metıdu intermaiate operationdur.
        // layz olarak çalışır.yani terminal operation yoksa bu çalışmaz.
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).peek(System.out::println);
        //count metodu bir terminal operationdur.
        //bir stream üzerinde terminal operation calıstıktan sonra bir başka terminal operation cagıramayız.
        stream.count();
    }
}
