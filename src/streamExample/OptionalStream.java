package streamExample;

import java.util.Optional;

public class OptionalStream {

    public static void main(String[] args) {

        Optional<String> empty=Optional.empty();
        System.out.println(empty);

        Optional<String> notEmpty=Optional.of("test");
        System.out.println(notEmpty);
        notEmpty.ifPresent(System.out::println);


    }
}
