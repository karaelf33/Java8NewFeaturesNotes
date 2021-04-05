package dateApi;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest {

    public static void main(String[] args) {

        Date date=new Date();

        // LocalDate localDate=new LocalDate(); can not use  it like this cuz constructor is private

        LocalDate localDate= LocalDate.now();
        System.out.println(date);
        System.out.println(localDate);

        LocalDate date1=LocalDate.of(2015,4,20);
        LocalDate date2=LocalDate.of(2018, Month.FEBRUARY,10);
        System.out.println(date1);
        System.out.println(date2);

    }
}
