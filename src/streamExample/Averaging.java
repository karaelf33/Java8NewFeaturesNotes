package streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Averaging {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,11);
        Double d=list.stream().collect(Collectors.averagingDouble(x->x));
        System.out.println(d);
    }
}
