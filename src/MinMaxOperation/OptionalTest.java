package MinMaxOperation;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {
        Stream<String> animalStream=Stream.of("dog","monkey","horsel");
        Stream<String> animalStream2=Stream.of("dog","monkey","horsell ");

        Comparator<String> comparator=(String s1,String s2)->s1.length()-s2.length();

        Optional<String> minLenghtElement=animalStream.min(comparator);
        System.out.println(minLenghtElement);

        Optional<String> maxLenghtElement=animalStream2.max(comparator);
        System.out.println(maxLenghtElement);
    }
}
