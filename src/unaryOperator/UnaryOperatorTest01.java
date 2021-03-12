package unaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class  UnaryOperatorTest01 {
    public static void main(String[] args) {
        List<Integer> ell= Arrays.asList(-11,22,33,12432,432,342);
        System.out.println("Before"+ell);
        ell.replaceAll(Math::abs);
        System.out.println("Afrer:"+ell);


        ///--------->>>>>>>>>

        Function<Integer,Integer> f1=Math::abs;
        IntFunction<Integer> f2=Math::abs;
        UnaryOperator<Integer> f3=Math::abs;

        ell.replaceAll(f3);
        System.out.println("After:"+ell);
    }
}
