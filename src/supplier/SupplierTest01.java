package supplier;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {

    public static void main(String[] args) {

        Random random=new Random();

        Supplier<Integer> supplier=random::nextInt;

        System.out.println(supplier.get());
        //nextInt metodu static değil,bu case direkt sınıfismi:: methodIsmi seklinde kullanmalıyız

        Stream.generate(supplier).limit(10).forEach(System.out::println);

        //---

        Supplier<LocalDate> supplier1=LocalDate::now;
        Supplier<LocalDate> supplier2=()->LocalDate.now();
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

    }
}
