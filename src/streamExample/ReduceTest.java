package streamExample;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTest {

    public static void main(String[] args) {
        String[] array=new String[]{"w","o","l","f"};

        StringBuilder result= new StringBuilder();

        for (String s:array){
            result.append(s);
;        }
        System.out.println(result);
        // with reduce

        Stream<String> s1=Stream.of("w","o","l","f");
        BinaryOperator<String> bo=(String str,String str2)->str+str2;
        Optional<String> optionalS=s1.reduce(bo);
        System.out.println(optionalS.get());
    }
}
