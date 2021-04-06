package dateApi;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1=LocalTime.now();
        localTime1=localTime.plusHours(3).plusMinutes(40);
        System.out.println(localTime1);
    }
}
