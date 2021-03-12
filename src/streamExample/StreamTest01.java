package streamExample;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {

    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,16);
        System.out.println(intStream);

        IntStream.iterate(1,i->i+1).limit(100);
    }
}


//Stream source ->Examples: IntStream.range(),Arrays.Stream()
//Intermedate opertaions->Examples :map(),filter(),distinct(),sorted(),
//Terminal opertaion ->Examples:sum(),collect(),forEach(),reduce()