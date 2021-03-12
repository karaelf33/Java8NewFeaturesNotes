package function;

import java.util.function.BiFunction;

public class BiFunctionTest01 {

    public static void main(String[] args) {
        BiFunction<String,String,String> concat= String::concat;
        BiFunction<String,String,String> concat2=(String x,String y)->x+"arayabengirdim"+y ;
        System.out.println(concat.apply("dfsf","fdsfsd"));
        System.out.println(concat2.apply("dfsf","fdsfsd"));
    }
}
