package dateApi;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDateTest {

    public static void main(String[] args) {

        Date date=new Date();

        // LocalDate localDate=new LocalDate(); can not use  it like this cuz constructor is private
        //LocalDate objeleri immutuble dir

        LocalDate localDate= LocalDate.now();
        System.out.println(date);
        System.out.println(localDate);

        LocalDate date1=LocalDate.of(2015,4,20);
        LocalDate date2=LocalDate.of(2018, Month.FEBRUARY,10);
        System.out.println(date1);
        System.out.println(date2);

        //
        LocalDate localDate1=LocalDate.now();
        int dayOfYear=localDate1.getDayOfYear();
        int dayOfMonth=localDate1.getDayOfMonth();
        Month m=localDate1.getMonth();
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);
        System.out.println(m);

    }
}
