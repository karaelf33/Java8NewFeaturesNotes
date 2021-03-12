package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest01 {

    public static void main(String[] args) {
        List<Integer> asList= Arrays.asList(10,20,30);
        BiPredicate<List<Integer>,Integer> bip=(List<Integer> list,Integer i)->list.contains(i);
//        System.out.println(2,asList);

    }
}
