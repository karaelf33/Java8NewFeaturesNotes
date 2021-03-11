package Predicate;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateTest02 {
    public static void main(String[] args) {
        //Predicate t tipinde alıp boolean döner
        Predicate<String> predicate=String::isEmpty;
        Predicate<String> predicate1=x->x.isEmpty();
        System.out.println(predicate1.test("SDKFSKFDLKA"));

        AtomicInteger integerAtomic=new AtomicInteger(10);

        Supplier<Integer> supplier=integerAtomic::incrementAndGet;
        System.out.println(supplier.get());

    }
}
